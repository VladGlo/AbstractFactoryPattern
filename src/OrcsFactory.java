public class OrcsFactory implements UnitsFactory {
    @Override
    public Soldier getSoldier() {
        return new OrkSoldier();
    }

    @Override
    public General getGeneral() {
        return new OrkGeneral();
    }

    @Override
    public Commander getCommander() {
        return new OrkCommander();
    }
}
