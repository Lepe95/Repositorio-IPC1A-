import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Random;




public class practica1 {
	
	public static void main (String[]args)
	{
		System.out.println("Bienvenido a la aplicación");
		System.out.println("Ingrese el numeral de la opción que desea elegir");
		System.out.println("1) Rombo de asteriscos.");
		System.out.println("2) Promedio de notas.");
		System.out.println("3) Hora del día.");
		System.out.println("4) Medidas de una figura geométrica.");
		System.out.println("5) Diferencia entre fechas.");
		System.out.println("6) Calculadora.");
		System.out.println("7) Tablas de multiplicar.");
		System.out.println("8) Número aleatorio.");
		System.out.println("9) Conversión de números arábigos a romanos.");
		System.out.println("10) Pirámide de números invertida.");
		System.out.println("11) Números romanos en letras.");
		System.out.println("12) Cadena de asteriscos.");
		System.out.println("13) Adivinar letra.");
		System.out.println("14) Cuadrado de asteriscos.");
		System.out.println("15) Números primos en un rango");
		System.out.println("0) Salir.");
		int op = 0;
		Scanner scan=new Scanner(System.in);
		op = scan.nextInt();
		
		if (op<0 | op>15){
			System.out.println("Opción inválida.");
			practica1.main(null);
		}
		if (op==1){
			for (int i=1;i<6;i++){
				for (int j=0; j<i; j++)
					System.out.print("*");
					System.out.println();
			}
			for (int i=4; i>0; i--){
				for (int j=i; j>0; j--)
					System.out.print("*");
					System.out.println();
			}
			System.out.println("Presione 1 para regresar al menú");
			System.out.println("Presione cualquier numero para salir");
			int menu=0;
			menu = scan.nextInt();
			if (menu==1)
			practica1.main(null);
		}
		
		if (op==2){
			int dat=0;
			int pr=0;
			
			System.out.println("Ingrese 6 notas con números enteros");
				for (int i = 0; i<6; i++){
					dat = scan.nextInt();
					pr+=dat;
				}
				pr/=6;
					if (pr>90)
						System.out.println("Su nota es A");
					if (pr>79 & pr<90)
						System.out.println("Su nota es B");
					if (pr>69 & pr<80)
						System.out.println("Su nota es C");
					if (pr>59 & pr<70)
						System.out.println("Su nota es D");
					if (pr<60)
						System.out.println("Su nota es E");
					System.out.println("Presione 1 para regresar al menú");
					System.out.println("Presione cualquier numero para salir");
					int menu=0;
					menu = scan.nextInt();
					if (menu==1)
					practica1.main(null);	
				
				}
		
		if (op==3){
			String hora;
			System.out.println("Ingrese la hora en formato de 24h. Ejemplo: 20:35");
			hora= scan.next();
			StringTokenizer tokens = new StringTokenizer(hora,":");
			while(tokens.hasMoreTokens()){

				System.out.print(tokens.nextToken());
				
				}
			System.out.println();	
			
			System.out.println("Presione 1 para regresar al menú");
			System.out.println("Presione cualquier numero para salir");
			int menu=0;
			menu = scan.nextInt();
			if (menu==1)
			practica1.main(null);
		}
		
		if (op==4){
			String f;
			double x=0;
			double a=0;
			double p=0;
			double h=0;
			System.out.println("Elija la figura geométrica:");
			System.out.println("c) Circulo");
			System.out.println("u) Cuadrado");
			System.out.println("t) Triángulo equilatero");
			f= scan.next();
			System.out.println("Ingrese X");
			x= scan.nextInt();
			switch (f){
			case "c":
					a=(2*(Math.PI)*x*x);
					p=(2*(Math.PI)*x);
					System.out.println("El area del círculo es "+a);
					System.out.println("El perimetro del círculo es "+p);
					
			case "u":
					a=(x*x);
					p=(4*x);
					System.out.println("El area del cuadrado es "+a);
					System.out.println("El perimetro del cuadrado es "+p);
			
			case "t":
					a=(x*(Math.sqrt((x/2)*(x/2)-(x*x))));
					p=(3*x);
					h=(Math.sqrt((x/2)*(x/2)-(x*x)));
					System.out.println("El area del triangulo es "+a);
					System.out.println("El perimetro del triangulo es "+p);
					System.out.println("La altura del triangulo es "+h);
					
				}
				System.out.println("Presione 1 para regresar al menú");
				System.out.println("Presione cualquier numero para salir");
				int menu=0;
				menu = scan.nextInt();
				if (menu==1)
				practica1.main(null);
		}
		if (op==5){
			int d1=0;
			int d2=0;
			int m1=0;
			int m2=0;
			System.out.println("Ingrese el primer día");
			d1 = scan.nextInt();
			System.out.println("Ingrese el numero del primer mes");
			m1 = scan.nextInt();
			System.out.println("Ingrese el segundo día");
			d2 = scan.nextInt();
			System.out.println("Ingrese el numero del segundo mes");
			m2 = scan.nextInt();
			int dif= ((30*m2)+d2)-((30*m1)+d1);
			if (dif>=0)
				System.out.println("Hay "+dif+" dias de diferencia." );
			else {
				dif+=360;
				System.out.println("Hay "+dif+" dias de diferencia." );
			}
			System.out.println("Presione 1 para regresar al menú");
			System.out.println("Presione cualquier numero para salir");
			int menu=0;
			menu = scan.nextInt();
			if (menu==1)
			practica1.main(null);
			
		}
		
		if (op==6){
			int a=0;
			int b=0;
			int r=0;
			String opera;
			System.out.println("Ingrese el primer valor");
			a= scan.nextInt();
			System.out.println("Ingrese el segundo valor");
			b= scan.nextInt();
			System.out.println("Ingrece el caracter de la operación que desea realizar");
			System.out.println("s) Suma");
			System.out.println("r) Resta");
			System.out.println("m) Producto");
			System.out.println("d) Cociente");
			opera= scan.next();
			switch (opera){
			case "s":
				r=(a+b);
				System.out.println("La suma es: "+r);
			case "r":
				r=(a-b);
				System.out.println("La resta es: "+r);
			case "m":
				r=(a*b);
				System.out.println("El producto es: "+r);
			case "d":
				r=(a/b);
				System.out.println("El cociente es: "+r);
			}
			
			
			System.out.println("Presione 1 para regresar al menú");
			System.out.println("Presione cualquier numero para salir");
			int menu=0;
			menu = scan.nextInt();
			if (menu==1)
			practica1.main(null);	
		}
		
		if (op==7){
			int n=0;
			System.out.println("ingrese el número entre 0 y 10");
			n= scan.nextInt();
			for (int i=10; i>=0; i--)
				System.out.println((n+"x"+i+"=")+ (n*i));
			System.out.println("Presione 1 para regresar al menú");
			System.out.println("Presione cualquier numero para salir");
			int menu=0;
			menu = scan.nextInt();
			if (menu==1)
			practica1.main(null);
		}
		
		if (op==8){
			int min=0;
			int max=0;
			int val=0;
			String Unidad[]={"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};  
		      String Decena[]={"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
			System.out.println("Entre 0 y 100.");
			System.out.println("Ingrese el límite inferior");
			min= scan.nextInt();
			System.out.println("Ingrese el límite superior");
			max= scan.nextInt();
			Random r = new Random();
			val = r.nextInt(max);
			System.out.println(val);
			int uni =val%10;  
		      int dec=(val/10);     
		          if(val>=10){  
		              System.out.println(Decena[dec]+" y "+Unidad[uni]);            
		          }else{  
		              System.out.println(Unidad[uni]);
		          }
			
			System.out.println("Presione 1 para regresar al menú");
			System.out.println("Presione cualquier numero para salir");
			int menu=0;
			menu = scan.nextInt();
			if (menu==1)
			practica1.main(null);
		}
		
		if (op==9){
			String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
		      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		      int n =0;
		      System.out.println("Ingrese un numero entre 1 y 99");  
		      n= scan.nextInt();  
		      int uni=n%10;  
		      int dec=(n/10)%10;     
		          if(n>=10){  
		              System.out.println(Decena[dec]+Unidad[uni]);            
		          }else{  
		              System.out.println(Unidad[uni]);
		          }
		          System.out.println("Presione 1 para regresar al menú");
					System.out.println("Presione cualquier numero para salir");
					int menu=0;
					menu = scan.nextInt();
					if (menu==1)
					practica1.main(null);
		}
		
		if (op==10){
			int dim=0;
			System.out.println("Ingrese la altura de la piramide.");
			dim= scan.nextInt();
			for (int i=1; i<=dim; i++){
				for (int j=i; j<=dim; j++)
					System.out.print(i);
					System.out.println();
						
			
		}
		}
		
		if (op==12){
			String cadena;
			int n=0;
			System.out.println("ingrese una cadena de texto");
			cadena= scan.next();
			n= cadena.length();
				for (int i=0; i<n; i++)
					System.out.print("*");
					System.out.println();
			System.out.println("Presione 1 para regresar al menú");
			System.out.println("Presione cualquier numero para salir");
			int menu=0;
			menu = scan.nextInt();
			if (menu==1)
			practica1.main(null);		
			
		}
		
		if (op==13){
			String l1;
			String l2;
			System.out.println("Jugador 1");
			System.out.println("Ingrese una letra.");
			l1= scan.next();
			System.out.println("Jugador 2");
			System.out.println("Ingrese letras hasta adivinar la letra del jugador 1");
				do{
					l2= scan.next();
					if (l1.compareTo(l2) == 0){
						   System.out.println("Gano.");
						   break;
					}
					else
					if (l1.compareTo(l2) < 0)
						  System.out.println ("Antes");
					else
					if (l1.compareTo(l2) > 0)
						  System.out.println("Después");}
				while (l1 != l2);
				
			System.out.println("Presione 1 para regresar al menú");
			System.out.println("Presione cualquier numero para salir");
			int menu=0;
			menu = scan.nextInt();
			if (menu==1)
			practica1.main(null);
		}
		
		
		if (op==14){
			int num=0;
			System.out.println("Ingrese el lado del cuadrado.");
			num= scan.nextInt();
			
				for (int i=1;i<=num;i++){
				for(int j=1; j<=num; j++){
					if (j==1 || j== num || i==1 ||i == num)
						System.out.print("* ");
					else
						System.out.print("  ");
					
				}
				System.out.println();
				
				}
			System.out.println("Presione 1 para regresar al menú");
			System.out.println("Presione cualquier numero para salir");
			int menu=0;
			menu = scan.nextInt();
			if (menu==1)
			practica1.main(null);
		
		}
		
		if (op==15){
			int i=0;
			int j=0;
			int div=0;
			int raiz=0;
			int lim=0;
			System.out.println("Ingrese un numero limite");
			lim= scan.nextInt();
			 for (i=1;i<lim;i++)    { 
				 div=0; 
				 raiz=(int) Math.sqrt(i);
				 for (j=1;j<=raiz;j++)    { 
					 if (i%j==0)
					 div++;
				 }
				 if (div<=1)
					System.out.println (i);
		}
			 
			 System.out.println("Presione 1 para regresar al menú");
			 System.out.println("Presione cualquier numero para salir");
			 int menu=0;
			 menu = scan.nextInt();
			 if (menu==1)
			 practica1.main(null);
	}
}
}
		






