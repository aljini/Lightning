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

int startX = 0;
int startY = 150;
int endX = 0;
int endY = 150;
int color1 = (int)(Math.random ()*256);
int color2 = (int)(Math.random ()*256);
int color3 = (int)(Math.random ()*256);


public void setup()
{
  size(300,300);
  strokeWeight(1);
  stroke(color1,color2,color3);
}
public void draw()
{
	line(10, 10, 30, 50);
}
public void mousePressed()
{

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
