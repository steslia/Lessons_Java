package Pattern.Behavioural.TemplateMethod;

public class AtmTransaction extends TemplateMethod {
    @Override
    public void enterPrice() {
        System.out.println("ATM: entered pin cod");
    }

    @Override
    public void updateBalance() {
        System.out.println("ATM: update balance");
    }

    @Override
    public void checkBalance() {
        System.out.println("ATM: checked balance");
    }
}
