package service;

import java.util.List;

import domain.SupplierDTO;
import proxy.Proxy;

public interface SupplierService {
	public void registSupplier(SupplierDTO sup);
	public List<SupplierDTO> bringSuppliersList(Proxy pxy);
	public List<SupplierDTO> retrieveSuppliers(Proxy pxy);
	public SupplierDTO retrieveSupplier(SupplierDTO sup);
	public int countSuppliers(Proxy pxy);
	public boolean existSupplier(SupplierDTO sup);
	public void modifySupplier(SupplierDTO sup);
	public void removeSupplier(SupplierDTO sup);
}
