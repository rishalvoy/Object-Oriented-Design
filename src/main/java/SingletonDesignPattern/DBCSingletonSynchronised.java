package SingletonDesignPattern;

public class DBCSingletonSynchronised {

    private static DBCSingletonSynchronised instance = null;

    private DBCSingletonSynchronised()
    {
        //If Multiple Thread Try To Create The Instance Then It Might Fail and Led To Creation Of Multiple Instances
        System.out.println("Instance Created From DBC Singleton Synchronised ");

    }

    public static synchronized DBCSingletonSynchronised getInstance()
    {
        if(instance==null)
        {
            instance = new DBCSingletonSynchronised();
        }

        return instance;

    }
}
