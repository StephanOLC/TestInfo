package gameLogic;

import java.util.ArrayList;

public class Stein implements IngameObject {
	private World world;
	private Vektor position;
	private int healthPoints;
	
	public Stein(Vektor position, World world){
		this.world = world;
		this.position = position;
		healthPoints = 100;
	}

	public void draw() {
		// TODO Auto-generated method stub

	}
	
	public void collision(ArrayList<Integer> collisions){
		for(int effect : collisions){
			switch (effect){
				case 0: world.deathNote(this);
				break;
			
				default: healthPoints = healthPoints - effect;
				break;
			}
		}
	}
	
	public void tick(){
		collision(world.detectCollissionType(position));
		//stuff that object should do in a tick
	}

}
