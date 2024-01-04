package models;

public class Students {
    public void setAge(int age) {
        this.age = age;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Students(String name, int age, String section, String address) {
        this.name = name;
        this.age = age;
        this.section = section;
        this.address = address;
    }

    String name = "deena";
    int age =17;

    String section = "yala";

    String address = "sifal";

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public int getAge(){
        return age;
    }

    public void setName(String unil) {
    }
    
}
