public class Main {

    public static void main(String[] args) {
        Soldier soldier;
        General general;
        Commander commander;

        UnitsFactory unitsFactory = Army.of("orcs");
        System.out.println("Orcs:");
        soldier = unitsFactory.getSoldier();
        soldier.attack();
        general = unitsFactory.getGeneral();
        general.attack();
        general.giveOrder();
        commander = unitsFactory.getCommander();
        commander.think();
        commander.giveOrder();
        System.out.println("----");

        System.out.println("Elfs:");
        unitsFactory = Army.of("elfs");
        soldier = unitsFactory.getSoldier();
        soldier.attack();
        general = unitsFactory.getGeneral();
        general.attack();
        general.giveOrder();
        commander = unitsFactory.getCommander();
        commander.think();
        commander.giveOrder();
    }
}
