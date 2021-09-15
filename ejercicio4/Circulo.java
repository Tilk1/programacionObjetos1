package ar.edu.unlp.info.oo1.ejercicio2.figuras;

public class Circulo implements Cara {
	private Double radio;

	public Double getPerimetro() {
		return (Math.PI) * this.getDiametro();
	}

	public Double getArea() {
		return Math.PI * (Math.pow(radio, 2));
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	public void setDiametro(Double diametro) {
	}

	public Double getDiametro() {
		return radio * 2;
	}

}
