package service;

import java.util.List;

import domain.ProductDTO;

public interface ProductService {
	public void registProduct(ProductDTO emp);
	public List<ProductDTO> bringProductsList();
	public List<ProductDTO> retrieveProducts(String searchWord);
	public ProductDTO retrieveProduct(String searchWord);
	public int countProducts();
	public boolean existProduct(String searchWord);
	public void modifyProduct(ProductDTO emp);
	public void removeProduct(ProductDTO emp);
}
