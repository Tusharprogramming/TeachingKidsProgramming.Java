package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;

public class Game_4 implements MouseLeftClickListener, MouseRightClickListener
{
  public Game_4()
  {
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
  Boolean turn = true;
  public void onLeftMouseClick(int x, int y)
  {
    xTopLeft(x, y);
    if (turn = false)
    {
      oTopLeft(x, y);
    }
    xCenterLeft(x, y);
    if (turn = false)
    {
    }
    xCenter(x, y);
    if (turn = false)
    {
    }
    xTopCenter(x, y);
    if (turn = false)
    {
    }
    xTopRight(x, y);
    if (turn = false)
    {
    }
    xCenterRight(x, y);
    if (turn = false)
    {
    }
    xBottomRight(x, y);
    if (turn = false)
    {
    }
    xBottomCenter(x, y);
    if (turn = false)
    {
    }
    xBottomLeft(x, y);
    if (turn = false)
    {
    }
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
        Tortoise.setX(190);
        Tortoise.setY(327);
        Tortoise.setAngle(45);
        Tortoise.setPenColor(PenColors.Blues.Blue);
        Tortoise.move(95);
        Tortoise.setX(254);
        Tortoise.setY(327);
        Tortoise.setAngle(315);
        Tortoise.move(95);
        turn = false;
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
        turn = false;
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
        turn = false;
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
        turn = false;
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
        turn = false;
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
        turn = false;
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
        turn = false;
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
        turn = false;
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
        turn = false;
      }
    }
  }
  public void onRightMouseClick(int x, int y)
  {
    MessageBox.showMessage("" + x + " " + y);
  }
  public static void main(String[] args)
  {
    new Game_4();
  }
}