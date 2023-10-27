package main;

public interface Instruction {
	void execute(int[] memory, int address, int[] accumulator);
}
