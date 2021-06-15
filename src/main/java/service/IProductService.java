package service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAllProduct();

    void create(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void delete(int id);
}
