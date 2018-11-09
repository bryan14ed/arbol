package otroArbol;
import java.util.Scanner;
public class Prueba 
{
	public static void main(String[] args)
	{
		Scanner leer= new Scanner(System.in);
		System.out.print("Teclea una expresion: ");
		String expresion=leer.nextLine();
		String prefija= Convertidor.convertirAPreorden(expresion);
		String postfija= Convertidor.convertirAPostorden(expresion);
		String inorden= Convertidor.convertirAInorden(expresion);
		System.out.print("Postorden: "+postfija+"\n");
		System.out.print("Preorden: "+prefija+"\n");
		System.out.print("inorden: "+inorden+"\n");
		
		}
}
