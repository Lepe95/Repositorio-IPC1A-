package listas;


	class ExcepcionListaVacia extends RuntimeException {


	   public ExcepcionListaVacia( String nombre )
	   {
	      super( "La lista " + nombre + " esta vacía" );
	   }

	}


class NodoLista {

	   Object dato;    
	   NodoLista proximoNodo;

	   NodoLista( Object objeto ) 
	   { 
	      this( objeto, null ); 
	   }

	   NodoLista( Object objeto, NodoLista nodo )
	   {
	      dato = objeto;    
	      proximoNodo = nodo;  
	   }

	   Object obtenerObjeto() 
	   { 
	      return dato; 
	   }


	   NodoLista obtenerProximo() 
	   { 
	      return proximoNodo; 
	   }

	} 



public class ListaCircularSE {
 private NodoLista primerNodo;
 private String nombre;  

 public ListaCircularSE( String cadena )
 {
    nombre = cadena;
    primerNodo = null;
 }


 public ListaCircularSE() 
 { 
    this( "lista circular simplemente enlazada" ); 
 }  


 public synchronized void insertar( Object elementoAInsertar )
 {
    if ( estaVacio() ) {
       primerNodo = new NodoLista( elementoAInsertar);
       primerNodo.proximoNodo=primerNodo;
    }
    else {
    	 NodoLista ultimoNodo;
    	 NodoLista actual = primerNodo;
    	 while(actual.proximoNodo != primerNodo) {
    	 	actual = actual.proximoNodo;
    	 }
    	 ultimoNodo = actual;
       
       NodoLista desplazado = primerNodo;
       primerNodo = new NodoLista( elementoAInsertar, desplazado );
    	 ultimoNodo.proximoNodo = primerNodo;

    }
 }


 public synchronized Object remover()
    throws ExcepcionListaVacia
 {
    Object elementoARemover = null;


    if ( estaVacio() )
       throw new ExcepcionListaVacia( nombre );


    elementoARemover = primerNodo.dato;  


    if ( primerNodo == primerNodo.proximoNodo )
       primerNodo = null;

    else
    {

     	 NodoLista ultimoNodo;
    	 NodoLista actual = primerNodo;
    	 while(actual.proximoNodo != primerNodo) {
    	 	actual = actual.proximoNodo;
    	 }
    	 ultimoNodo = actual;
    	 	        
       primerNodo = primerNodo.proximoNodo;
       ultimoNodo.proximoNodo=primerNodo;
    }


    return elementoARemover;  
 }


 public synchronized boolean estaVacio()
 { 
    return primerNodo == null; 
 }


 public synchronized void imprimir()
 {
    if ( estaVacio() ) {
       System.out.println( "Vacio " + nombre );
       return;
    }

    System.out.print( "La lista " + nombre + " es: " );

    NodoLista actual = primerNodo;

    
    do {
       System.out.print( actual.dato.toString() + " " );
       actual = actual.proximoNodo;
    } while ( actual != primerNodo );

    System.out.println( "\n" );
 }

}