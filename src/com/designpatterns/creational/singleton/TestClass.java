package com.designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class TestClass {

	public static void main(String[] args) throws Exception {

		//Singleton s1 = new Singleton(); not allowed
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		
		//Reflection breaks Singleton pattern
		Class clazz = Class.forName("com.designpatterns.creational.singleton.Singleton");
		Constructor<Singleton> ctor = clazz.getDeclaredConstructor();
		
		ctor.setAccessible(true);
		
		Singleton s3 = ctor.newInstance();
		
		System.out.println("s3 : "+s3);
		
		
		//Serialization and Deserialization break Singleton pattern, to prevent it, implement readResolve() method in the Singleton class
		
		//Serialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/s2.ser"));
		oos.writeObject(s2);
		
		//Deserialization
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/s2.ser"));
		Singleton s4 = (Singleton) ois.readObject();
		
		System.out.println("s4 : "+s4);
	}

}