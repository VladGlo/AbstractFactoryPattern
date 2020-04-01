public class ElfsFactory implements UnitsFactory {
    @Override
    public Soldier getSoldier() {
        return new ElfSoldier();
    }

    @Override
    public General getGeneral() {
        return new ElfGeneral();
    }

    @Override
    public Commander getCommander() {
        return new ElfCommander();
    }
}
