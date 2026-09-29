class employee{
    String name;
    int id;
    int salary;
    String d;
    String m;
    employee(String n,int i,int sala,String dev,String man){
        name=n;
        id=i;
        salary=sala;
        d=dev;
        m=man;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("id:"+id);
        System.out.println("salary:"+salary);


    }
    void calc(String post){
        if(post.equals(d)){
            int sal=salary+salary*20/100;
            System.out.println("the salary is:"+sal);

        }
        else if(post.equals(m)){
            int sal=salary+salary*30/100;
            System.out.println("the salary is:"+sal);



        }

    }
}
public class oops2 {
    public static void main(String[] args){
        employee e1=new employee("ravi",001,1000,"dev","manager");
        e1.display();
        e1.calc("d");
    }
}
