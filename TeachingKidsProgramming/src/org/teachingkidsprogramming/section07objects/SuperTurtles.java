package org.teachingkidsprogramming.section07objects;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.Turtle;

public class SuperTurtles
{
  public MultiTurtleWindow mtw = new MultiTurtleWindow();
  public SuperTurtles()
  {
    showSomeTurtles();
  }
  public static void main(String[] args)
  {
    new SuperTurtles();
  }
  private void showSomeTurtles()
  {
    makeSpeedyTortose();
    makeSlowTortose();
    makeCarzyTortose();
  }
  private void makeCarzyTortose()
  {
    Turtle carzytortose = new Turtle();
    //        Add your crazyTurtle to your MultiTurtleWindow
    mtw.addAndShowTurtle(carzytortose);
    //        Have your crazyTurtle draw a 55 pixel long lightning bolt
    carzytortose.drawLightning(55);
    carzytortose.setSound(new Sound(Sound.TKPSound.Gong));
    carzytortose.speak();
    //  ------------- End of makeCrazyTurtle --#5.2
  }
  private void makeSlowTortose()
  {
    //  ------------- Recipe for makeSlowTurtle --#3.0
    //        Create a new slowTurtle instance
    Turtle slowtortose = new Turtle();
    //        Add your slowTurtle to your MultiTurtleWindow
    mtw.addAndShowTurtle(slowtortose);
    //        Have your slowTurtle draw a upside down triangle with 50 pixel sides
    slowtortose.drawTriangle(-50);
    slowtortose.setSound(new Sound(Sound.TKPSound.Crickets));
    slowtortose.speak();
    //  ------------- End of makeSlowTurtle --#3.1
    //  makeCrazyTurtle (recipe below) --#6.0
  }
  private void makeSpeedyTortose()
  {
    //  ------------- Recipe for makeSpeedyTurtle --#1.0
    //        Create a new speedyTurtle instance 
    Turtle speedytortose = new Turtle();
    //        Add your speedyTurtle to your MultiTurtleWindow
    mtw.addAndShowTurtle(speedytortose);
    //        Set the speed of your speedyTurtle to the fastest possible 
    speedytortose.setSpeed(10);
    //        Have your speedyTurtle draw a triangle with 100 pixel sides
    speedytortose.drawTriangle(100);
    speedytortose.setSound(new Sound(Sound.TKPSound.Yay));
    speedytortose.speak();
    //  ------------- End of makeSpeedyTurtle --#1.1 
  }
}
