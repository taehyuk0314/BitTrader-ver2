package service;

import java.util.List;

import domain.SupplierDTO;

public interface SupplierService {
	public void registSupplier(SupplierDTO sup);
	public List<SupplierDTO> bringSuppliersList();
	public List<SupplierDTO> retrieveSuppliers(String searchWord);
	public SupplierDTO retrieveSupplier(String searchWord);
	public int countSuppliers();
	public boolean existSupplier(String searchWord);
	public void modifySupplier(SupplierDTO sup);
	public void removeSupplier(SupplierDTO sup);
}
