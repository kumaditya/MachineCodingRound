package in.sp.simpleFactory;

public class WindowsCheckBox implements CheckBox {

    @Override
    public void createCheckBox() {
        System.out.println("WindowsCheckBox created.");
    }
}
