package librodeitel;

import javax.swing.JOptionPane;

public class VentanasDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String nombre =JOptionPane.showInputDialog("cual es tu nombre");
	String mensaje= String.format("Bienvenido %s", nombre);
	
	JOptionPane.showMessageDialog(null, mensaje);
	
	}

}
