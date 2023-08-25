package Services;

import java.util.List;

import Domen.Product;

public class VendingMachine {
     private Holder holder;
    private CoinDispenser dispenser;
    private List<Product> productList;

    public Product buyProduct(int index) {
        return productList.get(index);
    }

    public void release() {

    }
}
