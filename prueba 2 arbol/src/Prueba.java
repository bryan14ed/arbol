import java.util.Scanner;
public class Prueba {


		public static void main(String args[])
		{
			Scanner leer = new Scanner (System.in);
			Arbol arbol = new Arbol();
			String expresion;
			int tama�o=0;
			System.out.println( "Inserta una expresion: ");
			expresion= leer.nextLine();
			tama�o=expresion.length();
			for (int i = 0; i<tama�o ; i++)
			{
				if(expresion.charAt(i)=='/')
				{
					arbol.insertarNodo(201);
				}else
				{
					if (expresion.charAt(i)=='*')
					{
						arbol.insertarNodo(200);
					} else {
						if (expresion.charAt(i)=='+') 
						{
							arbol.insertarNodo(199);
						} else {
							if (expresion.charAt(i)=='-') {
								arbol.insertarNodo(198);
							} else 
							{
								arbol.insertarNodo(expresion.charAt(i));
							}
						}
					}
				}
			}

			/*System.out.println("\nrecorrido inorden");
			arbol.recorridoInorden();

			System.out.println("\nrecorrido preorden");
			arbol.recorridoPreorden();*/
			
			System.out.println("\nrecorrido postorden");
			arbol.recorridoPosorden();
			
			
		}
}
