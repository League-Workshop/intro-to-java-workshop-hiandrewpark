//import ddf.minim.*;
PImage backgroundImage;
//Minim minim;
//AudioSample sound;
int ballX;
int ballY;
int speedX;
int speedY;
int paddleX;
int paddleY;
int paddleLength;
void setup(){
  
//  minim = new Minim (this);  
//  sound = minim.loadSample("BD.mp3", 128);
 size(800,600); 
 backgroundImage = loadImage("rainbow.jpg");
 ballX = 10;
 ballY = 20;
 speedX = 5;
 speedY = 5;
 
 paddleY = 500;
 paddleLength = 60;
}

void draw(){
  image(backgroundImage,0,0);
  paddleX = mouseX;
  background(0,0,0);
  ellipse(ballX,ballY,30,30);
  rect(paddleX,paddleY,paddleLength,7);
  fill(255,0,0);
  stroke(0,255,0);
  ballX = ballX + speedX;
  ballY = ballY + speedY;
  if (ballX >= 800 || ballX <= 0){
    speedX = -speedX;
  }

  if (intersects(ballX,ballY,paddleX,paddleY,paddleLength) == true || ballY <= 0){
    speedY = -speedY;
  }
  //if (y == 800){
  // sound.trigger();  
  //}
  
  if (ballY == 600){
    print("YOU SUCK");
    
  }

}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
  return true;
else 
  return false;
}