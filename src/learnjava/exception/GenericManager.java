package javacore.exception;

import java.util.ArrayList;
import java.util.List;

public class GenericManager<T> {

    List<T> list = new ArrayList<>();

    /**
     *
     * @param t
     */
    public void add(T t) {
        list.add(t);
    }

    /**
     *
     */
    public void displayAll() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            list.forEach(t -> System.out.println(t));
        }
    }

    /**
     *
     * @return
     */
    public int getSize() {
        return list.size();
    }

    /**
     *
     * @return
     */
    public T firtsItemList() throws EmptyListExeption {
        if (list.isEmpty()) {
            throw new EmptyListExeption("Lỗi! Danh sách trống.");
        }
        return list.getFirst();
    }

    /**
     *
     * @return
     */
    public T lastItemList() throws EmptyListExeption {
        if (list.isEmpty()) {
            throw new EmptyListExeption("Lỗi! Danh sách trống");
        }
        return list.getLast();
    }
}
