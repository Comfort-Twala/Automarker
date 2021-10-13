package trof.automarker;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;
import junit.framework.TestCase;

public class ProgramRunTest extends TestCase {

	private ProgramRun run;
	private ArrayList<ArrayList<String>> inputData;

	/**
	 * Setup Method
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		run = new ProgramRun();
		// Populating inputData 
		inputData = new ArrayList<>();
		String[] words = new String[]{"red", "Jane", "Richard Nixon", "Miss America", "man", "woman", "fish", "elephant", "unicorn"};
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			ArrayList<String> input = new ArrayList<>();
			for (int j = 0; j < random.nextInt(10); j++) {
				input.add(words[random.nextInt(words.length)] + " " + words[random.nextInt(words.length)]);
			}
			inputData.add(input);
		}
	}

	/**
	 * Testing loadProgram and getProgram methods
	 */
	@Test
	public void testLoad_GetProgram() {
		// no code loaded
		assertEquals(null, run.getProgram());
		// code loaded
		run.loadProgram(new File("data/test1.java"));
		assertEquals("test1.java", run.getProgram().getName());
	}

}