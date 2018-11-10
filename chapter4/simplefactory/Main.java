package chapter4.simplefactory;

public class Main  {
    public static void main(String[] args){
        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());
        pizza = pizzaStore.orderPizza("bacon");
        System.out.println(pizza.getName());
    }
}
