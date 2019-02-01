package service;

import java.util.List;

import dao.ShipperDAOImpl;
import domain.ShipperDTO;

public class ShipperServiceImpl implements ShipperService{
	private static ShipperServiceImpl instance = new ShipperServiceImpl();
	private ShipperServiceImpl() {dao = ShipperDAOImpl.getInstance();}
	public static ShipperServiceImpl getInstance() {return instance;}
	ShipperDAOImpl dao;
	@Override
	public void registShipper(ShipperDTO shi) {
		dao.insertShipper(shi);
	}

	@Override
	public List<ShipperDTO> bringShippers() {
		return dao.selectShippers();
	}

	@Override
	public List<ShipperDTO> retrieveShipperByNames(String ShipperName) {
		return dao.selectShipperByNames(ShipperName);
	}

	@Override
	public ShipperDTO retrieveShipperByID(String ShipperID) {
		return dao.selectShipperByID(ShipperID);
	}

	@Override
	public int countShipper() {
		return dao.countShipper();
	}

	@Override
	public boolean existShipper(String ShipperID) {
		return false;
	}

	@Override
	public void modifyShipper(ShipperDTO shi) {
		dao.updateShipper(shi);
	}

	@Override
	public void removeShipper(ShipperDTO shi) {
		dao.deleteShipper(shi);
	}

}
