package listas;

class nodo
{
    int dato;
    nodo next;
    nodo ant;
    nodo(int a)
    {
        this.dato=a;
        this.next=null;
        this.ant=null;
    }
}

public class listasdobles
{
    nodo primero;
    nodo ultimo;
    listasdobles()
    {
        primero=null;
        ultimo=null;
    }
 
    public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
 
    public listasdobles alta(int dat)
    {
        if(estavacio())
        {
            nodo nuevo=new nodo(dat);
            primero=nuevo;
            ultimo=nuevo;
        }
        else
        {
            nodo nuevo=new nodo(dat);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
        return this;
    }
 
 
    public boolean delete(int num)
    {
        nodo anterior=null;
        nodo actual=primero;
        while(actual!=ultimo)
        {
            if(actual.dato==num)
            {
                if(anterior==null)
                {
                    primero=actual.next;
                    primero.ant=null;
                }
                else{
                    anterior.next=actual.next;
                    nodo temporal;
                    temporal=actual.next;
                    temporal.ant=anterior;
                }
                return true;
            }
            anterior=actual;
            actual=actual.next;
        }
        if(num==ultimo.dato)
        {
            ultimo=actual.ant;
            return true;
        }
        return false;
    }
 
        public void imprimir2()
    {
        nodo actual;
        actual=ultimo;
        while(actual!=primero)
        {
            System.out.println(actual.dato);
            actual=actual.ant;
        }
                System.out.println(actual.dato);
 
    }
        public void imprimir()
    {
        nodo actual;
        actual=primero;
        while(actual!=ultimo)
        {
            System.out.println(actual.dato);
            actual=actual.next;
        }
                System.out.println(actual.dato);
                 
    }
        
        
        
        public class Main {    
            public static void main(String[] args) {
               int b=5;
               int c=10;
               int d=15;
               int e=20;
               int f=25;
               listasdobles a=new listasdobles();
               a.alta(b);
               a.alta(c);
               a.alta(d);
               a.alta(e);
               a.alta(f);
               a.imprimir2();
               a.delete(25);
               a.imprimir2();
            }
        }
}
