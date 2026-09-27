class student {
    int roll;
    String name;
    int m1;
    int m2;
    int m3;
    int average;

    student(int r, String n, int a, int b, int c) {
        roll = r;
        name = n;
        m1 = a;
        m2 = b;
        m3 = c;
    }

    void avg() {
        average = (m1 + m2 + m3) / 3;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Average: " + average);

        if (average > 45) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

public class inheritance4 {
    public static void main(String[] args) {

        student s1 = new student(1, "bhuvana", 100, 30, 90);
        student s2 = new student(2, "lallu", 100, 100, 100);

        s1.avg();
        s1.display();

        s2.avg();
        s2.display();
    }
}