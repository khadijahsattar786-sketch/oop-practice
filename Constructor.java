class Student {
    String name;
    int age;

    Student() {
        name = "Khadijah";
        
        age = 18;
        
    }

    void show() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Constructor {
    public static void main(String[] args) {

        Student s = new Student();

        s.show();
    }
}