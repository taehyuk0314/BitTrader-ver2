package service;

import java.util.List;

import domain.ImageDTO;
import proxy.Proxy;

public interface ImageService {
	public void addImage(ImageDTO img);
	public List<ImageDTO> imageList(Proxy pxy);
	public List<ImageDTO> searchImages(Proxy pxy);
	public ImageDTO retrieveImage(ImageDTO img);
	public int countImages(Proxy pxy);
	public void modifyImage(ImageDTO img);
	public void removeImage(ImageDTO img);
}
