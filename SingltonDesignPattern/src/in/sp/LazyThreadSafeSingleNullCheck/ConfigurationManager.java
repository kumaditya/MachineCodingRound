package in.sp.LazyThreadSafeSingleNullCheck;

public class ConfigurationManager {

    // Eagerly created singleton instance (created during class loading)
    private static  ConfigurationManager instance;

    // Private constructor to prevent instantiation from outside the class
    private ConfigurationManager() {
    }

    // Public method to provide global access point to the instance
    public synchronized static ConfigurationManager getInstance() {
        if(instance ==null)
        {
            instance=new ConfigurationManager();
        }

        return instance;

    }


}
