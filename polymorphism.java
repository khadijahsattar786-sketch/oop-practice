class shape{

    public void sound(){
        System.out.println("animal is eating");
    }
}
class cat extends shape{

    public void sound(){
     System.out.println("cat is crying");

}
}
class dog extends shape{
    public void sound(){
         System.out.println("dog is walking");
    }
}
public class polymorphism{
    public static void main(String[] args){
    shape s;
    s=new cat();
    s.sound();
    s=new dog();
    s.sound();
}
}