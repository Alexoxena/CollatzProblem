
public class CollatzProblem {

	public static void main(String[] args) {
	
	int n;	
	for(int i=1; i<=1000; i++)	{
	n=i;
	System.out.println(n+":");
	do{	
	if(n%2>0){
		n = 3*n+1;}
	else{
		n = n/2;}
  System.out.print(n+"; ");
	}
	while(n>1);
	System.out.println();
	}
}
}