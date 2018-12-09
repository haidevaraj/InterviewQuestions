package INTERVIEWQUESTIONS.QUESTIONS;

public class Interview {
	
	public static void reverse(){
		String source ="Hello";      
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
      
      //  return reverse;
        System.out.println( "String Reverse"+ reverse);    
    }

	
	public void palindrome ()
	{
		 int reminder,total=0,temp;    
		  int number=456;//It is the number variable to be checked for palindrome  
		  
		  temp=number;    
		  while(number>0){    
		   reminder=number%10;  //getting remainder  
		   total=(total*10)+reminder;    
		   number=number/10;    
		  }    
		  if(temp==total)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		  
	}
//Read more: http://www.java67.com/2012/12/how-to-reverse-string-in-java-stringbuffer-stringbuilder.html#ixzz5IHOImENJ
				 public static void main(String args[]){  
				 
					 Interview i = new Interview();
							 i.reverse();
				  
				}  
				

		


	}


