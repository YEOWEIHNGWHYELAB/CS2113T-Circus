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
        // Parrot doesn't have a swim method. You are asking parrot to swim... It will die...
        // train(new Parrot()); // No errors as Parrot is a bird since the train() expects a bird as you build project. However,you will get classcast exception when you run it. Class parrot cannot be cast to class duck even though they are child class of a bird, you cannot anyhow do casting.
        // Basically things must be in relation to the inheritance hierarchy and underlying object supports whatever behaviour respectively.
        Parrot p1 = (Parrot) b;
        p1.speak();

        Animal a2 = new Animal();
        Bird b2 = new Bird();
    }

    // getToSpeak is expecting a animal reference. But you are giving it a type of duck.
    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    // You are accepting reference of bird...
    private static void train(Bird bird) {
        // Training the bird to do swimming. But swimming is only defined for a duck...
        // So we did a downcasting bird to duck and ask it to swim.
        Duck d = (Duck) bird;
        // d.speak();
        d.swim();
    }
}
