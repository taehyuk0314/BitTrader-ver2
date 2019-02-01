package dao;

import java.util.List;

import domain.ProductDTO;

public interface ProductDAO {
	public void insertProduct(ProductDTO emp);
	public List<ProductDTO> selectProductsList();
	public List<ProductDTO> selectProducts(String searchWord);
	public ProductDTO selectProduct(String searchWord);
	public int countProducts();
	public String existProduct(String searchWord);
	public void updateProduct(ProductDTO emp);
	public void deleteProduct(ProductDTO emp);
}
