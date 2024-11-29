package ex;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeShop {
    int capacity;
    Queue<String> queue = new LinkedList<>();

    public CoffeeShop(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void placeOrder(String order){
        while(queue.size() >= capacity){
            try {
                wait();
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        queue.add(order);
        notifyAll();
    }

    public synchronized String prepareOrder(){
        while(queue.isEmpty()){
            try {
                wait();
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        String order = queue.poll();
        notifyAll();
        return order;
    }
}
