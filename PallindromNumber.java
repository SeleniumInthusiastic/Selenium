
public class PallindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			  int r,addition=0,partial;    
			  int n=65;//It is the numeric variable to be checked for palindrome  
			  
			  partial=n;    
			  while(n>0){    
			   r=n%10;  // reminder logic
			   addition=(addition*10)+r;    
			   n=n/10;    
			  }    
			  if(partial==addition)    
			   System.out.println(partial+ " is palindrome number ");    
			  else    
			   System.out.println(partial + "not palindrome");    
			}  
			}  

