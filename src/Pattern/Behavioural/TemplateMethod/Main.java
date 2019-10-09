package Pattern.Behavioural.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        Transaction transaction = new Transaction(new OnlineTransaction());
        transaction.transaction();

        transaction.setTemplateMethod(new AtmTransaction());
        transaction.transaction();
    }
}
