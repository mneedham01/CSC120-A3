import java.util.Scanner;

class Conversation {
  public static void main(String[] arguments) {

    Scanner in;
    String transcript="\nHello! What's on your mind?";
    Short round;
    String user_response=""; 
    String computer_response;

    //asking for the number of rounds 
    in= new Scanner(System.in);
    System.out.print("How many rounds? ");
    round=in.nextShort();

    //start off conversation
    System.out.print("\nHello! What's on your mind?");


    //loop
    for (int i=0; i<= round; i++){
      //gets the user_response
      user_response= in.nextLine();
      //adds it to the transcript
      transcript= transcript+user_response+"\n";

      //split response into words
      String words[]= user_response.split(" ");
      //check whether it has the words we want and add replacements to computer_response
      computer_response="";
      for (String token :words){
        System.out.println(token);
        //check if it says "I"
        if (token.equals("I")){
          //if it's at the start of the sentence, then capitalize. If not, lowercase
          if (token.equals(words[0])){
              token="You";
          }
          else{
            token="you";
          }
        }
        if (token.equals("I'm")){
          if (token.equals(words[0])){
            token="You're";
          }
          else{
            token="you're";
          }
        if (token.equals("You")){
          token="I";
        }
        if (token.equals("You're")){
          token="I'm";
        }
        }
        System.out.println(token);
        }
      }

      //if (i!=0){
       // System.out.println("Mmm hmm.");
       // transcript=transcript+"Mmm hmm. \n";
     // }

     // if (i==round){
       // System.out.println("\nConversation finished.\nTranscript:");
      //  System.out.println(transcript);
   //   }

       }

    }

    // You will start the conversation here.


  