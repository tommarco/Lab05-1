package it.polito.tdp.anagrammi.model;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.anagrammi.DAO.AnagrammaDAO;

public class Model {
	
	private AnagrammaDAO anagrammaDao;
	private Anagramma a;
	List <String> c;
	List <String>e;
	
	public Model() {
		
		anagrammaDao= new AnagrammaDAO();
		
		a= new Anagramma();
		
		
		 c= new LinkedList <String>();
		
		e= new LinkedList <String>();
		
		
	
	}

	
	public void Controlla (String parola) {
		
		for(String p:a.anagramma(parola)) {
			
			if(anagrammaDao.dizionario(p)) {
				
				
				c.add(p);
				
				
			}
			else
				e.add(p);		
			
			
			
		}
		
		
	}


	public List<String> getC() {
		return c;
	}


	public List<String> getE() {
		return e;
	}
	
	
}
