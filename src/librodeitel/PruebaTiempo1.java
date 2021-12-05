package librodeitel;

public class PruebaTiempo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiempo1 tiempo = new Tiempo1(); // invoca el constructor de Tiempo1
		// imprime representaciones de cadena del tiempo
		mostrarTiempo("Despues de crear el objeto tiempo", tiempo);
		System.out.println();
		
		// modifica el tiempo e imprime el tiempo actualizado
		tiempo.establecerTiempo(13, 27, 6);
		mostrarTiempo("Despues de llamar a establecerTiempo", tiempo);
		System.out.println();
	}


}