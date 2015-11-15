package main;

import java.util.ArrayList;
import java.util.List;

import city.BankAccount;
import city.City;
import city.Inhabitant;

import mail.*;
import content.*;

/**
 * @author DUFLOS Nicolas
 * @author DELASSUS Alexandre
 *
 */
public class Mail {
	private City c;
	private List<Inhabitant> inhabitants;
	
	public City getCity() {
		return c;
	}

	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}

	public Mail(){
		c = new City("Lille");
		inhabitants = new ArrayList<Inhabitant>();
		for (int i = 1; i <= 100; i++){
			inhabitants.add(new Inhabitant("Inhabitant-" + i, c, new BankAccount(5000)));
		}
	}
	
	public Letter<?> createLetter(int type){
		int sender = (int) (Math.random() * (99));
		int receiver = (int) (Math.random() * (99));
		Letter<?> l;
		switch(type){
			case 0: l = new SimpleLetter(1, inhabitants.get(0), inhabitants.get(1), "blabla", 0); 
						break;
			case 1: l = new PromissoryLetter(1, inhabitants.get(sender), inhabitants.get(receiver), new PromissoryContent((int) (Math.random() * (100 - 1)))); 
						break;
			case 2: l = new RegisterLetter(1, inhabitants.get(sender), inhabitants.get(receiver), new LetterContent(createLetter((int) (Math.random() * 2))));
						break;
			default: l = new UrgentLetter(1, inhabitants.get(sender), inhabitants.get(receiver), new LetterContent(createLetter((int) (Math.random() * 2))));
						break;
		}
		
		return l;
	}
}
