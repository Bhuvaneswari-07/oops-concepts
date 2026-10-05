class Student1 {

    private int marks = 90;

    void display() {
        System.out.println(marks);
    }
}

public class access1 {

    public static void main(String[] args) {

        Student1 s = new Student1();

        s.display();
       //System.out.println(s.marks);
    }
}

