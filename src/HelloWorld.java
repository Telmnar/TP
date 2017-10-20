import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tu as 18 ans en 3 morceaux, 2 tableaux, un (18) à part
		
		String tableauAge []= new String [2];
		String sujet = "Tu as";
		String cdd = "ans";
		int age = 18;
		tableauAge[0]=sujet;
		tableauAge[1]=cdd;
		System.out.println(tableauAge[0]+" "+ age+ " " +tableauAge[1]);
	
		System.out.println("\n"+"Affichage par boucle for conditionné par if\n");
		for(int i=0; i<tableauAge.length ; i++) {
			if (i==0) {System.out.print(tableauAge[i]+" "+ age +" ");} 
			else System.out.print(tableauAge[i]);
			
			}
		System.out.println("\n");
		
	//Autre méthode condition par taille du tableau
		 for(String str: tableauAge) {
				if (str.equals(tableauAge[tableauAge.length-1])) {
					System.out.print(age +" "+ str);} 	//au deuxième passage
				else System.out.print(str);				//au 1er passage
				
				}
			System.out.println("\n");
	

			
	// Autre méthode condition par parité de l'indice du tableau
    // i%2==0 signifie que i est pair, sinon i est impair
			
			 for(int i=0; i<tableauAge.length ; i++) {
					if (i%2==0) {System.out.print(tableauAge[i]+" "+ age +" ");} 
					else System.out.print(tableauAge[i]);
					
					}
				System.out.println("\n");
	}
}
