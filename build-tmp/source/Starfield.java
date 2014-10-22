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

public class Starfield extends PApplet {

/*
NormalParticle star;
//OddballParticle [] ster;
void setup()
{
	background(0);
	size(640,480);
	star = new NormalParticle();
	/*star = new NormalParticle[5];
	for (int i = 0; i<star.length; i++)
	{
		star[i] = new NormalParticle
	
	ster = new OddballParticle[5];
	for (int e = 0; e<ster.length; e++)
	{
		ster[e] = new OddballParticle
	}*/
/*}
void draw()
{	
	background(0);
	star.move();
	star.show();

	/*for(int i = 0; i<star.length; i++)
	{

	}
	for(int e = 0; e<ster.length; e++)
	{

	}*/
/*}
class NormalParticle implements Particle
{
	//public void particle;
	double x; double y; double angle; double speed;
NormalParticle()
{
	x = 320;
	y = 240;
	speed = Math.random()*2;
	angle = Math.PI*2*Math.random();


}
void move()
{
	x = x + Math.cos(angle)*speed;
	y = y + Math.sin(angle)*speed;
}
void show()
{
	int hue = (int)(Math.random()*155)+100;
	int siz = (int)(Math.random()*9);
	noStroke();
	fill (hue,hue,hue);
	ellipse((float) x,(float) y,siz,siz);
	fill(255);
	ellipse(300,200,10,10);
}
}
interface Particle
{
	//public void particle;
}
class OddballParticle implements Particle
{

OddballParticle()
{
	//public void particle;
}
}
*/








Particle [] dots = new Particle[1000];
public void setup()
{
	size(640,640);
	for (int i = 0; i<dots.length; i++)
	{
		dots[i] = new NormalParticle();	
		dots[1] = new LargeParticle();
		dots[2] = new LargeParticle();	
		dots[3] = new LargeParticle();
		dots[4] = new LargeParticle();	
	}
	dots[0] = new OddballParticle();
	//dots[1] = new LargeParticle();
}
public void draw()
{	 
	background(0);
	for (int i = 0; i<dots.length; i++)
	{
		dots[i].move();
		dots[i].show();
	}
}
interface Particle{
	public void show();
	public void move();
}
class NormalParticle implements Particle
{
	 double x;
	 double y;
	 double angle;
	 double speed;
	 public void particle(){}	
NormalParticle()
{
	x = 320;
	y = 320;
	speed = (Math.random()*8)+5;
	angle = Math.PI*2*Math.random();
}
public void move()
{
	x = x + /*(int)*/(Math.cos(angle)*speed)+(Math.random()*3)-2;
	y = y + /*(int)*/(Math.tan(angle)*speed)+(Math.random()*3)-2;
}
public void show()
{
	int hue = (int)(Math.random()*155)+100;
	int hue1 = (int)(Math.random()*155)+100;
	int hue2 = (int)(Math.random()*155)+100; 
	int siz = (int)(Math.random()*9);
	stroke(hue,hue1,hue2);
	fill (hue,hue,hue);
	ellipse((float) x,(float) y,siz,siz);
	if(x>680 || x<0)
	{
		x = mouseX;
		y = mouseY;
	}
	else if (y>680 || y<0)
	{
		x=mouseX;
		y=mouseY;
	}
}
}
class OddballParticle implements Particle
{
	 double x;
	 double y;
	 double angle;
	 double speed;
	public void particle(){}
OddballParticle()
{
	x = 320;
	y = 240;
	speed = Math.random()*1-1;
	angle = Math.PI*2*Math.random();
}
public void move()
{
	x = x + Math.cos(angle)*speed;
	y = y + Math.sin(angle)*speed;
}
public void show()
{
	//int hue = 0;
	int siz = (int)(Math.random()*15);
	noStroke();
	fill (0,0,255);
	ellipse((float) x,(float) y,siz,siz);
}
}
class LargeParticle extends NormalParticle implements Particle
{
	LargeParticle()
	{
	speed = (Math.random()*3);
	}
	public void show()
	{
	int hue = (int)(Math.random()*155)+100;
	int hue1 = (int)(Math.random()*155)+100;
	int hue2 = (int)(Math.random()*155)+100; 
	int siz = (int)(Math.random()*20);
	stroke(hue,hue1,hue2);
	fill (hue,hue1,hue2);
	ellipse((float) x,(float) y,siz,siz);
	if(x>680 || x<0)
	{
		x = mouseX;
		y = mouseY;
	}
	else if (y>680 || y<0)
	{
		x=mouseX;
		y=mouseY;
	}
}}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Starfield" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
