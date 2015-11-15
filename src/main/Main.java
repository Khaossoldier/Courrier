package main;

import mail.Letter;

public class Main {
	
	
	public static void main(String args[]){
		if (args.length != 2){
			System.out.println("java -jar mail.jar <nombre de jours> <nombre maximal de lettres>");
			return;
		}
		Mail m = new Mail();
		int nb_letters;
		int i = 0;
		int k = Integer.parseInt(args[0]);
		int max_letters = Integer.parseInt(args[1]);
		for (i = 1; i < k; i++){
			System.out.println("********************************");
			System.out.println("Day " + i + "\n");
			if (!m.getCity().getPostbox().isEmpty()){
				m.getCity().distributeLetter();
			}
			nb_letters = (int) (Math.random() * (max_letters - 1) + 1);
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
