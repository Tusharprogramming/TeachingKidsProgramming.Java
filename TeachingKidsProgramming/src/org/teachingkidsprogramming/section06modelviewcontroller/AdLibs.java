package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    //  Ask the user to enter an adverb, save it as currentAdverb --#2
    String currentAdverb = MessageBox.askForTextInput("Enter an Adverb");
    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#4
    String currentEdVerb = MessageBox.askForTextInput("Enter a Verb in Perfect Tense");
    //  Ask the user to enter a body part, save it as currentBodyPart --#6
    String currentBodyPart = MessageBox.askForTextInput("Enter a Body Part");
    // Insert more stuff
    String currentinterjection = MessageBox.askForTextInput("Enter an Interjection");
    //
    String anotherperfveb = MessageBox.askForTextInput("Enter Verb in Perfect Tense");
    //
    String noun = MessageBox.askForTextInput("Enter a Noun");
    String presverb = MessageBox.askForTextInput("Enter Verb in Perfect Tense");
    String adverb = MessageBox.askForTextInput("Enter an Adverb (Capitalize this)");
    //  Set the value of the currentStory to the word "Today " --#1.2
    String currentStory = "Today ";
    //  Add the words "I woke " + currentAdverb + ". " to the currentStory --#3
    currentStory = currentStory + "I woke " + currentAdverb + ". ";
    //  Add the words '"Then I " + currentEdVerb + " " to the currentStory --#5
    currentStory = currentStory + "Then I " + currentEdVerb + " ";
    //  Add the words "my " + currentBodyPart + ". " to the current story --#7
    currentStory = currentStory + "my " + currentBodyPart + ".";
    //moar shtuph
    currentStory = currentStory + " " + "'" + currentinterjection + "!" + "'";
    //
    currentStory = currentStory + " I " + anotherperfveb + ".";
    currentStory = currentStory + " " + adverb + ", the " + noun + " " + presverb;
    //  Show the currentStory in a messa as a message --#1.1
    MessageBox.showMessage(currentStory);
  }
}