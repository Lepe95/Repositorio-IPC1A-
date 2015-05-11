package pilascolas;

import java.util.LinkedList;

public class ColaUsandoPilas { 
	private LinkedList pila1; 
	private LinkedList pila2; 
	
	public ColaUsandoPilas() { 
		pila1=new LinkedList(); 
		pila2 = new LinkedList(); 
		} 
	
	public void Copy(LinkedList source,LinkedList dest ) { 
		while(source.Head!=null) { 
			dest.Push(source.Head.Data); 
			source.Head = source.Head.Next; 
			} 
		} 
	
	public void Enqueue(T entry) { 
		pila1.Push(entry); 
		} 
	
	public T Dequeue() { 
		T obj; 
		if (pila2 != null) 
		{ 
			Copy(pila1, pila2); 
			obj = pila2.Pop(); 
			Copy(pila2, pila1); 
			} 
		else { 
			throw new Exception("La pila está vacía"); 
			} 
		
		return obj; 
		} 
	
	public void Display() { 
		pila1.Display();
		} 
	}

