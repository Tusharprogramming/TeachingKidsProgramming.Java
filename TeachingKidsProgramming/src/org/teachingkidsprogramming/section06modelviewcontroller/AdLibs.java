package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("Enter an Adverb");
    String currentEdVerb = MessageBox.askForTextInput("Enter a Verb in Past Perfect Tense");
    String currentBodyPart = MessageBox.askForTextInput("Enter a Body Part");
    String currentinterjection = MessageBox.askForTextInput("Enter an Interjection");
    String anotherperfveb = MessageBox.askForTextInput("Enter Verb in Past Perfect Tense");
    String noun = MessageBox.askForTextInput("Enter a Noun");
    String presverb = MessageBox.askForTextInput("Enter Verb in Past Perfect Tense");
    String adverb = MessageBox.askForTextInput("Enter an Adverb (Capitalize this)");
    String currentinterjection2 = MessageBox.askForTextInput("Enter an Interjection");
    String currentingVerb = MessageBox.askForTextInput("Enter a Verb in Past Imperfect Tense");
    String currentNoun = MessageBox.askForTextInput("Enter a Noun");
    String currentEdVerb2 = MessageBox.askForTextInput("Enter a Verb in Past Perfect Tense");
    String currentStory = "Today ";
    currentStory = currentStory + "I woke " + currentAdverb + ". ";
    currentStory = currentStory + "Then I " + currentEdVerb + " ";
    currentStory = currentStory + "my " + currentBodyPart + ".";
    currentStory = currentStory + " " + "'" + currentinterjection + "!" + "'";
    //
    currentStory = currentStory + " I " + anotherperfveb + ".";
    currentStory = currentStory + " " + adverb + ", the " + noun + " " + presverb;
    currentStory = currentStory + " '" + currentinterjection2 + "!' I " + currentingVerb + " a " + currentNoun
        + " and I " + currentEdVerb2 + " the " + currentNoun + ".";
    currentStory = currentStory + " The " + currentNoun + " " + currentEdVerb + " and the " + noun + " "
        + currentEdVerb2 + ".";
    MessageBox.showMessage(currentStory);
  }
}