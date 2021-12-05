package librodeitel;

public class Interes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double monto;
		double principal=1000;
		double tasa =0.05;
		
		System.out.printf("%s%20s%n", "anio", "monto de deposito");
		
		for(int anio=0;anio<=10;anio++)
		{
			monto = principal*Math.pow(1.0 +tasa, anio);
			
			System.out.printf("%4d%,20.2f%n", anio, monto);
		}
			
	}

}
