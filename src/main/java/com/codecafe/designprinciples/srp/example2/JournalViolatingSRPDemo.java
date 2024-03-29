package com.codecafe.designprinciples.srp.example2;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

// class violating SRP
class JournalViolatingSRP {

  private static int count = 0;
  private final List<String> entries = new ArrayList<>();

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

  /**
   * Violation of SRP - Journal is not only handling addition/removal of entries
   * but also persistence. Persistence is a separate concern
   */
  public void save(String fileName) throws FileNotFoundException {
    try {
      PrintStream out = new PrintStream(fileName);
      out.println(toString());
      out.close();
    } catch (Exception e) {
      System.out.println("Exception occured");
    }
  }

  public void load(String fileName) {
  }

  public void load(URL url) {
  }

  /*
   * Violation of SRP - save and load methods should be moved to their own
   * separate class to let Journal adhere to SRP
   */
}

public class JournalViolatingSRPDemo {

  public static void main(String[] args) throws Exception {
    JournalViolatingSRP j = new JournalViolatingSRP();
    j.addEntry("I cried today");
    j.addEntry("I ate a bug");

    System.out.println(j);
  }

}