package librodeitel;

public class Tiempo2 {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Tiempo2() 
	{
		this(0,0,0);
	}
	public Tiempo2(int hora) 
	{
		this(hora,0,0);
	}
	public Tiempo2(int hora, int minuto) 
	{
		this(hora, minuto, 0);
	}
	public Tiempo2(int hora, int minuto, int segundo) 
	{
		if(hora<0||hora>=24)
			throw new IllegalArgumentException("la hora debe estar entre 0 o 23");
		if(minuto<0||minuto>=60)
			throw new IllegalArgumentException("minuto debe estar entre 0 y 60");
		if(segundo<0||minuto>=60)
			throw new IllegalArgumentException("segundo debe estar entre 0y60");
		this.hora=hora;
		this.minuto=minuto;
		this.segundo=segundo;
			
	}
	public Tiempo2(Tiempo2 tiempo)
	{
	 // invoca al constructor con tres argumentos
	 this(tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());
	 }
	public void establecerTiempo(int hora, int minuto, int segundo) {
		if(hora<0||hora>=24)
			throw new IllegalArgumentException("la hora debe estar entre 0 o 23");
		if(minuto<0||minuto>=60)
			throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
		if(segundo<0||minuto>=60)
			throw new IllegalArgumentException("segundo debe estar entre 0y59");
		this.hora=hora;
		this.minuto=minuto;
		this.segundo=segundo;
	}
	public void establecerHora(int hora) {
		if(hora<0||hora>=24)
			throw new IllegalArgumentException("la hora debe estar entre 0 o 23");
		this.hora=hora;
	}
	// valida y establece el minuto
	public void establecerMinuto(int minuto) {
		if(minuto<0||minuto>=60)
			throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
		this.minuto=minuto;
	}
	public void establecerSegundo(int segundo) {
		if(segundo<0||minuto>=60)
			throw new IllegalArgumentException("segundo debe estar entre 0y59");
		this.segundo=segundo;
	}
	// Métodos Obtener
	public int obtenerHora() {
		return hora;
	}
	public int obtenerMinuto() {
		return minuto;
	}
	public int obtenerSegundo() {
		return segundo;
	}
	// convierte a String en formato de hora universal (HH:MM:SS)
	public String aStringUniversal() {
		return String.format("%02d:%02d:%02d", obtenerHora(), obtenerMinuto(), obtenerSegundo());
	}
	// convierte a String en formato de hora estándar (H:MM:SS AM o PM)
	public String toString() {
		return String.format("%d:%02d:%02d %s",((obtenerHora() == 0 || obtenerHora() == 12) ? 12 : obtenerHora() % 12),obtenerMinuto(), obtenerSegundo(), (obtenerHora() < 12 ? "AM" : "PM"));
	}
	// fin de la clase Tiempo2
}
