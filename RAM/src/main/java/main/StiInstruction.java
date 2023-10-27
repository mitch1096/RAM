package main;

public class StiInstruction implements Instruction {
	public void execute(int[] memory, int address, int[] accumulator) {
        int indirectAddressToStore = memory[address];
        memory[indirectAddressToStore] = accumulator[0];
	}
}
