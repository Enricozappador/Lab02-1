package it.polito.tdp.alien;

import java.util.List;

public class AlienDictionary {
	private List <Word> dizionario;

	public List<Word> getDizionario() {
		return dizionario;
	}

	public void setDizionario(List<Word> dizionario) {
		this.dizionario = dizionario;
	}

	public AlienDictionary(List<Word> dizionario) {
		super();
		this.dizionario = dizionario;
	} 
	
	public void addWord(String alienWord, String translation ) {
		Word wtemp = new Word(alienWord, translation); 
		boolean flag = false; 
		for(Word w : dizionario) {
			if(w.getAlienWord().equals(alienWord)==true) {
				w.setTranslation(translation);
				flag = true;
			}
		}
		if(flag==false) {
	dizionario.add(wtemp);	
		}
	}
	
	public String translateWord(String alienWord) {
		String result = null; 
		for(Word w : dizionario) {
			if(w.getAlienWord().equals(alienWord)==true) {
				result = w.getTranslation();
			}
		}
		return result; 
		
	}
}
