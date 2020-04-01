public class Army {

    static UnitsFactory of(String race) {
        if (race.equals("elfs"))
           return new ElfsFactory();
        else if (race.equals("orcs"))
            return new OrcsFactory();
        else
            return null;
    }
}
