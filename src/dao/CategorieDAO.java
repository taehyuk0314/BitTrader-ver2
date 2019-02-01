package dao;

import java.util.List;

import domain.CategorieDTO;

public interface CategorieDAO {
	public void insertCategorie(CategorieDTO emp);
	public List<CategorieDTO> selectCategoriesList();
	public List<CategorieDTO> selectCategories(String searchWord);
	public CategorieDTO selectCategorie(String searchWord);
	public int countCategories();
	public String existCategorie(String searchWord);
	public void updateCategorie(CategorieDTO emp);
	public void deleteCategorie(CategorieDTO emp);
}
