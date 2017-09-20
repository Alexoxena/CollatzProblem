
public class CollatzProblem {

	public static void main(String[] args) {
		
		int n;	//Variable n
	
		for(int i=1; i<=100; i++)	{//Collatz Vermutung für alle Zahlen von 1 bis 1000
	
			n=i;
	
			System.out.println(n+":");//Anfangswert wird ausgegeben
	
			do{	
	
				if(n%2>0){ //wenn Zahl ungerde n*3+1
					n = 3*n+1;}
	
				else{            //wenn Zahl gerade n/2
						n = n/2;}
  
				System.out.print(n+"; ");//Ergebnis ausgeben (kein Zeilenumbruch nach jeder Zahl) 
				}
	
			while(n>1); //Weiterführen bis n=1
	
			System.out.println();//Zeilenumbruch
	
		}

	}

}