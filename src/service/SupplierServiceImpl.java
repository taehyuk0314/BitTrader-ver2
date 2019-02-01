package service;

import java.util.List;

import dao.SupplierDAOImpl;
import domain.SupplierDTO;

public class SupplierServiceImpl implements SupplierService{
	private static SupplierServiceImpl intance = new SupplierServiceImpl();
	private SupplierServiceImpl() {dao=SupplierDAOImpl.getInstance();}		
	public static SupplierServiceImpl getIntance() {return intance;}
	SupplierDAOImpl dao;
	@Override
	public void registSupplier(SupplierDTO emp) {
		dao.insertSupplier(emp);
	}

	@Override
	public List<SupplierDTO> bringSuppliersList() {
		return dao.selectSuppliersList();
	}

	@Override
	public List<SupplierDTO> retrieveSuppliers(String searchWord) {
		return dao.selectSuppliers(searchWord);
	}

	@Override
	public SupplierDTO retrieveSupplier(String searchWord) {
		return dao.selectSupplier(searchWord);
	}

	@Override
	public int countSuppliers() {
		return dao.countSuppliers();
	}

	@Override
	public boolean existSupplier(String searchWord) {
		return false;
	}

	@Override
	public void modifySupplier(SupplierDTO emp) {
		dao.updateSupplier(emp);
	}

	@Override
	public void removeSupplier(SupplierDTO emp) {
		dao.deleteSupplier(emp);
	}

}
