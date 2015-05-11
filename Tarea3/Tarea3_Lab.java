import java.util.Scanner;


public class Tarea3_Lab {
	public static void main(String[]args){
		int n=0;
		System.out.println("Ingrese un número");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int r=n%2;
		if (r==0){
			System.out.println(n + " es par.");
		}else{ 
			System.out.println(n + " es impar.");
	
			}		
	}

}
