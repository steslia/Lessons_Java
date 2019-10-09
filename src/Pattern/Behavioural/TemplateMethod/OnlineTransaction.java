package Pattern.Behavioural.TemplateMethod;

public class OnlineTransaction extends TemplateMethod {
    @Override
    public void enterPrice() {
        System.out.println("Online: entered pin cod");
    }

    @Override
    public void updateBalance() {
        System.out.println("Online: update balance");
    }

    @Override
    public void checkBalance() {
        System.out.println("Online: checked balance");
    }
}
