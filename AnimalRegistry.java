public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        sheepPrototype = new Sheep(4, "Baa!", "Grass", "Mikey");
        cowPrototype = new Cow(4, "Moo!", "Hay");
        horsePrototype = new Horse(4, "Neigh!", "Hay", "Red");
    }

    public Animal createSheep(String name) {
        return sheepPrototype.clone();
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}