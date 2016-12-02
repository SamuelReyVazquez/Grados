


	import java.util.Scanner;
	public class Grados {


	public static void main(String[] args) {
			double c , r , numero1;
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca 1 para pasar de centigrados a Fahranheit o 2 para el contrario");
			numero1=sc.nextDouble();
			if (numero1==1){
			System.out.println("Escribe los grados centigrados " );
			c= sc.nextInt();
			r=32+(9*c/5);
			System.out.println(r);}		
			if(numero1==2){
				System.out.println("Escribe los grados Fahrenheit " );
				c= sc.nextInt();
				r=5*(c-32)/9;
				System.out.println(r);
				}
			else{System.out.println("Tu ere mu tonto");}
}
}

