### TP3 - Courrier
### DUFLOS Nicolas DELASSUS Alexandre


Pour lancer l'archive : "java -jar mail.jar <nombre de jours> <nombre de lettre maximale>"

Pour les lancer les tests :

	- Ouvrir Eclipse
	- Selectionner le menu FILE -> Import
	- General / Existing project into Workspace puis 'Next'
	- Selectionner le dossier contenant le projet puis 'Finish'
	- Dans le Package Explorer, cliquer droit sur le dossier test
	- Run as -> JUnit Test

Les fichiers .project et .classpath ont été laissé pour permettre
à Eclipse d'inclure JUnit automatiquement.

Sample :

Pour gérer les différentes lettres contenant uniquement du text, nous avons adapté la classe SimpleLetter et TextContent avec un "mode" suivant quel mode utiliser:
-0 pour la SimpleLetter normale
-1 pour la ThanksLetter
-2 pour la Aknowledgment of receipt

public TextContent(String s, int mode){
		this.text = s;
		this.mode = mode;
	}

public SimpleLetter(int cost, Inhabitant sender, Inhabitant receiver, String s, int mode) {
		super(cost, sender, receiver);
		this.content = new TextContent(s, mode);
	}

public String description(){
		String s = "";
		if (this.getContent().isThanks()){
			s = "a thanks letter which is ";
		}
		if (this.getContent().isAknowledgment()){
			s = "an aknowledgment of receipt which is ";
		}
		return s + "a simple letter whose content is " + this.getContent().getDescription();
	}

Pour gérer les lettres envoyées automatiquement par les RegisteredLetter et PromissoryLetter (à envoyer le jour suivant) nous avons fait une copie de la postbox, puis l'avons vidée avant d'envoyer les lettres, ainsi les nouvelles lettres générer sont ajoutées a la postbox pendant que nous traitons les lettres contenues dans la copie.

public void distributeLetter(){
		
		List<Letter<?>> bag = new LinkedList<Letter<?>>(this.postbox);
		
		this.postbox.clear();
		
		for (Letter<?> l : bag){
			System.out.println("<- " + l.getReceiver().getName() + " receives " + l.description() + " from " + l.getSender().getName());
			l.getReceiver().receiveLetter(l);
		}
		
	}
