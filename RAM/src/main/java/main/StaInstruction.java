package main;

public class StaInstruction implements Instruction {
	public void execute(int[] memory, int address, int[] accumulator) {
		memory[address] = accumulator[0];
	}
}
