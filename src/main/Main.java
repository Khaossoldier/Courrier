package main;

import mail.Letter;

public class Main {
	
	
	public static void main(String args[]){
		Mail m = new Mail();
		int nb_letters;
		int i = 0;
		for (i = 1; i < 7; i++){
			System.out.println("********************************");
			System.out.println("Day " + i + "\n");
			if (!m.getCity().getPostbox().isEmpty()){
				m.getCity().distributeLetter();
			}
			nb_letters = (int) (Math.random() * (10 - 1) + 1);
			for (int j = 0; j < nb_letters; j++){
				int type = (int) (Math.random() * 4);
				Letter<?> l = m.createLetter(type);
				m.getCity().sendLetter(l);
			}
		}
		while (!m.getCity().getPostbox().isEmpty()){
			System.out.println("********************************");
			System.out.println("Day " + i + "\n");
			m.getCity().distributeLetter();
			i++;
		}
	}
	
}
