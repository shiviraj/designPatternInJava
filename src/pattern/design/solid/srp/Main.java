package pattern.design.solid.srp;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Journal journal = new Journal();
        journal.addEntry("I cried today.");
        journal.addEntry("I ate bug.");

        System.out.println(journal);
        Persistence p = new Persistence();
        p.saveToFile(journal, "journal", true);
    }
}
