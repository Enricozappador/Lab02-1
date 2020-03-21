package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class AlienDictionary {
	private List <Word> dizionario;	
	
	public AlienDictionary() {
		dizionario = new ArrayList<Word>();
	}

	public List<Word> getDizionario() {
		return dizionario;
	}

	public void setDizionario(List<Word> dizionario) {
		this.dizionario = dizionario;
	}


	public void addWord(String alienWord, String translation ) {
		Word wtemp = new Word(alienWord, translation); 
		if(dizionario.contains(wtemp)) {
			dizionario.get(dizionario.indexOf(wtemp)).setTranslation(translation);
			return;
		}
	
			dizionario.add(wtemp);	
			
		

	}
	
	public String translateWord(String alienWord) {
		String result =null; 
		for(Word w : dizionario) {
			if(w.getAlienWord().equals(alienWord)==true) {
				result = w.getTranslation();
				return result; 
			}
		}
		return null; 
		
	}
}
