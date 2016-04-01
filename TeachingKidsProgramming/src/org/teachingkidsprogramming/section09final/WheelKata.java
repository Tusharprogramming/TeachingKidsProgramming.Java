package org.teachingkidsprogramming.section09final;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class WheelKata
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    ColorWheel.addColor(PenColors.Grays.Black);
    ColorWheel.addColor(PenColors.Grays.SlateGray);
    Tortoise.drawShape(360, ColorWheel.getNextColor(), 3, 4);
    Tortoise.hide();
    Tortoise.setX(150);
    Tortoise.show();
    Tortoise.drawShape(360, ColorWheel.getNextColor(), 1, 4);
    //    Write the steps to code your wheel out in English 
    // Show the Tortoise-#1
    // Use the draw shape to make the tortoise draw a circle-#2
    //    Translate from English to Java one line at a time
    //    Run your code after each line of Java to make sure it works as expected
  }
}
