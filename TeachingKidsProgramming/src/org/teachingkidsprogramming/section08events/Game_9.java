package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;

public class Game_9 implements MouseLeftClickListener, MouseRightClickListener
{
  public Game_9()
  {
    //X method instead of multiple
    //boolean to determine turns
    boardNListenrz();
  }
  private void boardNListenrz()
  {
    Tortoise.show();
    Tortoise.hide();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(10);
    Tortoise.setY(Tortoise.getY() - 100);
    Tortoise.setAngle(90);
    Tortoise.move(150);
    Tortoise.setAngle(270);
    Tortoise.move(300);
    Tortoise.turn(180);
    Tortoise.move(100);
    Tortoise.setAngle(180);
    Tortoise.move(200);
    Tortoise.setAngle(360);
    Tortoise.move(100);
    Tortoise.setAngle(270);
    Tortoise.move(100);
    Tortoise.setAngle(90);
    Tortoise.move(300);
    Tortoise.setAngle(270);
    Tortoise.move(100);
    Tortoise.setAngle(180);
    Tortoise.move(100);
    Tortoise.setAngle(360);
    Tortoise.move(300);
    Tortoise.setAngle(180);
    Tortoise.move(100);
    Tortoise.setAngle(270);
    Tortoise.move(100);
    Tortoise.setAngle(360);
    Tortoise.move(100);
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);
    Tortoise.getBackgroundWindow().addMouseRightClickListener(this);
  }
  public void onLeftMouseClick(int x, int y)
  {
  }
  public void onRightMouseClick(int x, int y)
  {
    MessageBox.showMessage("" + x + " " + y);
  }
  public static void main(String[] args)
  {
    new Game_9();
  }
}