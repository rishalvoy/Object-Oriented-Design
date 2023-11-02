package SingletonDesignPattern;

public class DBC {

    private DBC()
    {
        System.out.println("Instance Created");
    }

    public static DBC getInstance()
    {
        DBC dbc = new DBC();

        return dbc;
    }
}
