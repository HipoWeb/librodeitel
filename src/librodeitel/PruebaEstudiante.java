package librodeitel;

public class PruebaEstudiante {

	public static void main(String[] args) {
		Estudiante cuenta1= new Estudiante("Janne Green", 93.5);
		Estudiante cuenta2= new Estudiante("Jhon blue", 72.75);
		
		System.out.printf("la calificacion en letra de %s es: %s%n",cuenta1.ObtenerNombre(),cuenta1.obtenerCalificacionEstudiante());
		System.out.printf("la calificacion en letra de %s es: %s%n", cuenta2.ObtenerNombre(),cuenta2.obtenerCalificacionEstudiante());
		
	}

}
