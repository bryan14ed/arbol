package xD;

import java.util.Scanner;
public class ArbolBinarioOrdenado
{
	 class Nodo
     {
       int info;
       Nodo izq, der;
     }
     Nodo raiz;

     public ArbolBinarioOrdenado() {
         raiz=null;
     }
     
     public void insertar (int info)
     {
         Nodo nuevo;
         nuevo = new Nodo ();
         nuevo.info = info;
         nuevo.izq = null;
         nuevo.der = null;
         if (raiz == null)
             raiz = nuevo;
         else
         {
             Nodo anterior = null, reco;
             reco = raiz;
             while (reco != null)
             {
                 anterior = reco;
                 if (info < reco.info)
                     reco = reco.izq;
                 else
                     reco = reco.der;
             }
             if (info < anterior.info)
                 anterior.izq = nuevo;
             else
                 anterior.der = nuevo;
         }
     }

     private void imprimirPre (Nodo reco)
     {
         if (reco != null)
         {
             System.out.print((char)reco.info + " ");
             imprimirPre (reco.izq);
             imprimirPre (reco.der);
         }
     }

     public void imprimirPre ()
     {
         imprimirPre (raiz);
         System.out.println();
     }

     private void imprimirEntre (Nodo reco)
     {
         if (reco != null)
         {    
             imprimirEntre (reco.izq);
             System.out.print((char)reco.info + " ");
             imprimirEntre (reco.der);
         }
     }

     public void imprimirEntre ()
     {
         imprimirEntre (raiz);
         System.out.println();
     }

     private void imprimirPost (Nodo reco)
     {
         if (reco != null)
         {
             imprimirPost (reco.izq);
             imprimirPost (reco.der);
             System.out.print((char)reco.info + " ");
         }
     }

     public void imprimirPost ()
     {
         imprimirPost (raiz);
         System.out.println();
     }

     public static void main (String [] ar)
     {
         ArbolBinarioOrdenado abo = new ArbolBinarioOrdenado ();
         Scanner leer = new Scanner(System.in);
         String expresion;
         System.out.println("Expresion: ");
         expresion=leer.nextLine();
         for (int i = 0; i < expresion.length(); i++) 
         {
        	 abo.insertar(expresion.charAt(i));
		}
         System.out.println ("Impresion preorden: ");
         abo.imprimirPre ();
         System.out.println ("Impresion entreorden: ");
         abo.imprimirEntre ();
         System.out.println ("Impresion postorden: ");
         abo.imprimirPost ();        
     }     
}
