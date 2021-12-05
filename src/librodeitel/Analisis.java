package librodeitel;

import java.util.Scanner;

public class Analisis {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int aprobados =0;
		int reprobados = 0;
		int contadorEstudiantes =1;
		
		while(contadorEstudiantes<=10) {
			System.out.print("escriba el resultado (1 = aprobado, 2 = reprobado): ");
			int resultado = entrada.nextInt();
			
			if(resultado == 1)
				aprobados +=1;
			else reprobados = reprobados +1;
			
			contadorEstudiantes++;
				
			
		}
			System.out.printf("aprobados: %d%n reprobados: %d%n", aprobados, reprobados);
			
			if(aprobados>8)
				System.out.print("bono para el instructor");
			else 
				System.out.print("instructor despedido");

			entrada.close();	
	}
		
	
}
