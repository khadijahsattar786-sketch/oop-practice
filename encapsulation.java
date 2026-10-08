class student{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
public int getage(){
    
    return age;
}
public void setage(int age){
    this.age=age;
}
}
public class encapsulation{
    public static void main(String[] args){
        student s=new student();
        s.setName("khadijah");
        s.setage(18);
         System.out.println(s.getName());
         System.out.println(s.getage());
         
    }
}