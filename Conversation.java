import java.util.Scanner;
import java.util.ArrayList;

class Conversation {
  public static void main(String[] arguments) {

    Scanner in;
    String transcript="\nHello! What's on your mind?";
    Short round;
    String computer_response;

    //asking for the number of rounds 
    in= new Scanner(System.in);
    System.out.print("How many rounds? ");
    round=in.nextShort();

    //start off conversation
    System.out.print("\nHello! What's on your mind?");


    //loop
    for (int i=0; i<round; i++){
      //gets the response
      String user_response= in.nextLine();

      //adds it to the transcript
      transcript= transcript+user_response+"\n";
      
      //turns the user response into an array of words in the response
      String[] words= user_response.split(" ");

      //initializes string of computer response
      computer_response="";

      //loops through the user response array and checks if it's a word to be mirrored. 
      for (int j=0; j<words.length;j++){
          if (words[j].equals("I")){
            //Checks if it's the first letter to see if it should capitalize
            if (j==0){
              computer_response+="You ";
            }
            else{
              computer_response+="you ";
            }
            continue;
          }
          if (words[j].equals("I'm")){
            if (j==0){
              computer_response+="You're ";
            }
            else{
              computer_response+="you're ";
            }
            continue;
          }
          if (words[j].equals("you")){
            computer_response+="I ";
            continue;
          }
          if (words[j].equals("you're")){
            computer_response+="I'm ";
            continue;
          }
          else{
            computer_response+=words[j]+" ";
          }
          }

      //add string to transcript
      transcript+= computer_response+"\n";
      //print out the string
      System.out.println(computer_response);
      
      
      }
  
      System.out.println("\nConversation finished.\nTranscript:");
      System.out.println(transcript);
      }
    }
  


  

    // You will start the conversation here.


  