class a{
    void dis(){
        System.out.println("parent class");

    }

}
class b extends a{
    void dis(){
        System.out.println("child class");
        super.dis();
    }
}
public class superkw {
    public static void main(String[] args){
        b obj=new b();
        obj.dis();
    }
}
