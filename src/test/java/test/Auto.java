package test;
public class Auto {
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad = 0;
		for (int i=0; i<asientos.length;i++) {
			if (asientos[i]!= null) {
				cantidad ++;
			}
		}
		return cantidad;
	}
	
	String verificarIntegridad() {
		String respuesta = "Auto original";
		
		if (this.registro == motor.registro) {
			for (int i=0; i < asientos.length; i++) {
				
				if (asientos[i] != null) {
					
					if (asientos[i].registro != this.registro) {
						respuesta = "Las piezas no son originales";	
						break;
					}
				}
			}
		}
		
		else 
			respuesta = "Las piezas no son originales"; 
			
		return respuesta;			
		}
}
	

