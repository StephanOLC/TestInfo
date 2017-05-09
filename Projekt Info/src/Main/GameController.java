package Main;

import Inputs.Input;
import Objects.TextureTest;
import Objects.box;

public class GameController {
	
	public Interface inter;
	public Input input;
	
	public GameController(Interface inter){
		
		this.inter = inter;
		input = new Input(inter);
		new Thread(input).start();
		new Thread(new box(50,50,inter)).start();
		new Thread(new box(300,300,inter)).start();
		new Thread(new box(55,60,inter)).start();
		new Thread(new TextureTest(100, 100,150,150, "Graphics/icon.png", "png", inter)).start();
		new Thread(new TextureTest(-150,100,200,130, "Graphics/Trollface.png", "png",inter)).start();	
		
	}

}
