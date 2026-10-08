class student{
    String name;
    String fathername;
    int age;
    int rolnumber;

    public void show(){
        System.out.println(name);
         System.out.println(fathername);
           System.out.println(age);
             System.out.println(rolnumber); 
    }
}
public class main{
    public static void main(String[]args){
        student s=new student();
        s.name="Khadijah";
        s.fathername="Abdul sattar";
        s.age=18;
        s.rolnumber=20;
        s.show();

    }
}