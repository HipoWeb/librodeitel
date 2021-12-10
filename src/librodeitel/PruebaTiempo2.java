package librodeitel;
//Uso de constructores sobrecargados para inicializar objetos Tiempo2.
public class PruebaTiempo2 {

	public static void main(String[] args) {
		Tiempo2 t1= new Tiempo2();
		Tiempo2 t2= new Tiempo2();
		Tiempo2 t3=new Tiempo2();
		Tiempo2 t4=new Tiempo2();
		Tiempo2 t5=new Tiempo2();
		System.out.println("Se consutruyo con");
		mostrarTiempo("t1 : todos los argumentos predeterminados", t1);
		mostrarTiempo("t2: se especifico hora; minuto y segundo predeterminados", t2);
		mostrarTiempo("t3: se especificaron hora y minuto; segundo predeterminado",t3);
		mostrarTiempo("t4: se especificaron hora, minuto y segundo",t4);
		mostrarTiempo("t5: se especifico el objeto Tiempo2 llamado t4",t5);
		// intento de inicializar t6 con valores inv�lidos
		try {
			Tiempo2 t6 = new Tiempo2(27,74,99);
			
		} catch (IllegalArgumentException e) {
			System.out.printf("%nExcepcion al inicializar t6: %s%n",e.getMessage());
		}

	}
	// muestra un objeto tiempo2 en formatos de 24 y 12 horas
	private static void mostrarTiempo(String encabezado, Tiempo2 t) 
	{
		System.out.printf("%s%n %s%n %s%n",encabezado, t.aStringUniversal(), t.toString());
	}

}
