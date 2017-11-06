import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
	ArrayList<BouncingBox> boxes;

	/** Initializes this class for drawing. */
	public DrawGraphics() { //constructor
		boxes = new ArrayList<BouncingBox>();
		
		boxes.add(new BouncingBox(200, 50, Color.RED));
		boxes.get(0).setMovementVector(1,3);
		
		boxes.add(new BouncingBox(100, 50, Color.GREEN));
		boxes.get(1).setMovementVector(100, 4);
		
		boxes.add(new BouncingBox(25, 50, Color.ORANGE));
		boxes.get(2).setMovementVector(20, 4);
	}

	/** Draw the contents of the window on surface. Called 20 times per second. */
	public void draw(Graphics surface) {
		surface.drawLine(50, 50, 250, 250);
		surface.drawArc(10, 10, 250, 100, 45, 315);
		surface.drawRect(50, 50, 100, 200);
		surface.drawString("Don't do it", 200, 10);
		
		for(int i = 0; i < boxes.size(); i++) {
			boxes.get(i).draw(surface);
		}
	}
}