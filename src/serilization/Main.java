package serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {

		Person person1 = new Person("mehmet ali");
		try {
			dosyaYaz(person1);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try {
			dosyaOku();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void dosyaYaz(Person person) throws IOException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.txt"));
		objectOutputStream.writeObject(person);
	}

	public static void dosyaOku() throws IOException, ClassNotFoundException {
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.txt"));

		Person name = (Person) objectInputStream.readObject();
		System.out.println(name);

	}

}
//14:42

// bir tane person sınıfı oluşturalım sadece nami olsun
// Main sınıfından dosyaYaz ve dosyaOKu methodlarını yazalım
//Person Serializable interfacesini kullanalım
