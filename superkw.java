class a{
    a(){
        System.out.println("parent class");

    }

}
class b extends a{
    b(){
        System.out.println("child class");
        super();

    }
}
public class superkw {
    public static void main(String[] args){
        b obj=new b();


    }
}
