package service;

import java.util.List;

import dao.ProductDAOImpl;
import domain.ProductDTO;

public class ProductServiceImpl implements ProductService{
	private static ProductServiceImpl intance = new ProductServiceImpl();
	private ProductServiceImpl() {dao=ProductDAOImpl.getInstance();}		
	public static ProductServiceImpl getIntance() {return intance;}
	ProductDAOImpl dao;
	@Override
	public void registProduct(ProductDTO emp) {
		dao.insertProduct(emp);
	}

	@Override
	public List<ProductDTO> bringProductsList() {
		return dao.selectProductsList();
	}

	@Override
	public List<ProductDTO> retrieveProducts(String searchWord) {
		return dao.selectProducts(searchWord);
	}

	@Override
	public ProductDTO retrieveProduct(String searchWord) {
		return dao.selectProduct(searchWord);
	}

	@Override
	public int countProducts() {
		return dao.countProducts();
	}

	@Override
	public boolean existProduct(String searchWord) {
		return false;
	}

	@Override
	public void modifyProduct(ProductDTO emp) {
		dao.updateProduct(emp);
	}

	@Override
	public void removeProduct(ProductDTO emp) {
		dao.deleteProduct(emp);
	}
}
