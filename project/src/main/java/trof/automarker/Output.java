package trof.automarker;
import java.util.ArrayList;

/**
 * Output class stroring output produced by ProgramRun
 */
public class Output implements Comparable<Output> {
	private ArrayList<String> result;

	/**
	 * Constructor to create object 
	 */	
	public Output() {
		result = new ArrayList<String>();
	}

	/**
	 * Add input into result arraylist
	 * @param input to append to result
	 */
	public void addInput(String input) {
		result.add(input);
	}

	/**
	 * getter method for external classes to access result arraylist
	 * @return result 
	 */
	public ArrayList<String> getOutput() {
		return result;
	}

	/**
	 * Get Output size
	 * @return number of strings stored
	 */
	public int size() {
		return result.size();	
	}

	/**
	 * Comparable method to compare two instances of Output object
	 * @param other Output object to compare to
	 * @return 0 if equal/ -1 if not
	 */
	@Override
	public int compareTo(Output other) {
		return (this.result.equals(other.getOutput())) ? 0 : -1;
	}

}
