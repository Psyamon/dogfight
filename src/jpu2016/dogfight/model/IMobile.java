package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point;

import com.sun.javafx.geom.Area;

public interface IMobile {
	
	public Direction getDirection();
	
	public void setDirection(Direction direction);
	
	public Point getposition();
	
	public Dimension getDimension();
	
	public int getWidth();
	
	public int getHeight();
	
	public int getSpeed();
	
	public Image getImage();
	
	public void move();
	
	public void placeInArea(Area area);
	
	public boolean isPlayer(int player);
	
	public void setDogfightModel(DogfightModel dogfightModel);
	
	public boolean hit();
	
	public boolean isWeapon();
	
	
	
	

}
