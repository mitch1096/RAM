package main;

public class SubInstruction implements Instruction {
	public void execute(int[] memory, int address, int[] accumulator) {
	accumulator[0] -= memory[address];
	}
}
