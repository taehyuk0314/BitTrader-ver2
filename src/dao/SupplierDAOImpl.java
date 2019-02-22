package dao;

import java.util.List;

import domain.SupplierDTO;
import proxy.Proxy;

public class SupplierDAOImpl implements SupplierDAO{
	private static SupplierDAOImpl instance = new SupplierDAOImpl();
	private SupplierDAOImpl() {}
	public static SupplierDAOImpl getInstance() {return instance;}

	@Override
	public void insertSupplier(SupplierDTO sup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SupplierDTO> selectSuppliersList(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SupplierDTO> selectSuppliers(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SupplierDTO selectSupplier(SupplierDTO sup) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countSuppliers(Proxy pxy) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existSupplier(SupplierDTO sup) {
		return false;
	}

	@Override
	public void updateSupplier(SupplierDTO sup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSupplier(SupplierDTO sup) {
		// TODO Auto-generated method stub
		
	}
}
