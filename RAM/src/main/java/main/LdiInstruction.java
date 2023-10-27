package main;

public class LdiInstruction implements Instruction {
	public void execute(int[] memory, int address, int[] accumulator) {
        int indirectAddress = memory[address];
        accumulator[0] = memory[indirectAddress];
	}
}
