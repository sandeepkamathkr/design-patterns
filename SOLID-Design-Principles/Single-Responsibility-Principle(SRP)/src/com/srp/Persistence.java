package com.srp;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;

class Persistence {
    public void saveToFile(Notes notes,
                           String filename, boolean overwrite) throws Exception {
        if (overwrite || new File(filename).exists())
            try (PrintStream out = new PrintStream(filename)) {
                out.println(notes.toString());
            }
    }

    public void load(Notes notes, String filename) {
    }

    public void load(Notes notes, URL url) {
    }
}
