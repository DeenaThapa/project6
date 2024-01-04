import models.Students;

import javax.naming.Name;
import javax.xml.namespace.QName;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Students deena = new Students("deena",17,"yala","sifal");

        deena.setAge(17);
        deena.setName("deena");

        deena.setSection("yala");


        System.out.println(deena.getName());
        System.out.println(deena.getSection());
        System.out.println(deena.getAge());
    }
}



