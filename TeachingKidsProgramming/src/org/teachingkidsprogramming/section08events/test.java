package org.teachingkidsprogramming.section08events;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class test implements MouseLeftClickListener, MouseRightClickListener
{
  private ProgramWindow programWindow;
  public test()
  {
    prepareColorPalette();
    programWindow = new ProgramWindow("My Bubble");
    programWindow.setBackground(PenColors.Grays.Black);
    programWindow.setWindowVisible(true);
    programWindow.addMouseLeftClickListener(this);
    programWindow.addMouseRightClickListener(this);
  }
  private void crateBubble(int x, int y)
  {
    int radius = NumberUtils.getRandomInt(10, 30);
    Circle circle = new Circle(radius, PenColors.Grays.Black);
    circle.setCenter(x, y);
    circle.addTo(programWindow);
  }
  private void prepareColorPalette()
  {
    ColorWheel.addColor(PenColors.Blues.LightSteelBlue);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Blues.DarkBlue);
    ColorWheel.addColor(PenColors.Purples.Purple);
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    createBubble(x, y);
  }
  public void onRightMouseClick(int x, int y)
  {
    for (int i = 0; i < 100; i++)
    {
      // int rightClick = 1;
      // for (int i = 0; i < 100; i++)
      // {
      //Turtle testsubject = new Turtle();
      //if (rightClick == 1)
      // {
      //   createBubble(x, y);
      //}
      // else
      // {
      //    rightClick = 0;
      // }
      // }
      crateBubble(x, y);
    }
  }
  private void createBubble(int x, int y)
  {
    int radius = NumberUtils.getRandomInt(10, 50);
    Circle circle = new Circle(radius, ColorWheel.getRandomColorFromWheel());
    circle.setCenter(x, y);
    circle.addTo(programWindow);
  }
  public static void main(String[] args)
  {
    new test();
  }
}