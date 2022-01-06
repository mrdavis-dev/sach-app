/**
* Código generado por WINDEV Mobile Express - ¡NO MODIFICAR!
 * Objeto WINDEV Mobile Express: Fenêtre
 * Clase Android: WIN_paginarecibo
 * Date: 04/01/2022 16:45:38
 * Versión de wdjava.dll: 26.0.407.3
 */


package com.mrdavis.test.wdgen;


import com.mrdavis.test.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFWIN_paginarecibo extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de WIN_paginarecibo
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_search
 */
class GWDBTN_search extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de WIN_paginarecibo.BTN_search
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2432170233899274752l);

super.setChecksum("714680081");

super.setNom("BTN_search");

super.setType(4);

super.setBulle("");

super.setLibelle("Buscar");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(413, 104);

super.setTailleInitiale(48, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(5);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("D:\\My Mobile Projects\\test\\Templates\\WM\\250 Phoenix\\Phoenix_Btn_Menu@dpi1_5x.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_search mWD_BTN_search;

/**
 * COMBO_tipocliente
 */
class GWDCOMBO_tipocliente extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de WIN_paginarecibo.COMBO_tipocliente
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,316,21);
super.setRectCompPrincipal(0,21,316,40);
super.setQuid(2432170233899340288l);

super.setChecksum("717822203");

super.setNom("COMBO_tipocliente");

super.setType(10002);

super.setBulle("");

super.setLibelle("&Tipo de cliente:");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(96, 26);

super.setTailleInitiale(63, 316);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("Seleccione\r\nresidencial\r\nespecial\r\ncomercial");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("D:\\My Mobile Projects\\test\\Templates\\WM\\250 Phoenix\\Phoenix_Combo@dpi1x.png?E5_3NP_32_6_42_6", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {6, 42, 6, 32}, 0xFFFFFF, 1, 5));

super.setStyleElement(0x0, 0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 48);

super.setStyleSelection(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleBouton(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0xFFFFFFFF);

super.setParamSaisieObligatoire(false);

super.setParamErreurSaisieObligatoire("", true, false, false);

super.setParamIndicationSaisieObligatoire(true, false, false);

super.setStyleChampErreurSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieObligatoire(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieObligatoire(21, 141);

super.setStyleChampIndicationSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleIndicationSaisieObligatoire(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoIndicationSaisieObligatoire(21, 141);

super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOMBO_tipocliente mWD_COMBO_tipocliente;

/**
 * EDT_contrato
 */
class GWDEDT_contrato extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de WIN_paginarecibo.EDT_contrato
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,316,21);
super.setRectCompPrincipal(0,21,316,40);
super.setQuid(2432170233899405824l);

super.setChecksum("714810241");

super.setNom("EDT_contrato");

super.setType(20001);

super.setBulle("");

super.setLibelle("Contrato:");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(180, 26);

super.setTailleInitiale(63, 316);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(2);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("D:\\My Mobile Projects\\test\\Templates\\WM\\250 Phoenix\\Phoenix_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x0, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(27, 0xF48542, 0x740500, 0xFFFFFF, 16.000000, 16.000000, 1, 1), 0xF48542, 0xFF000001, "", 1);

super.setParamSaisieObligatoire(false, true);

super.setParamErreurSaisieInvalide("", true, false, false);

super.setParamErreurSaisieObligatoire("", true, false, false);

super.setParamIndicationSaisieObligatoire(true, false, false);

super.setStyleChampErreurSaisieInvalide(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieInvalide(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieInvalide(21, 141);

super.setStyleChampErreurSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieObligatoire(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieObligatoire(21, 141);

super.setStyleChampIndicationSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleIndicationSaisieObligatoire(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoIndicationSaisieObligatoire(21, 141);

super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDEDT_contrato mWD_EDT_contrato;

/**
 * EDT_SinNombre1
 */
class GWDEDT_SinNombre1 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de WIN_paginarecibo.EDT_SinNombre1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,316,21);
super.setRectCompPrincipal(0,21,316,40);
super.setQuid(2432170233899471360l);

super.setChecksum("714875777");

super.setNom("EDT_SinNombre1");

super.setType(20001);

super.setBulle("");

super.setLibelle("Nombre:");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(264, 26);

super.setTailleInitiale(63, 316);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(3);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("D:\\My Mobile Projects\\test\\Templates\\WM\\250 Phoenix\\Phoenix_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x0, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(27, 0xF48542, 0x740500, 0xFFFFFF, 16.000000, 16.000000, 1, 1), 0xF48542, 0xFF000001, "", 1);

super.setParamSaisieObligatoire(false, true);

super.setParamErreurSaisieInvalide("", true, false, false);

super.setParamErreurSaisieObligatoire("", true, false, false);

super.setParamIndicationSaisieObligatoire(true, false, false);

super.setStyleChampErreurSaisieInvalide(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieInvalide(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieInvalide(21, 141);

super.setStyleChampErreurSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieObligatoire(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieObligatoire(21, 141);

super.setStyleChampIndicationSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleIndicationSaisieObligatoire(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoIndicationSaisieObligatoire(21, 141);

super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDEDT_SinNombre1 mWD_EDT_SinNombre1;

/**
 * CBOX_selectrecibo
 */
class GWDCBOX_selectrecibo extends WDInterrupteurABascule
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de WIN_paginarecibo.CBOX_selectrecibo
////////////////////////////////////////////////////////////////////////////
// Type de champ non géré (Opción de casilla de verificación) : Champ <WIN_paginarecibo.CBOX_selectrecibo.CBOX_selectrecibo> ignoré ! Message d'erreur inséré dans le code d'init.
// Type de champ non géré (Opción de casilla de verificación) : Champ <WIN_paginarecibo.CBOX_selectrecibo.CBOX_selectrecibo> ignoré ! Message d'erreur inséré dans le code d'init.
/**
 * Initialise tous les champs de WIN_paginarecibo.CBOX_selectrecibo
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de WIN_paginarecibo.CBOX_selectrecibo
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
// Erreur d'initialisation du champ
// Erreur d'initialisation du champ
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2432170835334100364l);

super.setChecksum("854142761");

super.setNom("CBOX_selectrecibo");

super.setType(132);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(348, 26);

super.setTailleInitiale(36, 316);

super.setValeurInitiale("0");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(4);

super.setLettreAppel(0);

super.setTauxParallaxe(0, 0);

super.setModeAffichage(0, 2, false);

super.setOptionOnOff("Recibos anticipados ", "1", "Recibos", "0");

super.setStyleGlissiere("", WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0xFFFFFFFF, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0xFFFFFFFF, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0xFFFFFFFF, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0xFFFFFFFF, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0xFFFFFFFF, 16.000000, 16.000000, 1, 1), "", WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0xFFFFFFFF, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0xFFFFFFFF, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0xFFFFFFFF, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0xFFFFFFFF, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0xFFFFFFFF, 16.000000, 16.000000, 1, 1), 0, 0, 56, 28, 6);

super.setStyleCurseur("", WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0x68635F, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0x68635F, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0x68635F, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0x68635F, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0x68635F, 12.000000, 12.000000, 1, 1), "", WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0x68635F, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0x68635F, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0x68635F, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0x68635F, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x68635F, 0x0, 0x68635F, 12.000000, 12.000000, 1, 1), 22, 22, -3);

super.setStyleLibelleOn(0xFFFFFF, 0xE0DCDA, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleLibelleOff(0xFFFFFF, 0xE0DCDA, creerPolice_GEN("Roboto", -8.000000, 0));

super.setParamAnimationChamp(40, 1202, 100);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCBOX_selectrecibo mWD_CBOX_selectrecibo;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de WIN_paginarecibo.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2432170233899209216l);

super.setChecksum("714614089");

super.setNom("#EXPRESSVersion");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Version Express");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(96, 96);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ WIN_paginarecibo.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;

/**
 * Traitement: Declaraciones globales de WIN_paginarecibo
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MyWindow()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;



}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre WIN_paginarecibo
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_BTN_search = new GWDBTN_search();
mWD_COMBO_tipocliente = new GWDCOMBO_tipocliente();
mWD_EDT_contrato = new GWDEDT_contrato();
mWD_EDT_SinNombre1 = new GWDEDT_SinNombre1();
mWD_CBOX_selectrecibo = new GWDCBOX_selectrecibo();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre WIN_paginarecibo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2432170233899143664l);

super.setChecksum("721157178");

super.setNom("WIN_paginarecibo");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(625, 360);

super.setTitre("");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(1);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0x68635F);

super.setCouleurBarreSysteme(0xFF000001);

super.setCopieEcranAutorisee(true);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de WIN_paginarecibo
////////////////////////////////////////////////////////////////////////////
mWD_BTN_search.initialiserObjet();
super.ajouter("BTN_search", mWD_BTN_search);
mWD_COMBO_tipocliente.initialiserObjet();
super.ajouter("COMBO_tipocliente", mWD_COMBO_tipocliente);
mWD_EDT_contrato.initialiserObjet();
super.ajouter("EDT_contrato", mWD_EDT_contrato);
mWD_EDT_SinNombre1.initialiserObjet();
super.ajouter("EDT_SinNombre1", mWD_EDT_SinNombre1);
mWD_CBOX_selectrecibo.initialiserObjet();
super.ajouter("CBOX_selectrecibo", mWD_CBOX_selectrecibo);
mWD__EXPRESSVersion.initialiserObjet();
super.ajouter("#EXPRESSVersion", mWD__EXPRESSVersion);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}

public WDProjet getProjet()
{
return GWDPtest.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPtest.getInstance();
}
public int getModeContexteHF()
{
return 1;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 0;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return false;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return true;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isGabaritSombre()
{
return false;
}
public boolean isIgnoreModeNuit()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPtest.getInstance().mWD_WIN_paginarecibo;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "250 PHOENIX#WM";
}
}
