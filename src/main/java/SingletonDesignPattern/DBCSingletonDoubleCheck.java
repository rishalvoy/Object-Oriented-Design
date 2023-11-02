package SingletonDesignPattern;

public class DBCSingletonDoubleCheck {

    private static DBCSingletonDoubleCheck instance = null;

    private DBCSingletonDoubleCheck()
    {
        System.out.println("Instance Created From DBCSingletonDoubleCheck ");
    }

    public static DBCSingletonDoubleCheck getInstance()
    {
        if(instance == null)
        {
            synchronized (DBCSingletonDoubleCheck.class)
            {
                if(instance==null)
                {
                    instance = new DBCSingletonDoubleCheck();
                }
            }
        }

        return instance;
    }

}
