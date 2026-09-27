class Ani {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Do extends Ani {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Do {
    void play() {
        System.out.println("Puppy plays");
    }
}

public class inheritance2 {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
    }
}

