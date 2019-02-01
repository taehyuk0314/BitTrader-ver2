package service;

import java.util.List;

import domain.CategorieDTO;

public interface CategorieService {
	public void registCategorie(CategorieDTO emp);
	public List<CategorieDTO> bringCategoriesList();
	public List<CategorieDTO> retrieveCategories(String searchWord);
	public CategorieDTO retrieveCategorie(String searchWord);
	public int countCategories();
	public boolean existCategorie(String searchWord);
	public void modifyCategorie(CategorieDTO emp);
	public void removeCategorie(CategorieDTO emp);
}
