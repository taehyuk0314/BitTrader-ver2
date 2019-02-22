package service;

import java.util.List;

import dao.CategoryDAOImpl;
import domain.CategoryDTO;
import proxy.Proxy;

public class CategoryServiceImpl implements CategoryService{
	private static CategoryServiceImpl intance = new CategoryServiceImpl();
	private CategoryServiceImpl() {dao=CategoryDAOImpl.getInstance();}		
	public static CategoryServiceImpl getIntance() {return intance;}
	CategoryDAOImpl dao;
	@Override
	public void registCategorie(CategoryDTO cat) {
		dao.insertCategorie(cat);
	}

	@Override
	public List<CategoryDTO> bringCategoriesList(Proxy pxy) {
		return dao.selectCategoriesList(pxy);
	}

	@Override
	public List<CategoryDTO> retrieveCategories(Proxy pxy) {
		return dao.selectCategories(pxy);
	}

	@Override
	public CategoryDTO retrieveCategorie(CategoryDTO cat) {
		return dao.selectCategorie(cat);
	}

	@Override
	public int countCategories(Proxy pxy) {
		return dao.countCategories(pxy);
	}

	@Override
	public boolean existCategorie(CategoryDTO cat) {
		return dao.existCategorie(cat);
	}

	@Override
	public void modifyCategorie(CategoryDTO cat) {
		dao.updateCategorie(cat);
	}

	@Override
	public void removeCategorie(CategoryDTO cat) {
		dao.deleteCategorie(cat);
	}
}
