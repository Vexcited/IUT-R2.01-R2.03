package cafetoeil.application;

import cafetoeil.model.Boisson;
import cafetoeil.model.cafedebase.Colombia;
import cafetoeil.model.cafedebase.Espresso;
import cafetoeil.model.supplement.Caramel;
import cafetoeil.model.supplement.Chantilly;
import cafetoeil.model.supplement.Chocolat;

public class CafetOeil {
 
	public static void main(String args[]) {
		Boisson expressoSimple = new Espresso();
		System.out.println(expressoSimple.description() 
				 + " : " + expressoSimple.prix()+ " €");
 
		Boisson colombiaAmeliore = new Colombia();
		colombiaAmeliore = new Caramel(colombiaAmeliore);
		colombiaAmeliore = new Chocolat(colombiaAmeliore);
		colombiaAmeliore = new Chantilly(colombiaAmeliore);
		System.out.println(colombiaAmeliore.description() 
				 + " : " + colombiaAmeliore.prix()+ " €");
 
		Boisson autreColombiaAmeliore = new Colombia();
		autreColombiaAmeliore = new Chocolat(autreColombiaAmeliore);
		autreColombiaAmeliore = new Chocolat(autreColombiaAmeliore);
		System.out.println(autreColombiaAmeliore.description() 
				 + " : " + autreColombiaAmeliore.prix()+ " €");
	}
}
