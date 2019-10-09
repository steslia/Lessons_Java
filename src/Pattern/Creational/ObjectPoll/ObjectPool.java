package Pattern.Creational.ObjectPoll;

import java.util.HashSet;

public abstract class ObjectPool<T> {
    private HashSet<T> available = new HashSet<>();
    private HashSet<T> inUse = new HashSet<>();

    //Каждый наследник сам описывает метод для создания
    protected abstract T create();

    //Получить объект если в списке пусто и нет свободных объектов то создаем
    // Если есть тогда из списка ожидания перекладываем в список используюмых
    public synchronized T get() {
        if (available.size() <= 0) {
            available.add(create());
        }

        T t = available.iterator().next();
        available.remove(t);
        inUse.add(t);

        return t;
    }

    //Положить из списка используюмых в список который хранит объекты для ожидания вызова
    public synchronized void put(T t) {
        inUse.remove(t);
        available.add(t);
    }

    @Override
    public String toString() {
        return String.format("Pool available=%d, inUse=%d", available.size(), inUse.size());
    }
}
