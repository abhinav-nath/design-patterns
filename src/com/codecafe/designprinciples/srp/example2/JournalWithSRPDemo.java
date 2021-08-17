package com.codecafe.designprinciples.srp.example2;

import java.util.ArrayList;
import java.util.List;

// class confirming to SRP
class JournalWithSRP {

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

public class JournalWithSRPDemo {
    public static void main(String args[]) {
        JournalWithSRP j = new JournalWithSRP();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");

        System.out.println(j);
    }
}