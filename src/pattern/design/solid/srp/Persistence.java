package pattern.design.solid.srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistence {
    public void saveToFile(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(filename).exists()) {
            PrintStream out = new PrintStream(new File(filename));
            out.println(journal.toString());
        }

    }
}
