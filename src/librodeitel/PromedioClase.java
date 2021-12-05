package librodeitel;

import java.util.Scanner;

public class PromedioClase {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int total =0;		
		int contadorCalificaciones =0;
		
		System.out.print("escriba las calificaciones o -1 para terminar");
		int calificacion = entrada.nextInt();
				
		while(calificacion!=-1)
		{
			
			total = total+calificacion;
			contadorCalificaciones = contadorCalificaciones+1;
			
			System.out.print("escriba las calificaciones o -1 para terminar");
			calificacion = entrada.nextInt();
			
		}
		if(contadorCalificaciones!=0)
		{
			double promedio = (double)total/contadorCalificaciones;
			

			System.out.printf("%n el total de las %d calificaciones es %d%n", contadorCalificaciones, total);
			System.out.printf("el promedio total de clase es %.2f%n", promedio);
		}
		else 
			System.out.println("No se introdujeron calificaciones");
		
		entrada.close();
		

	}

}
