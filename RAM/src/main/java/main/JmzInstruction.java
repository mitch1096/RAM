package main;

public class JmzInstruction implements Instruction {
    public void execute(int[] memory, int address, int[] accumulator) {
        int[] instructionPointer = memory; // Annahme: instructionPointer wird im Speicher gespeichert.
        if (accumulator[0] == 0) {
            instructionPointer[0] = address;
        }
    }
}
