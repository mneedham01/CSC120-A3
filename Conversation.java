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
    String computer_response;
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
      computer_response="";

      //set up counter for changing mirror words
      int counter=0;


      //loops through the user response array and checks if it's a word to be mirrored. 
      for (int j=0; j<words.length;j++){
          if (words[j].equals("I")){
            counter += 1;
            //Checks if it's the first lett er to see if it should capitalize
            if (j==0){
              computer_response+="You ";
            }
            else{
              computer_response+="you ";
            }
            continue;
          }
          if (words[j].equals("me")){
            counter+=1;
            computer_response+="you ";
            continue;
          }
          if (words[j].equals("I'm")){
            counter += 1;
            if (j==0){
              computer_response+="You're ";
            }
            else{
              computer_response+="you're ";
            }
            continue;
          }
          if (words[j].equals("am")){
            counter+=1;
            computer_response+="are ";
            continue;
          }
          if (words[j].equals("my")){
            counter+=1;
            computer_response+="your ";
            continue;
          }
          if (words[j].equals("you")){
            counter += 1;
            computer_response+="I ";
            continue;
          }
          if (words[j].equals("you're")){
            counter += 1;
            computer_response+="I'm ";
            continue;
          }
          if (words[j].equals("your")){
            counter+=1;
            computer_response+="my ";
            continue;
          }
          else{
            computer_response+=words[j]+" ";
          }
          }
          
      //If the computer doesn't have to mirror any words, change it to a random response
      if (counter==0 & user_response.length()>0){
        String[] rand_responses={"Mmm hmm.","Oh yeah?","I didn't know that.","For sure.", "That might be right.","I believe you.","That's okay.","Oh really?","Oh.","Uh huh?"};
        int num=rand.nextInt(10);
        computer_response=rand_responses[num];
        //print out response
        System.out.println(computer_response);
        //add to trancript
        transcript.add(computer_response+"\n");
      }
      //If the computer does have to change words, change any punctuation to a question mark.
      if (counter>0 & user_response.length()>0){
        int puncPlace=computer_response.charAt(computer_response.length()-2);
        if (puncPlace=='.'||puncPlace=='!'||puncPlace=='?'||puncPlace==','||puncPlace==','){;
          computer_response=computer_response.substring(0,computer_response.length()-1);
          computer_response+="?";
        }
        else{
          computer_response+="?";
        }
        //print out the string
        System.out.println(computer_response);
        //add string to transcript
       transcript.add(computer_response+"\n");
      }
  
      
    }
    //Close conversation and print transcript.
    System.out.println("\nConversation finished.\nTranscript:");
    System.out.println(transcript);
      }
  
      }
    
  


  

    // You will start the conversation here.


  