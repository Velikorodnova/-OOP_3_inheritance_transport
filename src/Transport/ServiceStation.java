package Transport;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {


    private final Queue<T> queue = new ArrayDeque<>();
    public T remove;

    String name;

    public ServiceStation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAvto(T t) {
        queue.offer(t);
    }

    public void doServisAvto() {
        System.out.println("Техосмотр произведен");
    }

    public void dequeue() {
        T t = queue.poll();
        if (t != null) {
            doServisAvto();
            dequeue();
        } else {
            System.out.println("В очереди на техобслуживание никого нет");
        }
    }

    public void remove(Transport t) {
        }
    }

