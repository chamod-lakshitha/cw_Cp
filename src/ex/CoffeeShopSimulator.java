package ex;

public class CoffeeShopSimulator {
    public static void main(String[] args){
        CoffeeShop coffeeShop = new CoffeeShop(10);
        Barista barista1 = new Barista(coffeeShop);
        Barista barista2 = new Barista(coffeeShop);
        Barista barista3 = new Barista(coffeeShop);
        Barista barista4 = new Barista(coffeeShop);
        Barista barista5 = new Barista(coffeeShop);
    }
}
