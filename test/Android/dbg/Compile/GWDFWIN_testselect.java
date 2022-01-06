/**
* Código generado por WINDEV Mobile Express - ¡NO MODIFICAR!
 * Objeto WINDEV Mobile Express: Fenêtre
 * Clase Android: WIN_testselect
 * Date: 31/12/2021 12:17:13
 * Versión de wdjava.dll: 26.0.407.3
 */


package com.mrdavis.test.wdgen;


import com.mrdavis.test.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.net.http.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.ui.champs.zr.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFWIN_testselect extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de WIN_testselect
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_SinNombre1
 */
class GWDBTN_SinNombre1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de WIN_testselect.BTN_SinNombre1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2432171750164837639l);

super.setChecksum("856787833");

super.setNom("BTN_SinNombre1");

super.setType(4);

super.setBulle("");

super.setLibelle("consulta");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(30, 8);

super.setTailleInitiale(48, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

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

/**
 * Traitement: Clic en BTN_SinNombre1
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 
//MAP:21c0cf521150b507:00000012:1:WIN_testselect.BTN_SinNombre1:com.mrdavis.test.wdgen.GWDFWIN_testselect$GWDBTN_SinNombre1:Clic en BTN_SinNombre1



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_maReq = WDVarNonAllouee.ref;
WDObjet vWD_maRep = WDVarNonAllouee.ref;
WDObjet vWD_vRestVariant = new WDVariant();



// maReq			est un restRequête
//MAP:21c0cf521150b507:00000012:2:WIN_testselect.BTN_SinNombre1:com.mrdavis.test.wdgen.GWDFWIN_testselect$GWDBTN_SinNombre1:Clic en BTN_SinNombre1
vWD_maReq = new WDInstance( new WDHTTPRequete() );


// maRep			est un restRéponse
//MAP:21c0cf521150b507:00000012:3:WIN_testselect.BTN_SinNombre1:com.mrdavis.test.wdgen.GWDFWIN_testselect$GWDBTN_SinNombre1:Clic en BTN_SinNombre1
vWD_maRep = new WDInstance( new WDHTTPReponse() );


// vRestVariant	est un Variant
//MAP:21c0cf521150b507:00000012:4:WIN_testselect.BTN_SinNombre1:com.mrdavis.test.wdgen.GWDFWIN_testselect$GWDBTN_SinNombre1:Clic en BTN_SinNombre1


// maReq.URL="http://localhost/webservice/params.php"
//MAP:21c0cf521150b507:00000012:5:WIN_testselect.BTN_SinNombre1:com.mrdavis.test.wdgen.GWDFWIN_testselect$GWDBTN_SinNombre1:Clic en BTN_SinNombre1
vWD_maReq.setProp(EWDPropriete.PROP_URL,"http://localhost/webservice/params.php");

// maRep=RESTEnvoie(maReq)
//MAP:21c0cf521150b507:00000012:6:WIN_testselect.BTN_SinNombre1:com.mrdavis.test.wdgen.GWDFWIN_testselect$GWDBTN_SinNombre1:Clic en BTN_SinNombre1
vWD_maRep.setValeur(WDAPIHttp.HTTPEnvoie(vWD_maReq));

// SI ErreurDétectée ALORS
//MAP:21c0cf521150b507:00000012:8:WIN_testselect.BTN_SinNombre1:com.mrdavis.test.wdgen.GWDFWIN_testselect$GWDBTN_SinNombre1:Clic en BTN_SinNombre1
if(WDObjet.ErreurDetectee.getBoolean())
{
// 	Erreur(ErreurInfo(errComplet))
//MAP:21c0cf521150b507:00000012:9:WIN_testselect.BTN_SinNombre1:com.mrdavis.test.wdgen.GWDFWIN_testselect$GWDBTN_SinNombre1:Clic en BTN_SinNombre1
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

}
else
{
// 	vRestVariant=JSONVersVariant(maRep.contenu)
//MAP:21c0cf521150b507:00000012:b:WIN_testselect.BTN_SinNombre1:com.mrdavis.test.wdgen.GWDFWIN_testselect$GWDBTN_SinNombre1:Clic en BTN_SinNombre1
vWD_vRestVariant.setValeur(WDAPIVariant.jsonVersVariant(vWD_maRep.getProp(EWDPropriete.PROP_CONTENU)));

// 	LooperDeleteAll(LOOP1)
//MAP:21c0cf521150b507:00000012:c:WIN_testselect.BTN_SinNombre1:com.mrdavis.test.wdgen.GWDFWIN_testselect$GWDBTN_SinNombre1:Clic en BTN_SinNombre1
WDAPIZoneRepetee.zoneRepeteeSupprimeTout(mWD_LOOP1);

// 	for TOUT ss de vRestVariant
//MAP:21c0cf521150b507:00000012:d:WIN_testselect.BTN_SinNombre1:com.mrdavis.test.wdgen.GWDFWIN_testselect$GWDBTN_SinNombre1:Clic en BTN_SinNombre1
IWDParcours parcours1 = null;
try
{
WDObjet parcourable2 = vWD_vRestVariant;
WDObjet vWD_ss = WDParcoursFactory.creerVariableParcours(parcourable2);
parcours1 = WDParcoursFactory.pourTout(parcourable2, vWD_ss, null, null, null, 0x0, 0x2);
while(parcours1.testParcours())
{
// 		LooperAddLine(LOOP1,ss.username,ss.password)
//MAP:21c0cf521150b507:00000012:e:WIN_testselect.BTN_SinNombre1:com.mrdavis.test.wdgen.GWDFWIN_testselect$GWDBTN_SinNombre1:Clic en BTN_SinNombre1
WDAPIZoneRepetee.zoneRepeteeAjouteLigne(mWD_LOOP1,new WDObjet[] {parcours1.getVariableParcours().get("username"),parcours1.getVariableParcours().get("password")} );

}

}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
}
}


}

}
//MAP:21c0cf521150b507:00000012:ffffffff:WIN_testselect.BTN_SinNombre1:com.mrdavis.test.wdgen.GWDFWIN_testselect$GWDBTN_SinNombre1:Clic en BTN_SinNombre1




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_SinNombre1 mWD_BTN_SinNombre1;

/**
 * LOOP1
 */
class GWDLOOP1 extends WDZoneRepetee
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de WIN_testselect.LOOP1
////////////////////////////////////////////////////////////////////////////

/**
 * ATT_Atributo1
 */
class GWDATT_Atributo1 extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de WIN_testselect.LOOP1.ATT_Atributo1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Atributo1");

super.setChampAssocie(mWD_STC_usuario);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ WIN_testselect.LOOP1.ATT_Atributo1

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Atributo1 mWD_ATT_Atributo1 = new GWDATT_Atributo1();

/**
 * ATT_Atributo2
 */
class GWDATT_Atributo2 extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de WIN_testselect.LOOP1.ATT_Atributo2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Atributo2");

super.setChampAssocie(mWD_STC_password);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ WIN_testselect.LOOP1.ATT_Atributo2

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Atributo2 mWD_ATT_Atributo2 = new GWDATT_Atributo2();

/**
 * STC_usuario
 */
class GWDSTC_usuario extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de WIN_testselect.LOOP1.STC_usuario
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2432171750165099783l);

super.setChecksum("857049521");

super.setNom("STC_usuario");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Estático");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(18, 12);

super.setTailleInitiale(19, 120);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

super.setParamAnimationChamp(42, 1, 200);

super.setMiseABlancSiZero(true);

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
public GWDSTC_usuario mWD_STC_usuario = new GWDSTC_usuario();

/**
 * STC_password
 */
class GWDSTC_password extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de WIN_testselect.LOOP1.STC_password
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2432171750165165319l);

super.setChecksum("857115057");

super.setNom("STC_password");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Estático");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(44, 12);

super.setTailleInitiale(19, 120);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

super.setParamAnimationChamp(42, 1, 200);

super.setMiseABlancSiZero(true);

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
public GWDSTC_password mWD_STC_password = new GWDSTC_password();
/**
 * Initialise tous les champs de WIN_testselect.LOOP1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de WIN_testselect.LOOP1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ATT_Atributo1.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Atributo1);
mWD_ATT_Atributo2.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Atributo2);
mWD_STC_usuario.initialiserObjet();
super.ajouterChamp("STC_usuario",mWD_STC_usuario);
mWD_STC_password.initialiserObjet();
super.ajouterChamp("STC_password",mWD_STC_password);
creerAttributAuto();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,352,64);
super.setQuid(2432171750164903175l);

super.setChecksum("856865225");

super.setNom("LOOP1");

super.setType(30);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(113, 0);

super.setTailleInitiale(322, 352);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setNumTab(2);

super.setModeAscenseur(1, 1);

super.setModeSelection(99);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setEnregistrementSortieLigne(true);

super.setPersistant(false);

super.setParamAffichage(0, 0, 1, 352, 64);

super.setBtnEnrouleDeroule(true);

super.setScrollRapide(false, null);

super.setDeplacementParDnd(0);

super.setSwipe(0, "", false, false, "", false, false);

super.setRecyclageChamp(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -11.000000, 1), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setStyleSeparateurVerticaux(false, 0xFFFFFFFF);

super.setStyleSeparateurHorizontaux(0, 0xFFFFFFFF);

super.setDessinerLigneVide(false);

super.setCouleurCellule(0xFFFFFFFF, 0xFFFFFFFF, 0x0, 0xBABABA, 0xFFFFFFFF);

super.setImagePlusMoins("D:\\My Mobile Projects\\test\\Templates\\WM\\250 Phoenix\\Phoenix_Break_Pict@dpi1x.png?E2_4O");

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
public GWDLOOP1 mWD_LOOP1;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de WIN_testselect.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2432171750165230855l);

super.setChecksum("857180593");

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

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ WIN_testselect.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de WIN_testselect.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFFFFFF, 0x616161, true);

super.setImageFond("");

super.setStyleBarreNavigation(0xFF000001, 0x808080);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

/**
 * Traitement: Declaraciones globales de WIN_testselect
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MyWindow()
//MAP:21c0cf52114fb507:00000000:1:WIN_testselect:com.mrdavis.test.wdgen.GWDFWIN_testselect:Declaraciones globales de WIN_testselect
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;



}
//MAP:21c0cf52114fb507:00000000:ffffffff:WIN_testselect:com.mrdavis.test.wdgen.GWDFWIN_testselect:Declaraciones globales de WIN_testselect




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre WIN_testselect
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_BTN_SinNombre1 = new GWDBTN_SinNombre1();
mWD_LOOP1 = new GWDLOOP1();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre WIN_testselect
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2432171750164772103l);

super.setChecksum("862770482");

super.setNom("WIN_testselect");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(569, 360);

super.setTitre("inicio");

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
// Initialisation des champs de WIN_testselect
////////////////////////////////////////////////////////////////////////////
mWD_BTN_SinNombre1.initialiserObjet();
super.ajouter("BTN_SinNombre1", mWD_BTN_SinNombre1);
mWD_LOOP1.initialiserObjet();
super.ajouter("LOOP1", mWD_LOOP1);
mWD__EXPRESSVersion.initialiserObjet();
super.ajouter("#EXPRESSVersion", mWD__EXPRESSVersion);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);

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
return 1;
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
return true;
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
return GWDPtest.getInstance().mWD_WIN_testselect;
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
