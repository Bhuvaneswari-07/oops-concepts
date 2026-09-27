
    class Anim {
        void eat() {
            System.out.println("Animal eats");
        }
    }

    class D extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }

    class Cat extends Animal {
        void meow() {
            System.out.println("Cat meows");
        }
    }

    public class inheritance3 {
        public static void main(String[] args) {

            D d = new D();
            d.eat();
            d.bark();

            Cat c = new Cat();
            c.eat();
            c.meow();
        }
    }

