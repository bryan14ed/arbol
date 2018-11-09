package otroArbol;

public class Convertidor 
{
  public static String convertirAPostorden(String expresion)
	{
		String postfija= "";
		PilaE pila= new PilaE(50);

		for (int i=0; i<expresion.length(); i++)
		{
		char letra= expresion.charAt(i);
			if (esOperador(letra))
			{
				if (pila.vacia())
				{
						pila.push(letra);
				} else
				{
					int prioridadexp= prioridadExp(letra);
					int prioridadpila= prioridadPila((char)pila.getTope());
					if (prioridadexp > prioridadpila){
						pila.push(letra);
					} else 
					{
						postfija += pila.pop();
						pila.push(letra);
					}
				}
		}else
		postfija += letra;
		}
		while (!pila.vacia())
			{
			postfija += pila.pop();
			}
		return postfija;
	}
  
  
  public static String convertirAInorden(String expresion)
	{
		String Inorden= "";
		PilaE pila= new PilaE(50);

		for (int i=expresion.length()-1; i>=0; i--)
		{
		char letra= expresion.charAt(i);
			
				if (pila.vacia())
				{
						pila.push(letra);
				} else
				{
						pila.push(letra);
				}
		}
		while (!pila.vacia())
			{
			Inorden += pila.pop();
			}
		return Inorden;
	}
  
  
	public static String convertirAPreorden(String expresion)
		{
			String prefija= "";
			String invertida="";
			PilaE pila= new PilaE(50);
			for (int i = expresion.length()-1; i > -1; i--)
			{
				char letra= expresion.charAt(i);
				if (esOperador(letra))
				{
					if (pila.vacia())
					{
							pila.push(letra);
					} 
					else
					{
						int prioridadexp= prioridadExp(letra);
						int prioridadpila= prioridadPila((char)pila.getTope());
						if (prioridadexp > prioridadpila)
						{
							pila.push(letra);
						} 
						else 
						{
							prefija += pila.pop();
							pila.push(letra);
						}
					}		
				}else
					prefija += letra;
			}
			while (!pila.vacia())
			{
				prefija += pila.pop();
			}

		for (int r=prefija.length()-1; r>=0;r--)
		invertida += prefija.charAt(r);
		return invertida;
		}

		public static int prioridadExp(char x)
		{
		if (x == '*' || x == '/') return 2;
		if (x == '+' || x == '-') return 1;
		return 0;
		}

		public static int prioridadPila(char x)
		{
		if (x == '*' || x == '/') return 2;
		if (x == '+' || x == '-') return 1;
		return 0;
		}

		public static boolean esOperador(char letra)
		{
		if (letra == '*' || letra == '/' || letra == '+' || letra == '-')
		{
		return true;
		}
		else
		return false;
		}
}
