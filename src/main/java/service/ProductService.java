package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    private List<Product> productList = new ArrayList<>();

    @Override
    public List<Product> findAllProduct() {
        return productList;
    }

    @Override
    public void create(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public void update(int id, Product product) {
        for (Product product1 : productList) {
            if (product1.getId() == id) {
                product1 = product;
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                break;
            }
        }
    }
}
