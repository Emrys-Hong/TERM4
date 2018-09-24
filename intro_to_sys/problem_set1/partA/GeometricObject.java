package edu.sutd.istd;

public class GeometricObject {

	public String color = "white";
	public boolean filled = false;
	public java.util.Date dateCreated;	
	
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();		
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
		
	}
	
	public String toString() {
		return "color: " + color + "\nfilled: " + filled;
		
	}
}
