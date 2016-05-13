package org.teachingkidsprogramming.section08events;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main extends JFrame implements Runnable
{
  int              x, y, xDirection = 10, yDirection = 10;
  private Image    dbImage;
  private Graphics dbg;
  Image            face;
  public void run()
  {
    try
    {
      while (true)
      {
        move();
        Thread.sleep(5);
      }
    }
    catch (Exception e)
    {
      System.out.println("Error");
    }
  }
  Font font = new Font("Arial", Font.BOLD | Font.ITALIC, 15);
  public void move()
  {
    x += xDirection;
    y += yDirection;
    if (x <= 0)
      x = 0;
    if (x >= 200)
      x = 200;
    if (y <= 50)
      y = 50;
    if (y >= 250)
      y = 250;
  }
  public void setXDirection(int xdir)
  {
    xDirection = xdir;
  }
  public void setYDirection(int ydir)
  {
    yDirection = ydir;
  }
  public class AL extends KeyAdapter
  {
    public void keyPressed(KeyEvent e)
    {
      int keyCode = e.getKeyCode();
      if (keyCode == e.VK_LEFT)
      {
        setXDirection(-1);
        System.out.println("Key Pressed");
      }
      if (keyCode == e.VK_RIGHT)
      {
        setXDirection(+1);
      }
      if (keyCode == e.VK_UP)
      {
        setYDirection(-1);
      }
      if (keyCode == e.VK_DOWN)
      {
        setYDirection(+1);
      }
    }
    public void keyReleased(KeyEvent e)
    {
      int keyCode = e.getKeyCode();
      if (keyCode == e.VK_LEFT)
      {
        setXDirection(0);
        System.out.println("Key Pressed");
      }
      if (keyCode == e.VK_RIGHT)
      {
        setXDirection(0);
      }
      if (keyCode == e.VK_UP)
      {
        setYDirection(0);
      }
      if (keyCode == e.VK_DOWN)
      {
        setYDirection(0);
      }
    }
  }
  public Main()
  {
    //Load Images
    ImageIcon i = new ImageIcon("F:/Android/Workspace/TheJavaHubGame/src/theJavaHubGame/Face.gif");
    face = i.getImage();
    //Game Properties
    addKeyListener(new AL());
    setTitle("Java Game");
    setSize(1000, 2000);
    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setBackground(Color.GREEN);
    x = 150;
    y = 150;
  }
  public void paint(Graphics g)
  {
    dbImage = createImage(getWidth(), getHeight());
    dbg = dbImage.getGraphics();
    paintComponent(dbg);
    g.drawImage(dbImage, 0, 0, this);
  }
  public void paintComponent(Graphics g)
  {
    g.setFont(font);
    g.setColor(Color.MAGENTA);
    g.drawString("Super-Mega Ball Bouncer II", 50, 50);
    g.setColor(Color.red);
    g.fillOval(x, y, 15, 15);
    g.drawImage(face, x, y, this);
    repaint();
  }
  public static void main(String[] args)
  {
    Main jg = new Main();
    //Threads
    Thread t1 = new Thread(jg);
    t1.start();
  }
}