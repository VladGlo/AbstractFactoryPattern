public class ElfCommander implements Commander {
    @Override
    public void giveOrder() {
        System.out.println("Lets attack from the west");
    }

    @Override
    public void think() {
        System.out.println("What are orcs planning?..");
    }
}
