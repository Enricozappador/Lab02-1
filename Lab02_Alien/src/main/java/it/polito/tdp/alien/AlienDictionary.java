package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class AlienDictionary {
	private List <Word_Enchanted> dizionario;	
	
	public AlienDictionary() {
		dizionario = new ArrayList<Word_Enchanted>();
	}

	public List<Word_Enchanted> getDizionario() {
		return dizionario;
	}

	public void setDizionario(List<Word_Enchanted> dizionario) {
		this.dizionario = dizionario;
	}


	public void addWord(String alienWord, String translation ) {
		ArrayList<String> traduzioni = new ArrayList<String>(); 
		traduzioni.add(translation);
		Word_Enchanted wtemp = new Word_Enchanted(alienWord, traduzioni);
		if(dizionario.contains(wtemp)) {
			dizionario.get(dizionario.indexOf(wtemp)).addTraduzione(translation);
			return;
		}
	
			dizionario.add(wtemp);	
			
		

	}
	
	public String translateWord(String alienWord) {
		String result =null; 
		for(Word_Enchanted w : dizionario) {
			if(w.getAlienWord().equals(alienWord)==true) {
				result = w.getTraduzioni().toString();
				return result; 
			}
		}
		return null; 
		
	}
}
