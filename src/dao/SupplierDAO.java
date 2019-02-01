package dao;

import java.util.List;

import domain.SupplierDTO;

public interface SupplierDAO {
	public void insertSupplier(SupplierDTO emp);
	public List<SupplierDTO> selectSuppliersList();
	public List<SupplierDTO> selectSuppliers(String searchWord);
	public SupplierDTO selectSupplier(String searchWord);
	public int countSuppliers();
	public String existSupplier(String searchWord);
	public void updateSupplier(SupplierDTO emp);
	public void deleteSupplier(SupplierDTO emp);
}
