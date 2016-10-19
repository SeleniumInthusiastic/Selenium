
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int a=5,i,flag=0;
		 
		 for(i=2;i<a;i++){
			 
		   if(a%i==0){
			   
			   System.out.println("The number"+a+"is not a prime");
			   flag=1;
			   System.out.println(""+flag);
			   break;
			   
		   } 
		   
		 }
		   
		  if(flag==0){ 
			   System.out.println("The number"+a+"  is  a prime");
		  }
		 }

}
