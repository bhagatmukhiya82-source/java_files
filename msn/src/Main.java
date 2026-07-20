//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    int id;
    String name;
    int age;

    public Main() {

        id = 101;
        name = "Alex";
        age = 20;


        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        Main a = new Main();
    }
}