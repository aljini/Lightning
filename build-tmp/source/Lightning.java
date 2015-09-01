import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 250;
int startY =0;
int endX = 0;
int endY = 0;
int color1 = (int)(Math.random ()*256);
int color2 = (int)(Math.random ()*256);
int color3 = (int)(Math.random ()*256);


public void setup()
{
	background(0);
  size(500,750);
  strokeWeight(1);
 
}
public void draw()

{

	stroke(color1,color2,color3);
	while (endY<750) {

		endX = startX + ((int)(Math.random()*20)-10);
		endY = startY + (int)(Math.random()*10);
		line(startX, startY, endX, endY);
		startX = endX;
		startY = endY;
	}
}
public void mousePressed()
{
	startX = (int)(Math.random()*501);
	startY = 0;
	endX = 0;
	endY = 0;
	color1 = (int)(Math.random ()*256);
	color2 = (int)(Math.random ()*256);
	color3 = (int)(Math.random ()*256);


}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
