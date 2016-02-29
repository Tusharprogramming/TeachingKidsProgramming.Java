package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.MVCUtils.Parser;
import org.teachingextensions.logo.utils.MVCUtils.Viewer;

public class AdLibsRtf
{
  public static class Words
  {
    public String adverb;
    public String edVerb;
    public String bodyPart;
    public String preposition;
  }
  public static void main(String[] args)
  {
    //  Create a new 'word' container to hold the words for your story --#1.1
    Words word = new Words();
    //  Ask the user to enter an adverb, save it as currentAdverb --#2
    word.adverb = MessageBox.askForTextInput("What is the adverb?");
    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#3
    word.edVerb = MessageBox.askForTextInput("What is the -ed verb?");
    //  Ask the user to enter a body part, save it as currentBodyPart --#4
    word.bodyPart = MessageBox.askForTextInput("What is the body part?");
    //Continue adding random things of your choice --#5-9000000000000000000000000000000
    word.preposition = MessageBox.askForTextInput("What is the preposition?");
    //  Connect the words in the currentStory to an RTF file parser (use the Parser object)  --#1.2
    String currentStory = Parser.parseRtfFile("view.rtf", word);
    //  Display the currentStory in an RTF file (use the Viewer object) --#1.3
    Viewer.displayRtfFile(currentStory);
  }
}