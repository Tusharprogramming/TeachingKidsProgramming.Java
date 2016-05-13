package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;

public class Game_7 implements MouseLeftClickListener, MouseRightClickListener
{
  public Game_7()
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
  int lololol = 1;
  public void onLeftMouseClick(int x, int y)
  {
    xarray();
    xBottomLeft(x, y);
  }
  private void xarray()
  {
    int[] xvalues = {};
    xvalues = new int[9];
  }
  private void oTopLeft(int x, int y)
  {
    if (x >= 170 && x <= 265)
    {
      if (y >= 243 && y <= 334)
      {
        Tortoise.setY(87);
        Tortoise.setX(170);
        Tortoise.setPenColor(PenColors.Reds.Red);
        for (int i = 0; i < 360; i++)
        {
          Tortoise.move(1);
          Tortoise.turn(1);
        }
      }
    }
  }
  private void xBottomLeft(int x, int y)
  {
    if (x >= 170 && x <= 265)
    {
      if (y >= 243 && y <= 334)
      {
        //if (xvalues[0] = null) {
        Tortoise.setX(190);
        Tortoise.setY(327);
        Tortoise.setAngle(45);
        Tortoise.setPenColor(PenColors.Blues.Blue);
        Tortoise.move(95);
        Tortoise.setX(254);
        Tortoise.setY(327);
        Tortoise.setAngle(315);
        Tortoise.move(95);
        //}
      }
    }
  }
  private void xBottomCenter(int x, int y)
  {
    if (x >= 270 && x <= 365)
    {
      if (y >= 243 && y <= 334)
      {
        Tortoise.setX(290);
        Tortoise.setY(327);
        Tortoise.setAngle(45);
        Tortoise.setPenColor(PenColors.Blues.Blue);
        Tortoise.move(95);
        Tortoise.setX(354);
        Tortoise.setY(327);
        Tortoise.setAngle(315);
        Tortoise.move(95);
      }
    }
  }
  private void xBottomRight(int x, int y)
  {
    if (x >= 370 && x <= 465)
    {
      if (y >= 243 && y <= 334)
      {
        Tortoise.setX(390);
        Tortoise.setY(327);
        Tortoise.setAngle(45);
        Tortoise.setPenColor(PenColors.Blues.Blue);
        Tortoise.move(95);
        Tortoise.setX(454);
        Tortoise.setY(327);
        Tortoise.setAngle(315);
        Tortoise.move(95);
      }
    }
  }
  private void xCenterRight(int x, int y)
  {
    if (x >= 370 && x <= 465)
    {
      if (y >= 143 && y <= 234)
      {
        Tortoise.setX(390);
        Tortoise.setY(227);
        Tortoise.setAngle(45);
        Tortoise.setPenColor(PenColors.Blues.Blue);
        Tortoise.move(95);
        Tortoise.setX(454);
        Tortoise.setY(227);
        Tortoise.setAngle(315);
        Tortoise.move(95);
      }
    }
  }
  private void xTopRight(int x, int y)
  {
    if (x >= 370 && x <= 465)
    {
      if (y >= 43 && y <= 134)
      {
        Tortoise.setX(390);
        Tortoise.setY(127);
        Tortoise.setAngle(45);
        Tortoise.setPenColor(PenColors.Blues.Blue);
        Tortoise.move(95);
        Tortoise.setX(454);
        Tortoise.setY(127);
        Tortoise.setAngle(315);
        Tortoise.move(95);
      }
    }
  }
  private void xTopCenter(int x, int y)
  {
    if (x >= 270 && x <= 365)
    {
      if (y >= 43 && y <= 134)
      {
        Tortoise.setX(290);
        Tortoise.setY(127);
        Tortoise.setAngle(45);
        Tortoise.setPenColor(PenColors.Blues.Blue);
        Tortoise.move(95);
        Tortoise.setX(354);
        Tortoise.setY(127);
        Tortoise.setAngle(315);
        Tortoise.move(95);
      }
    }
  }
  private void xCenter(int x, int y)
  {
    if (x >= 270 && x <= 365)
    {
      if (y >= 145 && y <= 235)
      {
        Tortoise.setX(290);
        Tortoise.setY(227);
        Tortoise.setAngle(45);
        Tortoise.setPenColor(PenColors.Blues.Blue);
        Tortoise.move(95);
        Tortoise.setX(354);
        Tortoise.setY(227);
        Tortoise.setAngle(315);
        Tortoise.move(95);
      }
    }
  }
  private void xCenterLeft(int x, int y)
  {
    if (x >= 170 && x <= 265)
    {
      if (y >= 145 && y <= 235)
      {
        Tortoise.setX(190);
        Tortoise.setY(227);
        Tortoise.setAngle(45);
        Tortoise.setPenColor(PenColors.Blues.Blue);
        Tortoise.move(95);
        Tortoise.setX(254);
        Tortoise.setY(227);
        Tortoise.setAngle(315);
        Tortoise.move(95);
      }
    }
  }
  private void xTopLeft(int x, int y)
  {
    if (x >= 170 && x <= 265)
    {
      if (y >= 43 && y <= 134)
      {
        Tortoise.setX(190);
        Tortoise.setY(127);
        Tortoise.setAngle(45);
        Tortoise.setPenColor(PenColors.Blues.Blue);
        Tortoise.move(95);
        Tortoise.setX(254);
        Tortoise.setY(127);
        Tortoise.setAngle(315);
        Tortoise.move(95);
      }
    }
  }
  public void onRightMouseClick(int x, int y)
  {
    MessageBox.showMessage("" + x + " " + y);
  }
  public static void main(String[] args)
  {
    new Game_7();
  }
}