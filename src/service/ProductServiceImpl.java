package service;

import java.util.List;

import dao.ProductDAOImpl;
import domain.ProductDTO;
import proxy.Proxy;

public class ProductServiceImpl implements ProductService{
	private static ProductServiceImpl intance = new ProductServiceImpl();
	private ProductServiceImpl() {dao=ProductDAOImpl.getInstance();}		
	public static ProductServiceImpl getIntance() {return intance;}
	ProductDAOImpl dao;
	@Override
	public void registProduct(ProductDTO pro) {
		dao.insertProduct(pro);
	}

	@Override
	public List<ProductDTO> bringProductsList(Proxy pxy) {
		return dao.selectProductsList(pxy);
	}

	@Override
	public List<ProductDTO> retrieveProducts(Proxy pxy) {
		return dao.selectProducts(pxy);
	}

	@Override
	public ProductDTO retrieveProduct(ProductDTO pro) {
		return dao.selectProduct(pro);
	}

	@Override
	public int countProducts(Proxy pxy) {
		return dao.countProducts(pxy);
	}

	@Override
	public boolean existProduct(ProductDTO pro) {
		return dao.existProduct(pro);
	}

	@Override
	public void modifyProduct(ProductDTO pro) {
		dao.updateProduct(pro);
	}

	@Override
	public void removeProduct(ProductDTO pro) {
		dao.deleteProduct(pro);
	}
}
