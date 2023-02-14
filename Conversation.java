import java.util.Scanner;

class Conversation {
  public static void main(String[] arguments) {

    Scanner in;
    String transcript="\nHello! What's on your mind?";
    Short round;
    String response=""; 

    //asking for the number of rounds 
    in= new Scanner(System.in);
    System.out.print("How many rounds? ");
    round=in.nextShort();

    //start off conversation
    System.out.println("\nHello! What's on your mind?");


    //loop
    for (int i=0; i<= round; i++){
      //gets the response
      response= in.nextLine();
      //adds it to the transcript
      transcript= transcript+response+"\n";

      //if response

      if (i!=0){
        System.out.println("Mmm hmm.");
        transcript=transcript+"Mmm hmm. \n";
      }

      if (i==round){
        System.out.println("\nConversation finished.\nTranscript:");
        System.out.println(transcript);
      }

       }

    }

    // You will start the conversation here.


  }