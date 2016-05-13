package org.teachingkidsprogramming.section08events;

import java.util.ArrayList;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;

public class Game_3 implements MouseLeftClickListener, MouseRightClickListener
{
  public Game_3()
  {
    MultiTurtleWindow mtw = new MultiTurtleWindow();
    ArrayList<Turtle> turtles = new ArrayList<Turtle>();
    Turtle art = new Turtle();
    turtles.add(art);
    mtw.addAndShowTurtle(art);
    new Text("There are 9 turtles in the turtle container").setTopLeft(50, 50).setPenColor(PenColors.Yellows.Gold)
        .addTo(mtw);
    art.setSpeed(10);
    art.setX(785);
    art.penUp();
    art.show();
    art.penDown();
    columns(art);
    //art.setX(785);
    // art.turn(90);
    //rows(art);
  }
  @SuppressWarnings("unused")
  private void rows(Turtle art)
  {
    for (int i = 0; i < 8; i++)
    {
      art.move(400);
      int yval = art.getY();
      art.setY(yval + 50);
      art.move(-400);
    }
  }
  private void columns(Turtle art)
  {
    for (int i = 0; i < 6; i++)
    {
      art.move(-350);
      MessageBox.showMessage("1 " + i);
      int xval = art.getX();
      MessageBox.showMessage("2 " + i);
      art.setX(xval + 50);
      MessageBox.showMessage("3 " + i);
      art.move(350);
      MessageBox.showMessage("4 " + i);
    }
  }
  {//for (int i = 0; i < 7; i++)
   // {
   //   rowDraw(art);
   // }
   // private void rowDraw(Turtle art)
   // {
   //  for (int i = 0; i < 6; i++)
   //  {
   //   fourCells(art);
   //  }
   //  art.turn(180);
   //  art.move(50);
   //  art.turn(90);
   //  art.move(300);
   //  art.turn(90);
   // }
   //private void fourCells(Turtle art)
   //{
   // for (int i = 0; i < 4; i++)
   // {
   //   cellDraw(art);
   // }
   //  art.turn(90);
   // art.move(50);
   // art.turn(-90);
   //  }
   //private void cellDraw(Turtle art)
   // {
   //  for (int i = 0; i < 4; i++)
   // {
   //   art.move(50);
   //   art.turn(-90);
   //  }
   //  art.turn(90);
   // }
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
  }
  public void onRightMouseClick(int x, int y)
  {
  }
  public static void main(String[] args)
  {
    new Game_3();
  }
}