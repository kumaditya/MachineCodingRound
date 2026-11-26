package in.sp.LazyThreadSafeSingleNullCheck;

public class ConfigurationManager2 {

    // Eagerly created singleton instance (created during class loading)
    private static ConfigurationManager2 instance;

    // Private constructor to prevent instantiation from outside the class
    private ConfigurationManager2() {
    }

    // Public method to provide global access point to the instance
    public  static ConfigurationManager2 getInstance() {
        if(instance ==null)
        {
            synchronized (ConfigurationManager.class) {
                instance = new ConfigurationManager2();
            }
        }

        return instance;

    }


}
