package cafetoeil.model;

import static org.junit.jupiter.api.Assertions.*;

import cafetoeil.model.cafedebase.Colombia;
import cafetoeil.model.cafedebase.Deca;
import cafetoeil.model.cafedebase.Espresso;
import cafetoeil.model.supplement.Caramel;
import cafetoeil.model.supplement.Chantilly;
import cafetoeil.model.supplement.Chocolat;
import org.junit.jupiter.api.Test;

class BoissonTest {

	@Test
	void espresso_simple() {
		Boisson espresso = new Espresso();

		assertEquals("Espresso", espresso.description());
		assertEquals(1.99, espresso.prix());
	}

	@Test
	void espresso_ameloration_caramel () {
		Boisson boisson = new Espresso();
		boisson = new Caramel(boisson);

		assertEquals("Espresso, Caramel", boisson.description());
		assertEquals(1.99+.15, boisson.prix());
	}

	@Test
	void espresso_ameloration_caramel_chocolat () {
		Boisson boisson = new Espresso();
		boisson = new Caramel(boisson);
		boisson = new Chocolat(boisson);

		assertEquals("Espresso, Caramel, Chocolat", boisson.description());
		assertEquals(1.99+.15+.20, boisson.prix());
	}

	@Test
	void espresso_ameloration_camarel_chocolat_chantilly () {
		Boisson boisson = new Espresso();
		boisson = new Caramel(boisson);
		boisson = new Chocolat(boisson);
		boisson = new Chantilly(boisson);

		assertEquals("Espresso, Caramel, Chocolat, Chantilly", boisson.description());
		assertEquals(1.99+.15+.20+.10, boisson.prix());
	}

	@Test
	void colombia_simple() {
		Boisson colombia = new Colombia();

		assertEquals("Pur Colombia", colombia.description());
		assertEquals(.89, colombia.prix());
	}

	@Test
	void colombia_ameloration_chocolat_chocolat () {
		Boisson boisson = new Colombia();
		boisson = new Chocolat(boisson);
		boisson = new Chocolat(boisson);

		assertEquals("Pur Colombia, Chocolat, Chocolat", boisson.description());
		assertEquals(.89+.20+.20, boisson.prix());
	}

	@Test
	void colombia_ameloration_caramel () {
		Boisson boisson = new Colombia();
		boisson = new Caramel(boisson);

		assertEquals("Pur Colombia, Caramel", boisson.description());
		assertEquals(.89+.15, boisson.prix());
	}

	@Test
	void colombia_ameloration_caramel_chocolat () {
		Boisson boisson = new Colombia();
		boisson = new Caramel(boisson);
		boisson = new Chocolat(boisson);

		assertEquals("Pur Colombia, Caramel, Chocolat", boisson.description());
		assertEquals(.89+.15+.20, boisson.prix());
	}

	@Test
	void colombia_ameloration_camarel_chocolat_chantilly () {
		Boisson boisson = new Colombia();
		boisson = new Caramel(boisson);
		boisson = new Chocolat(boisson);
		boisson = new Chantilly(boisson);

		assertEquals("Pur Colombia, Caramel, Chocolat, Chantilly", boisson.description());
		assertEquals(.89+.15+.20+.10, boisson.prix());
	}

	@Test
	void deca() {
		Boisson boisson = new Deca();

		assertEquals("Café déca", boisson.description());
		assertEquals(1.05, boisson.prix());
	}

}
