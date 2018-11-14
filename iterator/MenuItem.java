package iterator;

public class MenuItem {
    String name;
    String desciption;
    double price;

    public MenuItem(String name, String desciption, double price) {
        this.name = name;
        this.desciption = desciption;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
