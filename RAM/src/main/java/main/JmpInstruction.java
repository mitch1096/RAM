package main;

public class JmpInstruction implements Instruction {
	public void execute(int[] memory, int address, int[] instructionPointer) {
        instructionPointer[0] = address;
	}
}
