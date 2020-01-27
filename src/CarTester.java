import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTester {

	@Test
	void test() {
		Car a = new Car();
		Car b = new Car("blue","honda",123);
		assertEquals("[color=grey, make=Jalopy, mpg=Unknown]", a.toString());
		assertEquals("[color=blue, make=honda, mpg=123]", b.toString());
		
	}

}
