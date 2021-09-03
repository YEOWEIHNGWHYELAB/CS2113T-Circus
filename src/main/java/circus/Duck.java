package circus;

public class Duck extends Bird {
    @Override // Redefining the speak method in Animal as Bird (superclass) of this no have speak().
    public String speak() {
        return "Quack Quack";
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override // If you remove this, it will print the memory address of this object instead!
    public String toString() {
        return "I'm a Duck";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }
}
