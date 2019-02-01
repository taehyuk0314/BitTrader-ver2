package dao;

import java.util.List;

import domain.ProductDTO;

public class ProductDAOImpl implements ProductDAO{
	private static ProductDAOImpl instance = new ProductDAOImpl();
	private ProductDAOImpl() {}
	public static ProductDAOImpl getInstance() {return instance;}

	@Override
	public void insertProduct(ProductDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductDTO> selectProductsList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> selectProducts(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO selectProduct(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countProducts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String existProduct(String searchWord) {
		return null;
	}

	@Override
	public void updateProduct(ProductDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(ProductDTO emp) {
		// TODO Auto-generated method stub
		
	}

}
