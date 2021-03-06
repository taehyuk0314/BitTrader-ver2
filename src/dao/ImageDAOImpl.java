package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.ImageDTO;
import enums.Vendor;
import factory.DatabaseFactory;
import proxy.Proxy;

public class ImageDAOImpl implements ImageDAO{
	private static ImageDAOImpl instance = new ImageDAOImpl();
	private ImageDAOImpl() {}
	public static ImageDAOImpl getInstance() {return instance;}




	@Override
	public void createImage(ImageDTO img) {
		String sql = "insert into image(IMG_SEQ,IMG_NAME,IMG_EXTENTION,OWNER)\r\n" + 
				"values(IMG_SEQ.NEXTVAL,?,?,?)";
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.setString(1, img.getImgName());
			ps.setString(2, img.getImgExtention());
			ps.setString(3, img.getOwner());
			int rs =ps.executeUpdate();
			if(rs==1) {
				System.out.println("값이 들어감");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<ImageDTO> imageList(Proxy pxy) {
		List<ImageDTO> list = new ArrayList<>();  
		String sql = "";
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ImageDTO img =null;
			while(rs.next()) {
				img = new ImageDTO();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<ImageDTO> selectImages(Proxy pxy) {
		List<ImageDTO> list = new ArrayList<>();
		String sql ="";
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.setString(1, "");
			ResultSet rs = ps.executeQuery();
			ImageDTO img =null;
			while(rs.next()) {
				img= new ImageDTO();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ImageDTO selectImage(ImageDTO img) {
		ImageDTO imge = new ImageDTO();
		String sql = " select * from image  where IMG_SEQ like ?";
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			System.out.println(img.getImgSeq());
			ps.setString(1, img.getImgSeq());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				imge = new ImageDTO();
				imge.setImgSeq(rs.getString("IMG_SEQ"));
				imge.setImgName(rs.getString("IMG_NAME"));
				imge.setImgExtention(rs.getString("IMG_EXTENTION"));
				imge.setOwner(rs.getString("OWNER"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("셀렉트이미지 값: "+imge.toString());
		return imge;
	}

	@Override
	public int countImages(Proxy pxy) {
		int count = 0;
		String sql ="";
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public void updateImage(ImageDTO img) {
		String sql ="";
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.setString(1, "");
			int rs = ps.executeUpdate();
			if(rs==1) {
				System.out.println("값이들어감");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteImage(ImageDTO img) {
		String sql ="";
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ps.setString(1, "");
			int rs = ps.executeUpdate();
			if(rs==1) {
				System.out.println("값이 삭제됨");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public String lastImageSeq() {
		String seq = "";
		String sql="select max(IMG_SEQ) IMG_SEQ\r\n" + 
				"from image";
		try {
			PreparedStatement ps =DatabaseFactory.createDatabase(Vendor.ORACLE).getConnection().prepareStatement(sql);
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
	 			seq=rs.getString("IMG_SEQ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return seq;
	}

}
