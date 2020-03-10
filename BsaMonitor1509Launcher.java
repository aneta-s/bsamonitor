package mainbsamonitor1509;
import java.util.Scanner;

/**
 * @author aneta
 *bsa
 */
public class BsaMonitor1509Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array declareren
		// array waarin namen van vakken staan
		Scanner input=new Scanner(System.in);

		String[] vakNamen = {"programming","db1","bom","db2"};
		// array waarin te behalen punten staan
		int [] vakPunten = {12,3,3,4};
		//array waarin je de cijfers die je voor elk vak behaalt zult opslaan
		// declareer arrays alle drie even groot

		double [] vakCijfers= new double [vakNamen.length];
		int behaaldepunten=0;
		int tebehalenpunten=0;
		int []	behaaldePunten=new int [vakPunten.length];//VRAAG: Mag ik deze array aanmaken of meot als primitive variable?
		// laat de gebruiker zijn haar behaalde cijfers laten voeren
		// VOOR IEDERE VAK ZIJN CIJFERS LATEN VOEREN EN OPSLAAN IN ARRAY

		System.out.println("voer behaalde cijfers in");
		// sla de vakCijfers in de array vakcIJFERS
		for (int i=0;i <vakNamen.length;i++) {
			System.out.println(vakNamen[i]);
			vakCijfers[i]=input.nextDouble(); 
			//CONTROLEER OF DA DE GEBRUIKER ALLEEN GELDIGE CIJFERS INVOERT
			// CONTROLE OF TEST OF INGEVOERDE CIJFERS TUSSEN 1 EN 10 LIGGEN

			while (vakCijfers[i] <= 1.0 || vakCijfers[i] >=10.0) {
				System.out.println("getal moet tussen 1 and 10");
				System.out.println("voer behaalde cijfers in");
				System.out.println(vakNamen[i]);// HIERMEE GA JE VERDER MET DE LAATST INGEVOERDE VAK
				vakCijfers[i]=input.nextDouble(); 
			}
		}
		// TOEKENNEN VAN PUNTEN DIE GEBRUIKER HEEFT BEHAALD
		// BEPALING AAN DE HAND VAN INGEVOERDE CIJFERS HOEVEEL PUNTEN GEBRUIKER HEBT BEHAALD

		for (int i=0;i< vakPunten.length;i++) {
			if (vakCijfers[i]>=5.5) {
				// SLA BIJ ELK VAK BEHAALDE PUNTEN OP IN ARRAY VAKPUNTEN
				// sla bij elk vak behaalde studiepunten op in de array vakPunten

				behaaldePunten[i]=vakPunten[i];
			}else {
				behaaldePunten[i]=0;
				// TEL TE BEHALEN PUNTEN BIJELKAAR OP
			}
			// TELL OOK ALLE BEHAALDE PUNTEN behaaldePunten [] EN TE BEHALEN PUNTEN vakPunten[] OP EN SLA DEZE OP. JE HEBT VARIABELEN NODIG OM TOTALEN DECLAREREN

			tebehalenpunten += vakPunten[i];
			//TEL ALLE BEHAALDE PUNTEN BIJ ELKAAR OP 

			behaaldepunten += behaaldePunten[i]; // 
			System.out.println("totaal behaalde punten / te behalen punten: "+behaaldepunten+"/"+tebehalenpunten);
			int bsa=berekenBsa(behaaldepunten,tebehalenpunten);
		}
		for (int i=0; i< vakNamen;i++) {
			System.out.println("vak/project"+vakNamen[i]+"\t Cijfer: "+ vakCijfers[i]+"-"+behaaldePunten[i]);
		}
	}
	public static int berekenBsa(int behaaldepunten, int tebehalenpunten) {
		int bsa=0;
		if (behaaldepunten<5/6) {
			System.out.println("PAS OP je ligt op schema voor een negatief BSA!");
		} else{
			System.out.println("Goed gedaan! je ligt op schema voor een positief BSA!");
		}
		return bsa;
	}
}





