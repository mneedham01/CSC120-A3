import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 * Starts a conversation with user. Will mirror back certain words or ask a question. 
 */

class Conversation {
  /**
     * The main intiates and executes the program.
     */
  public static void main(String[] arguments) {
    Scanner in;
    ArrayList<String> transcript = new ArrayList<String>();
    Short round;
    String compResponse;
    Random rand = new Random();

    //asking for the number of rounds 
    in= new Scanner(System.in);
    System.out.print("How many rounds? ");
    round=in.nextShort();

    //start off conversation
    System.out.println("\nHello! What's on your mind?");
    transcript.add("Hello! What's on your mind?");


    //loop
    for (int i=0; i<round; i++){
      //gets the response
      String user_response= in.nextLine();

      //adds it to the transcript
      transcript.add(user_response+"\n");
      
      //turns the user response into an array of words in the response
      String[] words= user_response.split(" ");

      //reset the computer response
      compResponse="";

      //set up counter for changing mirror words
      int counter=0;


      //loops through the user response array and checks if it's a word to be mirrored. 
      for (int j=0; j<words.length;j++){
          if (words[j].equals("I")){
            counter += 1;
            //Checks if it's the first lett er to see if it should capitalize
            if (j==0){
              compResponse+="You ";
            }
            else{
              compResponse+="you ";
            }
            continue;
          }
          if (words[j].equals("I'm")){
            counter += 1;
            if (j==0){
              compResponse+="You're ";
            }
            else{
              compResponse+="you're ";
            }
            continue;
          }
          if (words[j].equals("me")){
            counter+=1;
            compResponse+="you";
            continue;
          }
          if (words[j].equals("am")){
            counter+=1;
            compResponse+="are ";
            continue;
          }
          if (words[j].equals("my")){
            counter+=1;
            compResponse+="your ";
            continue;
          }
          if (words[j].equals("you")){
            counter += 1;
            compResponse+="I ";
            continue;
          }
          if (words[j].equals("you're")){
            counter += 1;
            compResponse+="I'm ";
            continue;
          }
          if (words[j].equals("your")){
            counter+=1;
            compResponse+="my ";
            continue;
          }
          else{
            compResponse+=words[j]+" ";
          }
          }
          
      //If the computer doesn't have to mirror any words, change it to a random response
      if (counter==0 & user_response.length()>0){
        String[] rand_responses={"Mmm hmm.","Oh yeah?","I didn't know that.","For sure.", "That might be right.","I believe you.","That's okay.","Oh really?","Oh.","Uh huh?"};
        int num=rand.nextInt(10);
        compResponse=rand_responses[num];
        //print out response
        System.out.println(compResponse);
        //add to trancript
        transcript.add(compResponse+"\n");
      }
      //If the computer does have to change words, change any punctuation to a question mark.
      if (counter>0 & user_response.length()>0){
        int puncPlace=compResponse.charAt(compResponse.length()-2);
        if (puncPlace=='.'||puncPlace=='!'||puncPlace=='?'||puncPlace==','||puncPlace==','){;
          compResponse=compResponse.substring(0,compResponse.length()-2);
          compResponse+="?";
        }
        else{
          compResponse+="?";
        }
        //print out the string
        System.out.println(compResponse);
        //add string to transcript
       transcript.add(compResponse+"\n");
      }
  
      
    }
    //Close conversation and print transcript.
    System.out.println("\nConversation finished.\nTranscript:");
    System.out.println(transcript);
      }
  
      }
    
  


  

    // You will start the conversation here.


  