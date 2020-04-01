public class OrkCommander implements Commander {
    @Override
    public void giveOrder() {
        System.out.println("Kill!");
    }

    @Override
    public void think() {
        System.out.println("Kill or kill?");
    }
}
