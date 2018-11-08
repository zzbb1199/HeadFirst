package factory.absctractfactory;

public class Main {
    public static void main(String[] args){
        PizzaStore npSotre = new NanPingPizzaStore();
        Pizza npPizza1 = npSotre.orderPizza("a");
        System.out.println(npPizza1.toString());

        Pizza npPizza2 = npSotre.orderPizza("b");
        System.out.println(npPizza2.toString());

        PizzaStore jbStore = new JiangBeiPizzaStore();
        Pizza jbPizza1 = jbStore.orderPizza("a");
        System.out.println(jbPizza1.toString());

        Pizza jbPizza2 = jbStore.orderPizza("b");
        System.out.println(jbPizza2.toString());
    }
}
