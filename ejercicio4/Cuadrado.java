package ar.edu.unlp.info.oo1.ejercicio2.figuras;

public class Cuadrado implements Cara{
	private Double lado;

	public Double getArea() {
		return Math.pow(lado, 2);
	}

	public Double getPerimetro() {
		return lado * 4;
	}

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}


}
