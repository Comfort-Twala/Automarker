package trof.automarker;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import junit.framework.TestCase;

public class OutputTest extends TestCase{
	
	private Output output;
	private	String[] cars;
	private ArrayList<String> carsList;

	/**
	 * Setup method	
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.output = new Output();
		cars = new String[]{"Volvo", "BMW", "Ford", "Mazda", "Mercedes"};
		carsList = new ArrayList<>(Arrays.asList(cars));
	}

	/**
	 * Testing addInput method
	 */
	@Test
	public void testAddInput(){
		int size = 0;
		for (String car : cars) {
			output.addInput(car);
			size++;
			assertEquals(size, output.size());
		}
	}

	/**
	 * Testing getOutput method
	 */
	@Test
	public void testGetOutput() {
		for (String car : cars) {
			output.addInput(car);
		}
		assertEquals(carsList.toString(), output.getOutput().toString());
	}

	/**
	 * Testing compareTo method
	 */
	@Test
	public void testCompareTo() {
		Output other = new Output();
		for (String car : cars) {
			output.addInput(car);
			other.addInput(car);
		}
		assertEquals(0, output.compareTo(other));

		other.addInput("Ferari");
		assertEquals(-1, output.compareTo(other));
	}
}