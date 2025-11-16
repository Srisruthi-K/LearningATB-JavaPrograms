package TEst;

public class JavaOOPS_5_Animal {

    void makesound() {
        System.out.println("Animal Sound");
    }
}
     class Dog extends JavaOOPS_5_Animal {
         @Override
         void makesound() {
             System.out.println("Dog says: Woof! Woof!");
             //super.makesound();
         }

     }
        class Cat extends JavaOOPS_5_Animal {
            @Override
            void makesound() {
                System.out.println("Cat says: Meow! Meow!");
            }


            public static void main(String[] args) {
                Dog d1 = new Dog();
                Cat c1 = new Cat();

                d1.makesound();
                c1.makesound();
            }
        }

