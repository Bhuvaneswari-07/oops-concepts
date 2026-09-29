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
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Average: " + average);

        if (average >= 40) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    // Method overloading
    void display(String message) {
        System.out.println(message);
        display();
    }
}

public class inheritance4 {
    public static void main(String[] args) {

        student s1 = new student(1, "Bhuvana", 100, 30, 90);
        student s2 = new student(2, "Lallu", 100, 100, 100);
        student s3 = new student(3, "Ravi", 20, 30, 25);

        student arr[] = new student[3];

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        for (int i = 0; i < arr.length; i++) {
            arr[i].avg();
            arr[i].display();
            System.out.println();
        }

        // Calling overloaded method
        s1.display("Student Result:");
    }
}