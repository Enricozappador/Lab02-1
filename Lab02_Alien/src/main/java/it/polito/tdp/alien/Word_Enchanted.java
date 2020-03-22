package it.polito.tdp.alien;

import java.util.ArrayList;

public class Word_Enchanted {
	
	private String AlienWord; 
	private ArrayList<String> traduzioni;
	
	
	public String getAlienWord() {
		return AlienWord;
	}
	public void setAlienWord(String alienWord) {
		AlienWord = alienWord;
	}
	public ArrayList<String> getTraduzioni() {
		return traduzioni;
	}
	public void setTraduzioni(ArrayList<String> traduzioni) {
		this.traduzioni = traduzioni;
	}
	public Word_Enchanted(String alienWord, ArrayList<String> traduzioni) {
		super();
		AlienWord = alienWord;
		this.traduzioni = traduzioni;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AlienWord == null) ? 0 : AlienWord.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word_Enchanted other = (Word_Enchanted) obj;
		if (AlienWord == null) {
			if (other.AlienWord != null)
				return false;
		} else if (!AlienWord.equals(other.AlienWord))
			return false;
		return true;
	}
	
	public void addTraduzione(String traduzione) {
		traduzioni.add(traduzione);
	}
	

}
