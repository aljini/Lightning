int startX = 250;
int startY = 375;
int endX = 250;
int endY = 375;
int color1 = (int)(Math.random ()*256);
int color2 = (int)(Math.random ()*256);
int color3 = (int)(Math.random ()*256);


void setup()
{
  size(500,750);
  strokeWeight(1);
  stroke(color1,color2,color3);
}
void draw()
{
	line(10, 10, 30, 50);
}
void mousePressed()
{

}

