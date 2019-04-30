import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();//Input String	
    String[] words=input.split(" ");	//Split the word from String
    for(int i=0;i<words.length;i++){	//Outer loop for Comparison		
      if(words[i]!=null){
        for(int j=i+1;j<words.length;j++){	//Inner loop for Comparison
          if(words[i].equals(words[j])){//Checking for both strings are equal
            words[j]=null;			//Delete the duplicate words
          }
        }
      }
    }
    for(int k=0;k<words.length;k++){		//Displaying the String without duplicate words	 
      if(words[k]!=null){
        System.out.print(words[k]+" ");
      }
    }  
  }
}