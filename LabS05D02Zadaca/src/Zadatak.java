
public class Zadatak {

	private static DB[] song() {
	
		DB[] songInput = new DB[3];
        int i=0;
		while(i < songInput.length) {
			DB pjesme = new DB();
			
			System.out.println("Unesite naziv pjesme");
			pjesme.nazivPjesme = TextIO.getln();
							
			System.out.println("Unesite ime izvodjaca");
			pjesme.imeIzvodjaca = TextIO.getln();
			
			System.out.println("Unesite duzinu trajanje pjesme u sekundama");
			pjesme.duzinaTrajanja = TextIO.getlnInt();
				         
			songInput[i] = pjesme;
			i++;
		}
		return songInput;
	}

	private static void ispisInformacija(DB[] song) {
		int sum = 0;
		for (int i = 0; i < song.length; i++) {
			sum += song[i].duzinaTrajanja;
		}
		System.out
				.println("Ukupna duzina trajanja vasih pjesama u sekundama je: "
						+ sum);

	
	}

	private static void ispisiMax(DB[] song){
		
		int tempMax = song[0].duzinaTrajanja;
		String tempMaxIme="";
		
		for (int i =0;  i < song.length; i++) {
			
			if (song[i].duzinaTrajanja > tempMax) {
				tempMax = song[i].duzinaTrajanja; 
				tempMaxIme =song[i].nazivPjesme;
			}
		}
		
		System.out.println("Najduza pjesma u vasoj listi je " +tempMaxIme +" i traje " +tempMax);

	}

	public static void main(String[] args) {
       DB [] pjesme = song(); 
		ispisInformacija(pjesme);
		ispisiMax(pjesme);
	}
}
