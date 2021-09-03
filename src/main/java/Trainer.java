public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting // You are not a bird, you were a duck! Take d and cast it to bird b.
        getToSpeak(b); // It will still say what a duck will say as it reference duck!

        Animal a = (Animal) b; // upcasting // Reference something that is not an animal. (Substitutability)
        getToSpeak(a);
        // a.swim() -> doesn't work! Because you are looking at a animal but no swim() method in it...

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);
        d2.fly(); // Duck doesn't have a fly() but bird does! Basically, duck is a bird is a animal (inheritance -> you get bird behaviour), so whatever behaviour that duck or bird provide, duck will provide...
        d2.swim(); // Duck only method... You get I'm Swimming. Because underlying object is still a duck. So you still have its behaviour.

        train(new Duck());
        // train(new Parrot());

        Animal a2 = new Animal();
        Bird b2 = new Bird();
    }

    // getToSpeak is expecting a animal reference. But you are giving it a type of duck.
    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        Duck d = (Duck) bird;
        d.swim();
    }
}
