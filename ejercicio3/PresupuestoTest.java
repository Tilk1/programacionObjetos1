import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio2.Item;
import ar.edu.unlp.info.oo1.ejercicio2.Presupuesto;

public class PresupuestoTest {

	private Presupuesto presupuesto;

	@BeforeEach
	public void setUp() {
		presupuesto = new Presupuesto().cliente("Pedro");
	}

	@Test
	public void testCalcularTotal() {
		assertEquals(0, presupuesto.calcularTotal());
		Item item = new Item().detalle("Leche").costoUnitario(100.0).cantidad(1);
		presupuesto.agregarItem(item);
		assertEquals(100, presupuesto.calcularTotal());

		item = new Item().detalle("Chocolate").costoUnitario(150.0).cantidad(1);
		presupuesto.agregarItem(item);

		assertEquals(250, presupuesto.calcularTotal());
	}

	@Test
	public void testInitialize() {
		assertEquals(0, presupuesto.calcularTotal());
	}

}
