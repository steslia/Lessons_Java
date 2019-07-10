package Generics;

import java.util.List;

public interface BoxList<E, T> extends List<E> {
    T calcSum (E elemen1, T element2);

}
