package org.teachingkidsprogramming.section08events;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;

public class Game_2keys implements MouseLeftClickListener, MouseRightClickListener, KeyListener
{
  public Game_2keys()
  {
    addKeyListener();
    prepPhase();
    buttonDraw();
    MessageBox.showMessage("Click OK to start.");
    moveInit();
  }
  private void moveInit()
  {
    Tortoise.setPenWidth(10);
    Tortoise.setX(1170);
    Tortoise.setY(600);
    for (int i = 0; i < 20; i++)
    {
      Tortoise.setSpeed(1);
      Tortoise.move(1);
    }
    Tortoise.setSpeed(5);
    Tortoise.show();
    Tortoise.hide();
    int[] linexs = {};
    linexs = new int[10000000];
    int[] lineys = {};
    lineys = new int[10000000];
    int tortx = Tortoise.getX();
    int torty = Tortoise.getY();
    for (int i = 0; i < 10000; i++)
    {
      linexs[i] = Tortoise.getX();
      lineys[i] = Tortoise.getY();
      Tortoise.move(5);
      if (i == 1000)
      {
        Tortoise.setSpeed(60);
      }
      if (i == 2000)
      {
        Tortoise.setSpeed(7);
      }
      if (i == 3000)
      {
        Tortoise.setSpeed(8);
      }
      if (i == 4000)
      {
        Tortoise.setSpeed(9);
      }
      for (int j = 1; j < 10000; j++)
      {
        tortx = Tortoise.getX();
        torty = Tortoise.getY();
        if (tortx == linexs[j] && torty == lineys[j])
        {
          MessageBox.showMessage("Game Over! Your score was " + i);
          System.exit(0);
        }
        if (Tortoise.getX() <= 0 || Tortoise.getX() >= 1920)
        {
          MessageBox.showMessage("Game Over! Your score was " + i);
          System.exit(0);
        }
        if (Tortoise.getY() <= 0 || Tortoise.getY() >= 1015)
        {
          MessageBox.showMessage("Game Over! Your score was " + i);
          System.exit(0);
        }
      }
    }
    MessageBox.showMessage("You Win! (Yes, you actually won a game that can't be won.)");
    System.exit(0);
  }
  private void buttonDraw()
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.setPenUp();
    Tortoise.turn(-90);
    Tortoise.move(25);
    Tortoise.setPenDown();
    Tortoise.turn(90);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(50);
      Tortoise.turn(90);
    }
    Tortoise.setPenUp();
    Tortoise.move(-150);
    Tortoise.setPenDown();
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(50);
      Tortoise.turn(90);
    }
    Tortoise.setPenUp();
    Tortoise.setX(275);
    Tortoise.show();
    Tortoise.move(75);
    Tortoise.setPenDown();
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(50);
      Tortoise.turn(-90);
    }
    Tortoise.setX(295);
    Tortoise.show();
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(50);
      Tortoise.turn(90);
    }
    Tortoise.setX(365);
    Tortoise.show();
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(50);
      Tortoise.turn(90);
    }
    Tortoise.show();
    Tortoise.hide();
  }
  private void prepPhase()
  {
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    Tortoise.show();
    Tortoise.setPenColor(PenColors.Grays.Black);
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);
    Tortoise.getBackgroundWindow().addMouseRightClickListener(this);
  }
  public void keyPressed(KeyEvent e)
  {
    if (e.getKeyCode() == KeyEvent.VK_RIGHT)
    {
    }
    else if (e.getKeyCode() == KeyEvent.VK_LEFT)
    {
      Tortoise.show();
      Tortoise.setAngle(-90);
      Tortoise.show();
      Tortoise.hide();
    }
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
  }
  public void onRightMouseClick(int x, int y)
  {
    MessageBox.showMessage("" + x + " " + y);
  }
  public void keyTyped(KeyEvent e)
  {
    if (e.getKeyCode() == KeyEvent.VK_RIGHT)
    {
      System.out.println("Right key typed");
    }
    if (e.getKeyCode() == KeyEvent.VK_LEFT)
    {
    }
  }
  public static void main(String[] args)
  {
    new Game_2keys();
  }
  @Override
  public void keyReleased(KeyEvent e)
  {
    if (e.getKeyCode() == KeyEvent.VK_LEFT)
    {
    }
  }
}