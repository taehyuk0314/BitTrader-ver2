package service;

import java.util.List;

import dao.SupplierDAOImpl;
import domain.SupplierDTO;
import proxy.Proxy;

public class SupplierServiceImpl implements SupplierService{
	private static SupplierServiceImpl intance = new SupplierServiceImpl();
	private SupplierServiceImpl() {dao=SupplierDAOImpl.getInstance();}		
	public static SupplierServiceImpl getIntance() {return intance;}
	SupplierDAOImpl dao;
	@Override
	public void registSupplier(SupplierDTO sup) {
		dao.insertSupplier(sup);
	}

	@Override
	public List<SupplierDTO> bringSuppliersList(Proxy pxy) {
		return dao.selectSuppliersList(pxy);
	}

	@Override
	public List<SupplierDTO> retrieveSuppliers(Proxy pxy) {
		return dao.selectSuppliers(pxy);
	}

	@Override
	public SupplierDTO retrieveSupplier(SupplierDTO sup) {
		return dao.selectSupplier(sup);
	}

	@Override
	public int countSuppliers(Proxy pxy) {
		return dao.countSuppliers(pxy);
	}

	@Override
	public boolean existSupplier(SupplierDTO sup) {
		return dao.existSupplier(sup);
	}

	@Override
	public void modifySupplier(SupplierDTO sup) {
		dao.updateSupplier(sup);
	}

	@Override
	public void removeSupplier(SupplierDTO sup) {
		dao.deleteSupplier(sup);
	}

}
