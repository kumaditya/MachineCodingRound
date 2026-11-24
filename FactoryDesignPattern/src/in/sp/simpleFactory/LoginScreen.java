package in.sp.simpleFactory;

public class LoginScreen {

    private ButtonFactory buttonFactory;
    private CheckBoxFactory checkBoxFactory;

    public LoginScreen() {
        this.buttonFactory = new ButtonFactory();
        this.checkBoxFactory = new CheckBoxFactory();
    }

    public LoginScreen(ButtonFactory buttonFactory, CheckBoxFactory checkBoxFactory) {
        this.buttonFactory = buttonFactory;
        this.checkBoxFactory = checkBoxFactory;
    }

    public void renderResources(String osType) {
        buttonFactory.createButton(osType);
        checkBoxFactory.createCheckBox(osType);
    }
}
