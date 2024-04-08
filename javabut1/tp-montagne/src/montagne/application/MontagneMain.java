package montagne.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import montagne.ihm.Console;
import montagne.metier.ChaineDeMontagne;
import montagne.metier.Sommet;

public class MontagneMain {
	public static void main(String[] args) {
    ArrayList<Sommet> sommets = new ArrayList<>();
    sommets.add(new Sommet("Mont Blanc", 4809, ChaineDeMontagne.MONTBLANC));
    sommets.add(new Sommet("Aiguille des Grands Montets", 3295, ChaineDeMontagne.MONTBLANC));
    sommets.add(new Sommet("La Rhune", 905, ChaineDeMontagne.PYRENEES));
    sommets.add(new Sommet("Pic du Midi", 2877, ChaineDeMontagne.PYRENEES));
    sommets.add(new Sommet("Pic d'Aneto", 3404, ChaineDeMontagne.PYRENEES));
    sommets.add(new Sommet("Pic du Canigou", 2785, ChaineDeMontagne.PYRENEES));
    sommets.add(new Sommet("Puy de Sancy", 1579, ChaineDeMontagne.MASSIF_CENTRAL));
    sommets.add(new Sommet("Puy de Dôme", 1465, ChaineDeMontagne.MASSIF_CENTRAL));
    sommets.add(new Sommet("Le Grand Ballon", 1424, ChaineDeMontagne.VOSGES));

    Console.titre("Mes sommets");
	
    for (Sommet sommet : sommets) {
      System.out.println(sommet.description());
    }
    
    Console.titre("Mes sommets triés par altitude décroissante");
    
    // Avec un seul paramètre, la méthode sort() utilise la méthode compareTo() de l'interface Comparable
    // implémentée par la classe Sommet.
    Collections.sort(sommets);

    for (Sommet sommet : sommets) {
      System.out.println(sommet.description());
    }

    Console.titre("Mes sommets triés par altitude croissante");
    
    Collections.sort(sommets, new ComparateurAltitude());

    for (Sommet sommet : sommets) {
      System.out.println(sommet.description());
    }

    Console.titre("Mes sommets triés par nom (ordre alpha)");
    
    Collections.sort(sommets, new ComparateurNom());

    for (Sommet sommet : sommets) {
      System.out.println(sommet.description());
    }

    Console.titre("Mes sommets triés par chaîne de montagne");
    
    Collections.sort(sommets, new ComparateurChaineDeMontagne());

    for (Sommet sommet : sommets) {
      System.out.println(sommet.description());
    }
  }
}

/**
 * Comparateur qui arrange les éléments dans l'ordre croissant
 * en fonction de l'altitude.
 */
class ComparateurAltitude implements Comparator<Sommet> {
  public int compare(Sommet sommet1, Sommet sommet2) {
    return sommet1.altitude().compareTo(sommet2.altitude());
  }
}

/**
 * Comparateur qui arrange les éléments en fonction
 * de l'ordre alphabétique du nom.
 */
class ComparateurNom implements Comparator<Sommet> {
  public int compare(Sommet sommet1, Sommet sommet2) {
    return sommet1.nom().compareTo(sommet2.nom());
  }
}

/**
 * Comparateur qui arrange les éléments en fonction
 * de l'ordre alphabétique de la chaîne de montagne.
 */
class ComparateurChaineDeMontagne implements Comparator<Sommet> {
  public int compare(Sommet sommet1, Sommet sommet2) {
    return sommet1.chaine().nom().compareTo(sommet2.chaine().nom());
  }
}

