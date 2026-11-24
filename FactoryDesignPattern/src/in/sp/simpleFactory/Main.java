package in.sp.simpleFactory;

public class Main {

    public static void main(String[] args) {
        LoginScreen loginScreen = new LoginScreen();

        System.out.println("=== Testing Windows OS Resources ===");
        loginScreen.renderResources("Windows");

        System.out.println("\n=== Testing Mac OS Resources ===");
        loginScreen.renderResources("Mac");
    }
}
