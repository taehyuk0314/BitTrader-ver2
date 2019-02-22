package dao;

import java.util.List;

import domain.SupplierDTO;
import proxy.Proxy;

public interface SupplierDAO {
	public void insertSupplier(SupplierDTO sup);
	public List<SupplierDTO> selectSuppliersList(Proxy pxy);
	public List<SupplierDTO> selectSuppliers(Proxy pxy);
	public SupplierDTO selectSupplier(SupplierDTO sup);
	public int countSuppliers(Proxy pxy);
	public boolean existSupplier(SupplierDTO sup);
	public void updateSupplier(SupplierDTO sup);
	public void deleteSupplier(SupplierDTO sup);
}
