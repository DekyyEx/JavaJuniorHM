package hm3;

import java.io.*;

public record Person(String name, int age) implements Serializable {

    public static void serializePerson(Person person, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in " + fileName);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static Person deserializePerson(String fileName) {
        Person person = null;
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            person = (Person) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Person class not found");
            c.printStackTrace();
            return null;
        }
        return person;
    }
}