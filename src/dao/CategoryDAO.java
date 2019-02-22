package dao;

import java.util.List;

import domain.CategoryDTO;
import proxy.Proxy;

public interface CategoryDAO {
	public void insertCategorie(CategoryDTO cat);
	public List<CategoryDTO> selectCategoriesList(Proxy pxy);
	public List<CategoryDTO> selectCategories(Proxy pxy);
	public CategoryDTO selectCategorie(CategoryDTO cat);
	public int countCategories(Proxy pxy);
	public boolean existCategorie(CategoryDTO cat);
	public void updateCategorie(CategoryDTO cat);
	public void deleteCategorie(CategoryDTO cat);
}
