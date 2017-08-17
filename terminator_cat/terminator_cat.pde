int x;
int y;
int acceleration = 1;
void setup(){
  size(800,800);
  PImage catPic = loadImage("tabby.jpeg");
  background(catPic);
  x = 250;
  y = 440;
}

void draw(){
  ellipse(x,y,70,70);
  ellipse(x+140,y,70,70);
  fill(0,0,0);
  
  if(x >= 800 || y >= 800){
   print(x + ", " + y);
   PImage catPic = loadImage("tabby.jpeg");
  background(catPic);
  x = 250;
  y = 440;
  acceleration = 1;
  }
  
}

void keyPressed(){
 x += 2*acceleration;
 y += 2*acceleration;
 acceleration++;
 noStroke();
}