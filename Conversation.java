import java.util.Scanner;

class Conversation {
  public static void main(String[] arguments) {

    Scanner in;
    String transcript="\nHello! What's on your mind?";
    Short round;

    //asking for the number of rounds 
    in= new Scanner(System.in);
    System.out.print("How many rounds? ");
    round=in.nextShort();

    //start off conversation
    System.out.println("\nHello! What's on your mind?");


    //loop
    for (int i=0; i<round; i++){
      //gets the response
      in= new Scanner(System.in);
      String user_response= in.nextLine();

      //adds it to the transcript
      transcript= transcript+user_response+"\n";
      
      //turns the user response into an array of words in the response
      String[] words= user_response.split("");

      //creates a new array for the computer response
      
      for (int j=0; j<words.length;i++){
          if (words[j].equals("I")){
            words[j]="you";
          }
          if (words[j].equals("I'm")){
            words[j]="You're";
          }
      }


      if (i!=0){
        System.out.println("Mmm hmm.");
        transcript=transcript+"Mmm hmm. \n";
      }
      }
  
      System.out.println("\nConversation finished.\nTranscript:");
      System.out.println(transcript);
      }
    }
  


  

    // You will start the conversation here.


  