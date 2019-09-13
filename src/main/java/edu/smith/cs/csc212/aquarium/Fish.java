package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;


public class Fish {
	//position of the fish
	int x; 
	int y; 
	//color of the fish
	Color color; 
	boolean facingLeft; 
	boolean isLittle;
	
	
	public Fish (int startX, int startY, Color c, boolean direction, boolean size) {
		this.x = startX; 
		this.y = startY; 
		this.color = c; 
		this.facingLeft = direction; 
		this.isLittle = size; 
		
	}
	
	public void draw(Graphics2D window) { 
		this.swim(); 
		
		DrawFish.facingLeft(window, 
				this.color, this.x, this.y);
		DrawFish.facingRight(window, 
				this.color, this.x, this.y);
		DrawFish.smallFacingRight(window, 
				this.color, this.x, this.y);
		DrawFish.smallFacingLeft(window, 
				this.color, this.x, this.y);
		
		
	}
	
	public void swim() {
		this.y += 1;
	}
	
	

}
