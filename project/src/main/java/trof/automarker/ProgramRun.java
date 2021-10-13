package trof.automarker;

import java.io.File;
import java.util.ArrayList;

public class ProgramRun {
	private class Code {
		private File file;

		private Code() {
			file = null;
		}
		
		private void loadCode(File file){
			this.file = file;
		}
	}

	private ArrayList<ArrayList<String>> input;
	private ArrayList<Output> output;
	private Code program;

	public ProgramRun() {
		output = new ArrayList<Output>();
		program = new Code();	
	}

	public void loadProgram(File file){
		program.loadCode(file);
	}

	public File getProgram() {
		return program.file;
	}

	public void loadInput(ArrayList<String> input){
		this.input.add(input);
	}

	public ArrayList<ArrayList<String>> getInput(){
		return input;
	}

	public void run(){
		
	}

	public ArrayList<Output> getResult(){
		return output;
	}
}