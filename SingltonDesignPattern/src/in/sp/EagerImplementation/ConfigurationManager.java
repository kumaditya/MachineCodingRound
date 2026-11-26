package in.sp.EagerImplementation;

public class ConfigurationManager {

    // Eagerly created singleton instance (created during class loading)
    private static final ConfigurationManager instance = new ConfigurationManager();

    // Private constructor to prevent instantiation from outside the class
    private ConfigurationManager() {
    }

    // Public method to provide global access point to the instance
    public static ConfigurationManager getInstance() {
        return instance;
    }
}
