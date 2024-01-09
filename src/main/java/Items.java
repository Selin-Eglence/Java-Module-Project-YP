public class Items {
    double cost;
    String nameProduct;

    Items(double price, String name) {
        cost = price;
        nameProduct = name;
    }

    public String nameOfProduct() {

        return nameProduct;
    }
    public double costOfProduct() {

        return cost;
    }


}

