import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CritterTest {

	@Test
	void test() {
		Frog kermit = new Frog("green");
		String color = kermit.getColor();
		assertEquals("green", color);

		Frog newKermit = new Frog("green");

		Frog[] frogs = new Frog[10];
		frogs[0] = new Frog("green");
		assertTrue(kermit.equals(frogs[0]));

		assertTrue(kermit.equals(newKermit));

	}

	@Test
	void polymorphismTest() {

		// Utilizing late binding
		Critter[] zoo = new Critter[3];
		zoo[0] = new Bird();
		zoo[1] = new Frog("blue");
		zoo[2] = new Bird();

		String moveString;
		for (int i = 0; i < zoo.length; ++i) {
			moveString = zoo[i].move();
			System.out.println(moveString);
		}
	}

}
