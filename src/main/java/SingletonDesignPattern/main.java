package SingletonDesignPattern;

public class main {

    public static void main(String[] args) {

        //We Cant Make It Public
//        DBC dbc = new DBC();

        // If We Make The DBC Class Private We Can't Get Instance So We Will Use getInstance Method

        DBC dbc1 = DBC.getInstance();

        DBC dbc2 = DBC.getInstance();

        //Is This Singleton?No! We are able to create multiple instance of DBC Class

        //We are trying to create two instance of single class but it is not created so this is singleton

        long start = System.nanoTime();
        DBCSingleton dbcSingle = DBCSingleton.getInstance();
        DBCSingleton dbcSingle2 = DBCSingleton.getInstance();
        long end = System.nanoTime();

        System.out.println("Total Run Time For DBC Singleton "+ (int)(end-start));

        /*
        * Make Constructor Private
        * Public Static GetInstance
        * Static Instance
        * Before Creating An Object, Check If The Object Exists Or Not
        */
        long start1 = System.nanoTime();
        DBCSingletonSynchronised dbcSingleSync1 = DBCSingletonSynchronised.getInstance();
        DBCSingletonSynchronised dbcSingleSync2 = DBCSingletonSynchronised.getInstance();
        long end1 = System.nanoTime();

        System.out.println("Total Run Time For DBC Singleton Synchronised "+ (int)(end1-start1));


        DBCSingletonDoubleCheck dbcdoublecheck = DBCSingletonDoubleCheck.getInstance();
        DBCSingletonDoubleCheck dbcdoublecheck1 = DBCSingletonDoubleCheck.getInstance();


    }
}
