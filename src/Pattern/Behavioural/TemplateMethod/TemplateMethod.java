package Pattern.Behavioural.TemplateMethod;

//Один и тот же алгоритм выполнения действий но в рантайме
// подставляем разные реализации(принимает разные обекты,
// у каждова обекта прописана своя логика для абстрактных методов)

public abstract class TemplateMethod {
    public abstract void enterPrice();
    public abstract void updateBalance();
    public abstract void checkBalance();

    public void transaction(){
        enterPrice();
        updateBalance();
        checkBalance();
    }
}
