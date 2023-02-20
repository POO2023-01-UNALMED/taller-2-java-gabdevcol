package test;
import java.util.Arrays;

public class Asiento{

	String color;
	int precio;
	int registro;
	
	void cambiarColor(String color) {
		
		String[] coloresPermitidos = {"rojo","verde","amarillo","negro","blanco"};
		String colorMinuscula = color.toLowerCase();
		boolean existe = Arrays.asList(coloresPermitidos).contains(colorMinuscula);
		
		if (existe) {
			this.color = color;
		}
		}
}
