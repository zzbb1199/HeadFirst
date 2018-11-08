package factory.factorymethod;

public class Main {
    public static void main(String[] args){
        PizzaStore npSotre = new NanPingPizzaStore();
        Pizza npPizza = npSotre.orderPizza("a");
        System.out.println(npPizza.getName());

        PizzaStore jbStore = new JiangBeiPizzaStore();
        Pizza jbPizza = jbStore.orderPizza("b");
        System.out.println(jbPizza.getName());
    }
}
