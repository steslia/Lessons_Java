package Pattern.Behavioural.TemplateMethod;

public class Transaction {
    private TemplateMethod templateMethod;

    public Transaction(TemplateMethod templateMethod) {
        this.templateMethod = templateMethod;
    }

    public void setTemplateMethod(TemplateMethod templateMethod) {
        this.templateMethod = templateMethod;
    }

    public void transaction(){
        templateMethod.transaction();
    }
}
