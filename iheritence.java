class animal{
    String name;
    String color;
    
    public void show(){
           System.out.println("animal is eating");
        
    }
}
    class cat extends animal{
        public void mew(){

            System.out.println("mew is eating");
            
        
    }
}
public class iheritence{
    public static void main(String[] args){
        cat c=new cat();
        c.name="Bird";
        c.color="white";
        System.out.println(c.name);
System.out.println(c.color);
        c.show();
        c.mew();
        
        
    }
}
