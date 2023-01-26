package rekrytering;

import java.util.Arrays;

public class FindBestCandidates {
	private static final double MIN_AVG_GRADE = 4.0;

	public static void main(String[] args) {
		Applicant[] lista = new Applicant[231];
		lista = FileReader.readFromFile("applications_all.txt",231);
		
		Applicant[] aboveMin= findBestCandidates(lista);
		Arrays.sort(aboveMin);
		for(int i = 0; i<aboveMin.length; i++) {
			System.out.println(aboveMin[i].toString());
	
		}
		
		/**for(int i = 0; i<lista.length; i++) {
			System.out.println(lista[i]);
		}*/
		
		
		
		
		
		// Läs från fil (Börja med "applications_small.txt), spara resultatet i en
		// vektor

		// Skicka in Applicant-vektorn (som du fick i föregående steg) till metoden
		// findBestCandidiates (nedan)
		// Spara resultatet i en vektor

		// Printa resultatet från findBestCandidates
	}

	public static Applicant[] findBestCandidates(Applicant[] applicants) {
		int antal = 0;
		for(int i = 0; i < applicants.length; i++) {
			if ( applicants[i].getAvgGrade() >= MIN_AVG_GRADE) {
				antal ++;
			}
		}
		int nbr = 0;
		Applicant[] tot = new Applicant[antal];
		for(int i = 0; i<applicants.length; i++) {
			if ( applicants[i].getAvgGrade() >= MIN_AVG_GRADE) {
				tot[nbr] = applicants[i];
				nbr++;
			}
		}
		
		// Hitta alla kandidater som har medelbetyg över MIN_AVG_GRADE
		// Lagra alla dessa kandidater i en vektor, returnera vektorn
		return tot; //Byt ut denna rad mot hela din egen lösning
	}
}
