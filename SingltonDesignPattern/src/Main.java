import in.sp.DoubleCheck.ConfigurationManager;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {

            ConfigurationManager c1 =
                    ConfigurationManager.getInstance();

            System.out.println("Thread 1: " + c1.hashCode());

        });

        Thread t2 = new Thread(() -> {

            ConfigurationManager c2 =
                    ConfigurationManager.getInstance();

            System.out.println("Thread 2: " + c2.hashCode());

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }


}
