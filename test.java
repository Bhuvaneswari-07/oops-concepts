class employe {
    String name;
    int id;
    int salary;

    employe(String n, int i, int s) {
        name = n;
        id = i;
        salary = s;
    }
    void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }
}
class developer extends employe{
    String language;
    developer(String name,int id,int salary,String lang){
        language=lang;
        super(name,id,salary);

    }
    void display(){
        super.display();
        System.out.println(language);
    }

    }

public class test {
    public static void main(String[] args){
        developer d1=new developer("anand",01,1000,"telugu");
        developer d2 = new developer("Priya", 102, 40000, "Python");

        d1.display();
        d2.display();

    }
}
