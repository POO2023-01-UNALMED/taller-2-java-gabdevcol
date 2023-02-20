package test;
public class Motor {
	
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	void asignarTipo(String tipo) {
		
		if (tipo.toLowerCase() == "electrico" || tipo.toLowerCase() == "gasolina") {
			this.tipo = tipo.toLowerCase();	
		}
	}

}
