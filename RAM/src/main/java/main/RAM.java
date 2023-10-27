package main;

import java.util.List;

public class RAM {
    private int[] memory;
    private int[] accumulator;
    private int instructionPointer;
    private List<Instruction> program;

    public RAM(int memorySize) {
        memory = new int[memorySize];
        accumulator = new int[1];
        instructionPointer = 0;
    }

    public void loadProgram(List<Instruction> program) {
        this.program = program;
    }

    public void executeProgram() {
        if (program == null) {
            System.err.println("No program loaded.");
            return;
        }

        while (instructionPointer < program.size()) {
            program.get(instructionPointer).execute(memory, instructionPointer, accumulator);
            instructionPointer++;
        }
    }
}
