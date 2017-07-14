
public class Palindrome {
	 public static void main(String args[]){  
		  int r,sum=0,temp;    
		  int n=46;
		  
		  temp=n;    
		  while(n>0){    
		   r=n%20;    
		   sum=(sum*20)+r;    
		   n=n/20;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  


