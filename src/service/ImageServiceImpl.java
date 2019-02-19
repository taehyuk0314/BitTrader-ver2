package service;

import java.util.List;

import dao.ImageDAOImpl;
import domain.ImageDTO;
import proxy.Proxy;

public class ImageServiceImpl implements ImageService{
	private static ImageServiceImpl instance = new ImageServiceImpl();
	private ImageServiceImpl() {dao = ImageDAOImpl.getInstance();}
	public static ImageServiceImpl getInstance() {return instance;}
	ImageDAOImpl dao;

	@Override
	public void addImage(ImageDTO img) {
		dao.createImage(img);
	}

	@Override
	public List<ImageDTO> imageList(Proxy pxy) {
		return dao.imageList(pxy);
	}

	@Override
	public List<ImageDTO> searchImages(Proxy pxy) {
		return dao.selectImages(pxy);
	}

	@Override
	public ImageDTO retrieveImage(ImageDTO img) {
		return dao.selectImage(img);
	}

	@Override
	public int countImages(Proxy pxy) {
		return dao.countImages(pxy);
	}

	@Override
	public void modifyImage(ImageDTO img) {
		dao.updateImage(img);
	}

	@Override
	public void removeImage(ImageDTO img) {
		dao.deleteImage(img);
	}

}
