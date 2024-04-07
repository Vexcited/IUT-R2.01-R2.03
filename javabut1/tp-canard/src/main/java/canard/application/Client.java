package canard.application;

import canard.model.Colvert;
import canard.model.PrototypeCanard;
import canard.model.vol.PropulsionAReaction;

public class Client {
	public static void main (String[] args) {
    // Commencer par créer un colvert
    Colvert colvert = new Colvert("Piero");
    // et demander au colvert de s'afficher
    System.out.println(colvert.afficher());
    // de nager
    System.out.println(colvert.nager());
    // d'effectuer un cancan
    System.out.println(colvert.effectuerCancan());
    // puis un vol
    System.out.println(colvert.effectuerVol());

    // Puis, créer un prototype de canard
    PrototypeCanard prototypeCanard = new PrototypeCanard("Prototype");
    // et lui demander de s'afficher
    System.out.println(prototypeCanard.afficher());
    // et d'effectuer un vol
    System.out.println(prototypeCanard.effectuerVol());

    // Modifier ensuite le comportement de vol du prototype qui doit pouvoir
    // désormais voler avec une propulsion à réaction
    prototypeCanard.changerComportementVol(new PropulsionAReaction());
    // et lui demander d'effectuer un vol.
    System.out.println(prototypeCanard.effectuerVol());
	}
}