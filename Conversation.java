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
    System.out.print("\nHello! What's on your mind?");


    //loop
    for (int i=0; i<= round; i++){
      //gets the user_response
      String user_response= in.nextLine();

      //adds it to the transcript
      transcript= transcript+user_response+"\n";

      String computer_response="Mmm hmmm.";

      if (user_response.contains("I ")){
        computer_response=user_response.replace("I ","you ")+"?";
      }
      if (user_response.contains("I'm ")){
        computer_response=user_response.replace("I'm ","you're ")+"?";
      }
      if (user_response.contains("you ")){
        computer_response=user_response.replace("you","I")+"?";
      }

      System.out.println(computer_response);

     //if (i!=0){
      // System.out.println("Mmm hmm.");
      // transcript=transcript+"Mmm hmm. \n";
     // }

     if (i==round){
       System.out.println("\nConversation finished.\nTranscript:");
       System.out.println(transcript);
     }

      }
    }
  }


  

    // You will start the conversation here.


  