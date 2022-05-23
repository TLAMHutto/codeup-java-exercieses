
public class Person {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
    public Person(String name) {
        this.name = name;
    }
    public static  void main(String[] args) {
        Person p1 = new Person("Keaton");
        Person p2 = new Person("Miles");
        p1.sayHello();
        p2.sayHello();
    }
}
