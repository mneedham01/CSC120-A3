import java.util.Scanner;

class Conversation {
  public static void main(String[] arguments) {

    Scanner in;
    String transcript="\nHello! What's on your mind?";
    Short round;
    String original_user_response=""; 

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
      System.out.print("this is the user response: "+ user_response);

      //adds it to the transcript
      transcript= transcript+user_response+"\n";

      //check if the response has "I am" or "You are"
      if (user_response.contains("I am")){
        System.out.println("This response contains 'I am'");
        user_response=user_response.replace("I am","I'm");
        System.out.println("New response: "+user_response);
      }
      if (user_response.contains("You are")){
        System.out.println("This response contains 'You are'");
        user_response= user_response.replace("You are","You're");
        System.out.println("New response: "+user_response);
      }
  
      //split response into words
      String words[]= original_user_response.split(" ");

      //check whether it has the words we want and add replacements to computer_response
      String computer_response="";
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
        computer_response+=token;
        }
        }
        //print response
        System.out.println(computer_response);
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


  