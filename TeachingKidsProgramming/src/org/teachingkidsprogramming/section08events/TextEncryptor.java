package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class TextEncryptor
{
  public static void main(String[] args)
  {
    String[] letters = {};
    letters = new String[27];
    arrayDefinition(letters);
    String[] inputs = {};
    inputs = new String[40];
    String[] results = {};
    results = new String[40];
    for (int i = 0; i < 1; i++)
    {
      inputs[i] = MessageBox.askForTextInput("Character " + i);
      if (inputs[i] == "A")
      {
        results[i] = "Q";
      }
      else if (inputs[i] == "B")
      {
        results[i] = "W";
      }
      else if (inputs[i] == "C")
      {
        results[i] = "E";
      }
      else if (inputs[i] == "D")
      {
        results[i] = "R";
      }
      else if (inputs[i] == "E")
      {
        results[i] = "T";
      }
    }
    MessageBox.showMessage(results[0] + "");
    //String currentStory = Parser.parseRtfFile("view.rtf", word);
    //Viewer.displayRtfFile(currentStory);
  }
  private static void arrayDefinition(String[] letters)
  {
    letters[1] = "A";
    letters[2] = "B";
    letters[3] = "C";
    letters[4] = "D";
    letters[5] = "E";
    letters[6] = "F";
    letters[7] = "G";
    letters[8] = "H";
    letters[9] = "I";
    letters[10] = "J";
    letters[11] = "K";
    letters[12] = "L";
    letters[13] = "M";
    letters[14] = "N";
    letters[15] = "O";
    letters[16] = "P";
    letters[17] = "Q";
    letters[18] = "R";
    letters[19] = "S";
    letters[20] = "T";
    letters[21] = "U";
    letters[22] = "V";
    letters[23] = "W";
    letters[24] = "X";
    letters[25] = "Y";
    letters[26] = "Z";
  }
}