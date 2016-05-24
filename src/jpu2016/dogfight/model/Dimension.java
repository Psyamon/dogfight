package jpu2016.dogfight.model;

public class Dimension {
	private int width;
	private int height;
	
	public Dimension(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public Dimension(Dimension dimension){
		this.height = dimension.height;
		this.width = dimension.width;
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public void setHeight(int height){
		this.height = height;
	}

}
