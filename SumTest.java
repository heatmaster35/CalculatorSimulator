// SumTest.java
// Unit tests for Sum class
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class SumTest {

	@Test
	public void oneNumberTest() {
		Sum s = new Sum();
		s.add(11);
		assertEquals(10, s.getValue());
	}

	@Test
	public void twoNumberTest() {
		Sum s = new Sum();
		s.add(3);
		s.add(12);
		assertEquals(15, s.getValue());
	}

	@Test
	public void threeNumberTest() {
		Sum s = new Sum();
		s.add(10);
		s.add(-3);
		s.add(5);
		assertEquals(18,s.getValue());
	}
}
