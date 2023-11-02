package SingletonDesignPattern;

public class DBCSingleton {

    private static  DBCSingleton instance = null;

    private DBCSingleton()
    {
        //If Multiple Thread Try To Create The Instance Then It Might Fail and Led To Creation Of Multiple Instances
        System.out.println("Instance Created From DBC Singleton");

    }

    public static  DBCSingleton getInstance()
    {
        if(instance==null)
        {
            instance = new DBCSingleton();
        }

        return instance;

    }
}
