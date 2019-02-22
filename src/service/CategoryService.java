package service;

import java.util.List;

import domain.CategoryDTO;
import proxy.Proxy;

public interface CategoryService {
	public void registCategorie(CategoryDTO cat);
	public List<CategoryDTO> bringCategoriesList(Proxy pxy);
	public List<CategoryDTO> retrieveCategories(Proxy pxy);
	public CategoryDTO retrieveCategorie(CategoryDTO cat);
	public int countCategories(Proxy pxy);
	public boolean existCategorie(CategoryDTO cat);
	public void modifyCategorie(CategoryDTO cat);
	public void removeCategorie(CategoryDTO cat);
}
