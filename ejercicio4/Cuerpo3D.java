package ar.edu.unlp.info.oo1.ejercicio2.figuras;

public class Cuerpo3D {

	private Cara caraBasal;

	private Double altura;

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public void setCaraBasal(Cara cara) {
		this.caraBasal = cara;
		
	}
	
	public Double getVolumen() {
		return caraBasal.getArea() * altura;
		
	}
	
	public Double getSuperficieExterior() {
		return 2 * caraBasal.getArea() +  caraBasal.getPerimetro()* this.getAltura();
		
	}
	
}