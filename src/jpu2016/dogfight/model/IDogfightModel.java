package jpu2016.dogfight.model;

import java.util.ArrayList;

public interface IDogfightModel {
	
	abstract public IArea getArea();
	abstract public void buildArea(Dimension dimension);
	abstract public void addMobile(IMobile Mobile );
	abstract public void removeMobile(IMobile Mobile);
	abstract public ArrayList<IMobile> getMobiles();
	abstract public IMobile getMobileByPlayer(int player);
	abstract public void setMobilesHavesMoved();
	

}
