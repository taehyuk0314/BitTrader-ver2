package dao;

import java.util.List;

import domain.CategorieDTO;

public class CategorieDAOImpl implements CategorieDAO{
	private static CategorieDAOImpl instance = new CategorieDAOImpl();
	private CategorieDAOImpl() {}
	public static CategorieDAOImpl getInstance() {return instance;}

	@Override
	public void insertCategorie(CategorieDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CategorieDTO> selectCategoriesList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategorieDTO> selectCategories(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategorieDTO selectCategorie(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCategories() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String existCategorie(String searchWord) {
		return null;
	}

	@Override
	public void updateCategorie(CategorieDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategorie(CategorieDTO emp) {
		// TODO Auto-generated method stub
		
	}
}
