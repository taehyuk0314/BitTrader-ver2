package service;

import java.util.List;

import dao.CategorieDAOImpl;
import domain.CategorieDTO;

public class CategorieServiceImpl implements CategorieService{
	private static CategorieServiceImpl intance = new CategorieServiceImpl();
	private CategorieServiceImpl() {dao=CategorieDAOImpl.getInstance();}		
	public static CategorieServiceImpl getIntance() {return intance;}
	CategorieDAOImpl dao;
	@Override
	public void registCategorie(CategorieDTO emp) {
		dao.insertCategorie(emp);
	}

	@Override
	public List<CategorieDTO> bringCategoriesList() {
		return dao.selectCategoriesList();
	}

	@Override
	public List<CategorieDTO> retrieveCategories(String searchWord) {
		return dao.selectCategories(searchWord);
	}

	@Override
	public CategorieDTO retrieveCategorie(String searchWord) {
		return dao.selectCategorie(searchWord);
	}

	@Override
	public int countCategories() {
		return dao.countCategories();
	}

	@Override
	public boolean existCategorie(String searchWord) {
		return false;
	}

	@Override
	public void modifyCategorie(CategorieDTO emp) {
		dao.updateCategorie(emp);
	}

	@Override
	public void removeCategorie(CategorieDTO emp) {
		dao.deleteCategorie(emp);
	}
}
