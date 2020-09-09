package model;

public class Calculadora {

	private Float valor1;
	private Float valor2;
	private Character operador;

	public float Resultado() {
		if(this.getOperador() == "+".charAt(0)) {
			return valor1 + valor2;
		}else if(this.getOperador() == "-".charAt(0)) {
			return valor1 - valor2;
		}else if(this.getOperador() == "*".charAt(0)) {
			return valor1 * valor2;
		}else if(this.getOperador() == "/".charAt(0)) {
			return valor1 / valor2;
		}else {
			return 0;
		}
	}
	
	public void setOperador(Character operador) {
		this.operador = operador;
	}
	
	public Character getOperador() {
		return operador;
	}
	
	
	public Float getValor1() {
		return valor1;
	}


	public void setValor1(Float valor1) {
		this.valor1 = valor1;
	}


	public Float getValor2() {
		return valor2;
	}


	public void setValor2(Float valor2) {
		this.valor2 = valor2;
	}

}
