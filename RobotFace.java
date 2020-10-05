import java.awt.Color;

import acm.graphics.GCanvas;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;

public class RobotFace extends GraphicsProgram {

	private static double headW = 200;
	private static double headH = 300;
	private static double EYE = 35;
	private static double mouthW = 110;
	private static double mouthH = 30;

	public void run() {
		
		// makes robot face
		getRobotFace();

	}

	
	public void getRobotFace() {
		GCanvas gc = getColoredCanvas(Color.white);
		GRect head = getHead();
		GOval leftEye = getLeftEye();
		GOval rightEye = getRightEye();
		GRect mouth = getMouth();
		gc.add(head);
		gc.add(leftEye);
		gc.add(rightEye);
		gc.add(mouth);

	}
	
	public GRect getMouth() {
		double boundX = getWidth() / 2 - mouthW / 2;
		double boundY = getHeight() / 2 + headH / 4 - mouthH / 2;
		GRect mouth = new GRect(boundX, boundY, mouthW, mouthH);
		mouth.setColor(Color.white);
		mouth.setFillColor(Color.white);
		mouth.setFilled(true);
		mouth.setVisible(true);
		return mouth;
	}


	public GOval getRightEye() {
		GOval eye = new GOval(EYE, EYE);
		double canvasWidth = getWidth();
		double canvasHeight = getHeight();
		double boundX = (canvasWidth / 2) + (headW / 4) - EYE / 2;
		double boundY = (canvasHeight / 2) - (headH / 4) - EYE / 2;
		eye.setBounds(boundX, boundY, EYE, EYE);
		eye.setColor(Color.gray);
		eye.setFillColor(Color.yellow);
		eye.setVisible(true);
		eye.setFilled(true);

		return eye;
	}


	public GOval getLeftEye() {
		GOval eye = new GOval(EYE, EYE);
		double canvasWidth = getWidth();
		double canvasHeight = getHeight();
		double boundX = (canvasWidth / 2) - (headW / 4) - EYE / 2;
		double boundY = (canvasHeight / 2) - (headH / 4) - EYE / 2;
		eye.setBounds(boundX, boundY, EYE, EYE);
		eye.setColor(Color.gray);
		eye.setFillColor(Color.yellow);
		eye.setVisible(true);
		eye.setFilled(true);

		return eye;
	}

	
	public GRect getHead() {
		GRect head = new GRect(headW, headH);
		double canvasWidth = getWidth();
		double canvasHeight = getHeight();
		double boundX = (canvasWidth / 2) - (head.getWidth() / 2);
		double boundY = (canvasHeight / 2) - (head.getHeight() / 2);
		head.setBounds(boundX, boundY, headW, headH);
		head.setColor(Color.black);
		head.setFillColor(Color.gray);
		head.setVisible(true);
		head.setFilled(true);

		return head;
	}


	public GCanvas getColoredCanvas(Color color) {
		GCanvas canvas = this.getGCanvas();
		canvas.setBackground(color);
		return canvas;
	}

}