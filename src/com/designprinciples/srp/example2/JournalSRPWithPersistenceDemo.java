package com.designprinciples.srp.example2;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

// class adhering to SRP
class JournalSRPWithPersistence {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

}

/*
 * here we will keep our Persistence code, not just for Journal but for other
 * classes as well and separate out the persistence concern from the Journal
 * class
 */
class Persistence {
    public void saveToFile(JournalSRPWithPersistence journal, String fileName, boolean overwrite) {
        if (overwrite || new File(fileName).exists()) {
            PrintStream out = null;
            try {
                out = new PrintStream(fileName);
                out.println(journal.toString());
            } catch (Exception e) {
                System.out.println("Exception occured : ");
                e.printStackTrace();
            } finally {
                if (out != null)
                    out.close();
            }
        }
    }

    // public Journal load(String fileName) {}
    // public Journal load(URL url) {}

}

public class JournalSRPWithPersistenceDemo {

    public static void main(String args[]) throws Exception {

        JournalSRPWithPersistence j = new JournalSRPWithPersistence();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");

        System.out.println(j);

        Persistence p = new Persistence();

        String fileName = "c:\\temp\\journal.txt";

        p.saveToFile(j, fileName, true);

        Runtime.getRuntime().exec("notepad.exe " + fileName);
    }

}