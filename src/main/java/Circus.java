public class Circus {
    // Declare bunch of animal.
    private static Animal[] animals = {
            new Duck(),
            new Parrot()
    };
    // Declare bunch of equipment.
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    // Iterating through all animals created.
    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateValue(Equipment[] equipments) {
        int total = 0;
        for (Equipment e : equipments) {
            if (e.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + e.getValue());
            } else {
                total += e.getValue();
                System.out.println("Adding item value: " + e.getValue(animals));
                System.out.println("Total value of equipments " + calculateValue(equipments));
                // some 
                // more
                // code 
                // here ...
            }
        }
        return total;
    }

    public static void main(String[] args) {
        makeAnimalsTalk();
        System.out.println("Total value of equipments " + calculateValue(equipments));
    }
}
