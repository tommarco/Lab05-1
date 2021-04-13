package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

public class Anagramma {
public List <String> anagramma (String parola) {
		
		List <String> risultato = new ArrayList <> ();
		// cancella dalla lista le parole non valide (leggendo il dizionario)
		
		permuta("",parola, 0,risultato); //Lancia ricorsione
		return null;
	}
	
	//livello = lunghezzza della soluzione parziale 
	//livello inziale=0
	//parziale = stringa che contiene l'anagramma incompleto in fase di costruzione
	//lettere = le lettere della parola iniziale che ancora non abbiamo utilizzato
	// (== il sotto-programma che dobbiamo risolvere)
	
	private void permuta(String parziale,String lettere, int livello, List <String> risultato) {
		
		if(lettere.length()==0 ) {// caso terminale quando il numero delle lettere rimanenti è pari a 0 
			//o la stringa parziale è uguale alla stringa parola
			// la soluzione parziale è anche una soluzione completa!
			System.out.println(parziale);
			//if (parziale è una parola valida?){
			risultato.add(parziale);
			
		}else {
			// fai la ricorsione
			//sottoproblema== una lettera ( un singolo carattere) di 'lettere'
			for(int pos=0; pos<lettere.length(); pos++) {
				char tentativo= lettere.charAt(pos);
				
			String nuovaParziale = parziale + tentativo;
				
			String	nuovaLettere= lettere.substring(0, pos)+lettere.substring(pos+1);// togli il carattere pos da lettere;
						//if (nuova parziale è un prefisso valido di almeno ua parola nel dizionario)
			//"aqz"-> no; "car"-> si (carro, carrello, carta...)
					permuta(nuovaParziale,nuovaLettere, livello+1, risultato);
				
				//BackTracking (NON SERVE)
				
				//rimetti a posto 'parziale'
				//rimetti a posto 'lettere'
				
			}
		}
	}

}
