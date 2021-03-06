package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class TextEncryptor2
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
    String[] shifts = {};
    shifts = new String[27];
    shiftDefinitions(shifts);
    for (int i = 0; i < 1; i++)
    {
      inputs[0] = MessageBox.askForTextInput("Character " + i);
      if (letters[i] == inputs[i])
      {
        results[i] = shifts[i];
      }
    }
    MessageBox.showMessage(results[0] + " " + inputs[1]);
    //String currentStory = Parser.parseRtfFile("view.rtf", word);
    //Viewer.displayRtfFile(currentStory);
  }
  private static void shiftDefinitions(String[] shifts)
  {
    shifts[0] = "M";
    shifts[1] = "Q";
    shifts[2] = "W";
    shifts[3] = "E";
    shifts[4] = "R";
    shifts[5] = "T";
    shifts[6] = "Y";
    shifts[7] = "U";
    shifts[8] = "I";
    shifts[9] = "O";
    shifts[10] = "P";
    shifts[11] = "A";
    shifts[12] = "S";
    shifts[13] = "D";
    shifts[14] = "F";
    shifts[15] = "G";
    shifts[16] = "H";
    shifts[17] = "J";
    shifts[18] = "K";
    shifts[19] = "L";
    shifts[20] = "Z";
    shifts[21] = "X";
    shifts[22] = "C";
    shifts[23] = "V";
    shifts[24] = "B";
    shifts[25] = "N";
  }
  private static void arrayDefinition(String[] letters)
  {
    letters[0] = "Z";
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
  }
}