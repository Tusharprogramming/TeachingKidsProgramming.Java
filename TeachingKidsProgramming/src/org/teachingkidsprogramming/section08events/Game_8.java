package org.teachingkidsprogramming.section08events;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.teachingextensions.logo.Tortoise;

public class Game_8 implements KeyListener
{
  public void keyTyped(KeyEvent e)
  {
  }
  @Override
  public void keyPressed(KeyEvent arg0)
  {
    Tortoise.show();
    Tortoise.turn(90);
  }
  @Override
  public void keyReleased(KeyEvent e)
  {
    // TODO Auto-generated method stub
  }
  public static void main(String[] args)
  {
    new Game_8();
  }
}