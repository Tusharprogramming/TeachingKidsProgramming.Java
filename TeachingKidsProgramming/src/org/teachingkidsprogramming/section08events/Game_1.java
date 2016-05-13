package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;

public class Game_1 implements MouseLeftClickListener, MouseRightClickListener
{
  public Game_1()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.drawShape(4, Blues.Blue, 100, 5);
    Tortoise.setX(100);
    Tortoise.setY(200);
    Tortoise.show();
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    //MessageBox.showMessage("" + x + " " + y);
    if (x >= 320 && x <= 420)
    {
      if (y >= 140 && y <= 240)
      {
        int xvalue = Tortoise.getX();
        Tortoise.setX(xvalue + 25);
        Tortoise.show();
        xvalue = Tortoise.getX();
        if (xvalue == 400)
        {
          Tortoise.explode();
        }
      }
    }
  }
  public void onRightMouseClick(int x, int y)
  {
  }
  public static void main(String[] args)
  {
    new Game_1();
  }
}