package dao;

import java.util.List;

import domain.ShipperDTO;

public interface ShipperDAO {
	public void insertShipper(ShipperDTO shi);
	public List<ShipperDTO> selectShippers();
	public List<ShipperDTO> selectShipperByNames(String ShipperName);
	public ShipperDTO selectShipperByID(String ShipperID);
	public int countShipper();
	public boolean existShipper(String ShipperID);
	public void updateShipper(ShipperDTO shi);
	public void deleteShipper(ShipperDTO shi);
}
