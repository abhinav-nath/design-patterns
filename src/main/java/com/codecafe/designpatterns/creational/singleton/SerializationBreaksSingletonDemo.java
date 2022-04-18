package com.codecafe.designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 *  Serialization and De-serialization of a Singleton class object breaks Singleton pattern.
 *  To prevent it, implement readResolve() method in the Singleton class.
 */
public class SerializationBreaksSingletonDemo {

  public static void main(String[] args) throws Exception {

    Singleton s1 = Singleton.getInstance();
    System.out.println("HashCode of s1 : " + System.identityHashCode(s1));

    // Serialization
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"));
    oos.writeObject(s1);
    oos.close();

    // De-serialization
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));
    Singleton s2 = (Singleton) ois.readObject();
    ois.close();

    System.out.println("HashCode of s2 : " + System.identityHashCode(s2));
  }

}