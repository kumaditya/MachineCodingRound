package in.sp.simpleFactory;

public class MacCheckBox implements CheckBox {

    @Override
    public void createCheckBox() {
        System.out.println("MacCheckBox created.");
    }
}
