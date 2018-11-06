
public class Arbol {

	private NodoArbol raiz;

	//contruir un arbol vacio
	public Arbol()
	{
		raiz = null;
	}

	//insertar un nuevo nodo en el arbol de busqueda binaria
	public synchronized void insertarNodo(int valorInsertar)
	{
		if(raiz == null)
			raiz = new NodoArbol(valorInsertar); //crea nodo raiz

		else
			raiz.insertar(valorInsertar); // llama al metodo insertar
	}

	//--------------- EMPESAR EL RECORRIDO EN PREORDEN-----------------------
	public synchronized void recorridoPreorden()
	{
		ayudantePreorden(raiz);
	}
	//metodo recursivo para recorrido en preorden

	private void ayudantePreorden(NodoArbol nodo)
	{
		char c;
		if (nodo == null)
			return;

		c = (char)nodo.datos;
		System.out.print(c + " "); // mostrar datos del nodo
		ayudantePreorden(nodo.nodoizquierdo); //recorre subarbol izquierdo
		ayudantePreorden(nodo.nododerecho); //recorre subarbol derecho
	}

	//--------------EMPEZAR RECORRIDO INORDEN-----------------------------------
	public synchronized void recorridoInorden()
	{
		ayudanteInorden(raiz);
	}

	// metodo recursivo para recorrido inorden

	private void ayudanteInorden(NodoArbol nodo)
	{
		char c;
		if (nodo == null)
			return;

		ayudanteInorden(nodo.nodoizquierdo);
		c = (char)nodo.datos;
		System.out.print(c + " ");
		ayudanteInorden(nodo.nododerecho);
	}

	//-----------------------------EMPEZAR RECORRIDO POSORDEN---------------------------------
	public synchronized void recorridoPosorden()
	{
		ayudantePosorden(raiz);
	}

	//metodo recursivo para recorrido posorden

	private void ayudantePosorden(NodoArbol nodo)
	{
		char c;
		if (nodo == null)
			return;

		ayudantePosorden(nodo.nodoizquierdo);
		ayudantePosorden(nodo.nododerecho);
		c = (char)nodo.datos;
		if(nodo.datos==201)
		{
			System.out.print("/" + " ");
		}else
		{
			if (nodo.datos==200)
			{
				System.out.print("*" + " ");
			} else 
			{
				if (nodo.datos==199) {
					System.out.print("+" + " ");
				} else {
					if (nodo.datos==198) {
						System.out.print("-" + " ");
					} else {
						System.out.print(c+ " ");
					}
				}	
			}
		}
	}


	}

