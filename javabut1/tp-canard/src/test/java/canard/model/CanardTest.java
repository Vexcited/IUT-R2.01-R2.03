package canard.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import canard.model.cancan.CanardMuet;
import canard.model.cancan.Cancan;
import canard.model.cancan.Coincoin;
import canard.model.vol.NePasVoler;
import canard.model.vol.PropulsionAReaction;
import canard.model.vol.VolerAvecDesAiles;

class CanardTest {
	private static final String NAGER = "Tous les canards flottent, même les leurres!";

	private static final String VOLER = "Je vole !";
	private static final String NE_PAS_VOLER = "Je ne sais pas voler";
  private static final String VOLER_A_REACTION = "Je vole avec un réacteur !";

	private static final String CANCAN = "Can-can";
	private static final String COINCOIN = "Coin-coin";
	private static final String SILENCE = "...Silence...";

	Canard colvert;
	Canard leurre;
	Canard mandarin;
	Canard canardPlastique;
  Canard prototypeCanard;

	@BeforeEach
	private void extracted () {
		colvert = new Colvert("Piero");
		leurre = new Leurre("Danny");
		mandarin = new Mandarin("Oshidori");
		canardPlastique = new CanardEnPlastique("Rubber");
    prototypeCanard = new PrototypeCanard("Prototype");
	}

	@Test
	public void test_effectuerVol () {
		assertEquals(VOLER, colvert.effectuerVol());
		assertEquals(VOLER, mandarin.effectuerVol());

		assertEquals(NE_PAS_VOLER, leurre.effectuerVol());
		assertEquals(NE_PAS_VOLER, canardPlastique.effectuerVol());
    assertEquals(NE_PAS_VOLER, prototypeCanard.effectuerVol());
	}

	@Test
	public void test_effectuerCancan() {
		assertEquals(CANCAN, colvert.effectuerCancan());
		assertEquals(CANCAN, mandarin.effectuerCancan());

		assertEquals(SILENCE, leurre.effectuerCancan());
		assertEquals(SILENCE, prototypeCanard.effectuerCancan());
		
    assertEquals(COINCOIN, canardPlastique.effectuerCancan());
	}

	@Test
	public void test_nager() {
		assertEquals(NAGER, colvert.nager());
		assertEquals(NAGER, mandarin.nager());
		assertEquals(NAGER, leurre.nager());
		assertEquals(NAGER, canardPlastique.nager());
		assertEquals(NAGER, prototypeCanard.nager());
	}

	@Test
	public void test_presentation_nom_et_afficher() {
		assertEquals("Piero", colvert.getNom());
		assertEquals("Je suis un vrai colvert", colvert.afficher());

		assertEquals("Oshidori", mandarin.getNom());
		assertEquals("Je suis un vrai mandarin", mandarin.afficher());

		assertEquals("Danny", leurre.getNom());
		assertEquals("Je suis un leurre", leurre.afficher());

		assertEquals("Rubber", canardPlastique.getNom());
		assertEquals("Je suis un canard en plastique", canardPlastique.afficher());

		assertEquals("Prototype", prototypeCanard.getNom());
		assertEquals("Je suis un prototype de canard", prototypeCanard.afficher());
	}

  @Test
  public void test_changement_comportement_vol() {
    colvert.changerComportementVol(new NePasVoler());
    mandarin.changerComportementVol(new NePasVoler());
    leurre.changerComportementVol(new NePasVoler());
    canardPlastique.changerComportementVol(new NePasVoler());
    prototypeCanard.changerComportementVol(new NePasVoler());

    assertEquals(NE_PAS_VOLER, colvert.effectuerVol());
    assertEquals(NE_PAS_VOLER, mandarin.effectuerVol());
    assertEquals(NE_PAS_VOLER, leurre.effectuerVol());
    assertEquals(NE_PAS_VOLER, canardPlastique.effectuerVol());
    assertEquals(NE_PAS_VOLER, prototypeCanard.effectuerVol());
    
    colvert.changerComportementVol(new VolerAvecDesAiles());
    mandarin.changerComportementVol(new VolerAvecDesAiles());
    leurre.changerComportementVol(new VolerAvecDesAiles());
    canardPlastique.changerComportementVol(new VolerAvecDesAiles());
    prototypeCanard.changerComportementVol(new VolerAvecDesAiles());

    assertEquals(VOLER, colvert.effectuerVol());
    assertEquals(VOLER, mandarin.effectuerVol());
    assertEquals(VOLER, leurre.effectuerVol());
    assertEquals(VOLER, canardPlastique.effectuerVol());
    assertEquals(VOLER, prototypeCanard.effectuerVol());

    colvert.changerComportementVol(new PropulsionAReaction());
    mandarin.changerComportementVol(new PropulsionAReaction());
    leurre.changerComportementVol(new PropulsionAReaction());
    canardPlastique.changerComportementVol(new PropulsionAReaction());
    prototypeCanard.changerComportementVol(new PropulsionAReaction());

    assertEquals(VOLER_A_REACTION, colvert.effectuerVol());
    assertEquals(VOLER_A_REACTION, mandarin.effectuerVol());
    assertEquals(VOLER_A_REACTION, leurre.effectuerVol());
    assertEquals(VOLER_A_REACTION, canardPlastique.effectuerVol());
    assertEquals(VOLER_A_REACTION, prototypeCanard.effectuerVol());
  }

  @Test
  public void test_changement_comportement_cancan() {
    colvert.changerComportementCancan(new CanardMuet());
    mandarin.changerComportementCancan(new CanardMuet());
    leurre.changerComportementCancan(new CanardMuet());
    canardPlastique.changerComportementCancan(new CanardMuet());
    prototypeCanard.changerComportementCancan(new CanardMuet());

    assertEquals(SILENCE, colvert.effectuerCancan());
    assertEquals(SILENCE, mandarin.effectuerCancan());
    assertEquals(SILENCE, leurre.effectuerCancan());
    assertEquals(SILENCE, canardPlastique.effectuerCancan());
    assertEquals(SILENCE, prototypeCanard.effectuerCancan());

    colvert.changerComportementCancan(new Cancan());
    mandarin.changerComportementCancan(new Cancan());
    leurre.changerComportementCancan(new Cancan());
    canardPlastique.changerComportementCancan(new Cancan());
    prototypeCanard.changerComportementCancan(new Cancan());

    assertEquals(CANCAN, colvert.effectuerCancan());
    assertEquals(CANCAN, mandarin.effectuerCancan());
    assertEquals(CANCAN, leurre.effectuerCancan());
    assertEquals(CANCAN, canardPlastique.effectuerCancan());
    assertEquals(CANCAN, prototypeCanard.effectuerCancan());
    
    colvert.changerComportementCancan(new Coincoin());
    mandarin.changerComportementCancan(new Coincoin());
    leurre.changerComportementCancan(new Coincoin());
    canardPlastique.changerComportementCancan(new Coincoin());
    prototypeCanard.changerComportementCancan(new Coincoin());

    assertEquals(COINCOIN, colvert.effectuerCancan());
    assertEquals(COINCOIN, mandarin.effectuerCancan());
    assertEquals(COINCOIN, leurre.effectuerCancan());
    assertEquals(COINCOIN, canardPlastique.effectuerCancan());
    assertEquals(COINCOIN, prototypeCanard.effectuerCancan());
  }
}
