package Pattern.Creational.Singleton;

//Создаеться только один объект класса
public class Singleton {
    private static Singleton singleton;

    //Делаем через локальную переменую ибо так быстрее, можно и без нее
    public static Singleton getInstance() {
        Singleton localInstance = singleton;
        if (localInstance == null){
            synchronized (Singleton.class) {
                localInstance = singleton;
                if (localInstance == null){
                    singleton = localInstance = new Singleton();
                }
            }
        }

        return localInstance;
    }
}
