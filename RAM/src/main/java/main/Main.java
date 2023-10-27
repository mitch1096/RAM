package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Erstellen Sie eine Instanz von RAM mit einer bestimmten Speichergröße.
        RAM ram = new RAM(100); // Beispiel: 100 Speicherzellen

        // Erstellen Sie eine Liste von Instruktionen (Ihrem Programm).
        List<Instruction> program = new ArrayList<Instruction>();
        program.add(new LdaInstruction());
        program.add(new AddInstruction());
        program.add(new StaInstruction());
        program.add(new HltInstruction());

        // Laden Sie Ihr Programm in den RAM.
        ram.loadProgram(program);

        // Führen Sie das Programm aus.
        ram.executeProgram();
    }
}
