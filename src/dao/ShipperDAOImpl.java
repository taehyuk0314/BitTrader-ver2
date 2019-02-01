package dao;

import java.util.List;

import domain.ShipperDTO;

public class ShipperDAOImpl implements ShipperDAO{
	private static ShipperDAOImpl instance = new ShipperDAOImpl();
	private ShipperDAOImpl() {}
	public static ShipperDAOImpl getInstance() {return instance;}

	@Override
	public void insertShipper(ShipperDTO shi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShipperDTO> selectShippers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShipperDTO> selectShipperByNames(String ShipperName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShipperDTO selectShipperByID(String ShipperID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countShipper() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existShipper(String ShipperID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateShipper(ShipperDTO shi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteShipper(ShipperDTO shi) {
		// TODO Auto-generated method stub
		
	}

}
