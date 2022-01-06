/**
* Código generado por WINDEV Mobile Express - ¡NO MODIFICAR!
 * Objeto WINDEV Mobile Express: Fenêtre
 * Clase Android: WIN_login
 * Date: 31/12/2021 12:17:13
 * Versión de wdjava.dll: 26.0.407.3
 */


package com.mrdavis.test.wdgen;


import com.mrdavis.test.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.net.http.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFWIN_login extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de WIN_login
////////////////////////////////////////////////////////////////////////////

/**
 * txt_user
 */
class GWDtxt_user extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de WIN_login.txt_user
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,316,21);
super.setRectCompPrincipal(0,21,316,40);
super.setQuid(2428054920673507373l);

super.setChecksum("596929235");

super.setNom("txt_user");

super.setType(20001);

super.setBulle("");

super.setLibelle("usuario:");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(177, 26);

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

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(1);

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
public GWDtxt_user mWD_txt_user;

/**
 * txt_pass
 */
class GWDtxt_pass extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de WIN_login.txt_pass
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,316,21);
super.setRectCompPrincipal(0,21,316,40);
super.setQuid(2428054959328419161l);

super.setChecksum("597135455");

super.setNom("txt_pass");

super.setType(20001);

super.setBulle("");

super.setLibelle("contraseña:");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(248, 26);

super.setTailleInitiale(63, 316);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(true);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

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
public GWDtxt_pass mWD_txt_pass;

/**
 * IMG_SinNombre1
 */
class GWDIMG_SinNombre1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de WIN_login.IMG_SinNombre1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2428054993688820873l);

super.setChecksum("597801456");

super.setNom("IMG_SinNombre1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(35, 55);

super.setTailleInitiale(125, 258);

super.setValeurInitiale("D:\\My Mobile Projects\\test\\7FisRrEb_400x400.jpg");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

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
public GWDIMG_SinNombre1 mWD_IMG_SinNombre1;

/**
 * btn_login
 */
class GWDbtn_login extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de WIN_login.btn_login
////////////////////////////////////////////////////////////////////////////


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de WIN_login.btn_login
////////////////////////////////////////////////////////////////////////////
public void fWD_wIN_inico()
{
// 
//MAP:11c0eb37008fab9f:00070000:1:WIN_login.btn_login.PROCEDURE.WIN_inico:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:WIN_inico


}
//MAP:11c0eb37008fab9f:00070000:ffffffff:WIN_login.btn_login.PROCEDURE.WIN_inico:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:WIN_inico



public void fWD_wIN_Calendar_1()
{
// 
//MAP:11c0e889008d347b:00070000:1:WIN_login.btn_login.PROCEDURE.WIN_Calendar:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:WIN_Calendar


}
//MAP:11c0e889008d347b:00070000:ffffffff:WIN_login.btn_login.PROCEDURE.WIN_Calendar:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:WIN_Calendar



public void fWD_wIN_Calendar_2()
{
// 
//MAP:11c0e889008d347b:00070001:1:WIN_login.btn_login.PROCEDURE.WIN_Calendar:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:WIN_Calendar


}
//MAP:11c0e889008d347b:00070001:ffffffff:WIN_login.btn_login.PROCEDURE.WIN_Calendar:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:WIN_Calendar



public void fWD_wIN_Calendar(WDObjet... params)
{
int nSyntaxe = new WDSelecteurSyntaxe()
{
@Override
public String getNom() { return "WIN_Calendar"; }
@Override
public int getNbSyntaxe() { return 2; }
@Override
public int getNbParametreMax(int nIndiceSyntaxe)
{
switch(nIndiceSyntaxe)
{
case 0 : return 0;
case 1 : return 0;
}
return 0;
}
@Override
public int getNbParametreMin(int nIndiceSyntaxe)
{
switch(nIndiceSyntaxe)
{
case 0 : return 0;
case 1 : return 0;
}
return 0;
}
@Override
public void getParametre(int nIndiceSyntaxe, int nIndiceParametre, Parametre parametre)
{
switch(nIndiceSyntaxe)
{
case 0 : 
break;
case 1 : 
break;
}
}
}.select(params);
switch(nSyntaxe)
{
case 0 :
fWD_wIN_Calendar_1();
break;
case 1 :
fWD_wIN_Calendar_2();
break;
}
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2428055436075535582l);

super.setChecksum("602882956");

super.setNom("btn_login");

super.setType(4);

super.setBulle("");

super.setLibelle("login");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(343, 104);

super.setTailleInitiale(48, 160);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(3);

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
 * Traitement: Clic en btn_login
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// HTTPCréeFormulaire("FORM")
//MAP:21b22f8e023d0cde:00000012:1:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_maReq = WDVarNonAllouee.ref;
WDObjet vWD_maRep = WDVarNonAllouee.ref;
WDObjet vWD_valida = new WDVariant();

WDObjet vWD_sGsUsertext = new WDChaineU();

WDObjet vWD_sUser = new WDChaineU();



// HTTPCréeFormulaire("FORM")
//MAP:21b22f8e023d0cde:00000012:1:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login
WDAPIHttp.HTTPCreeFormulaire("FORM");

// HTTPAjouteParamètre("FORM", "username", txt_user)
//MAP:21b22f8e023d0cde:00000012:2:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login
WDAPIHttp.HTTPAjouteParametre("FORM","username",mWD_txt_user);

// HTTPAjouteParamètre("FORM", "password", txt_pass)
//MAP:21b22f8e023d0cde:00000012:3:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login
WDAPIHttp.HTTPAjouteParametre("FORM","password",mWD_txt_pass);

// maReq	est un restRequête
//MAP:21b22f8e023d0cde:00000012:5:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login
vWD_maReq = new WDInstance( new WDHTTPRequete() );


// maRep	est un restRéponse
//MAP:21b22f8e023d0cde:00000012:6:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login
vWD_maRep = new WDInstance( new WDHTTPReponse() );


// valida  est un Variant
//MAP:21b22f8e023d0cde:00000012:7:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login


// maReq.URL	= "http://localhost/webservice/login.php"
//MAP:21b22f8e023d0cde:00000012:8:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login
vWD_maReq.setProp(EWDPropriete.PROP_URL,"http://localhost/webservice/login.php");

// maRep		= HTTPEnvoieFormulaire("FORM", maReq)
//MAP:21b22f8e023d0cde:00000012:9:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login
vWD_maRep.setValeur(WDAPIHttp.HTTPEnvoieFormulaire("FORM",vWD_maReq));

// valida = JSONVersVariant(maRep.Contenu)
//MAP:21b22f8e023d0cde:00000012:b:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login
vWD_valida.setValeur(WDAPIVariant.jsonVersVariant(vWD_maRep.getProp(EWDPropriete.PROP_CONTENU)));

// sGsUsertext is string = valida
//MAP:21b22f8e023d0cde:00000012:d:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login

vWD_sGsUsertext.setValeur(vWD_valida);


// sUser is string = txt_user
//MAP:21b22f8e023d0cde:00000012:f:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login

vWD_sUser.setValeur(mWD_txt_user);


// sGsUsertext = sUser
//MAP:21b22f8e023d0cde:00000012:10:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login
vWD_sGsUsertext.setValeur(vWD_sUser);

// IF valida = "ok" THEN
//MAP:21b22f8e023d0cde:00000012:12:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login
if(vWD_valida.opEgal("ok", 0))
{
// 	OpenChild(WIN_inico,sGsUsertext)
//MAP:21b22f8e023d0cde:00000012:13:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login
WDAPIFenetre.ouvreFille(GWDPtest.getInstance().mWD_WIN_inico,new WDObjet[] {vWD_sGsUsertext} );

}
else
{
// 	Info(AnsiVersUnicode(maRep.Content))
//MAP:21b22f8e023d0cde:00000012:15:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login
WDAPIDialogue.info(WDAPIChaine.ansiVersUnicode(vWD_maRep.getProp(EWDPropriete.PROP_CONTENU)).getString());

}

}
//MAP:21b22f8e023d0cde:00000012:ffffffff:WIN_login.btn_login:com.mrdavis.test.wdgen.GWDFWIN_login$GWDbtn_login:Clic en btn_login




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDbtn_login mWD_btn_login;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de WIN_login.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2428051377323155752l);

super.setChecksum("594596445");

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

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ WIN_login.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;

/**
 * Traitement: Declaraciones globales de WIN_login
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MyWindow()
//MAP:21b22bdd01bda128:00000000:1:WIN_login:com.mrdavis.test.wdgen.GWDFWIN_login:Declaraciones globales de WIN_login
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;



}
//MAP:21b22bdd01bda128:00000000:ffffffff:WIN_login:com.mrdavis.test.wdgen.GWDFWIN_login:Declaraciones globales de WIN_login




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre WIN_login
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_txt_user = new GWDtxt_user();
mWD_txt_pass = new GWDtxt_pass();
mWD_IMG_SinNombre1 = new GWDIMG_SinNombre1();
mWD_btn_login = new GWDbtn_login();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre WIN_login
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2428051377323090216l);

super.setChecksum("601139550");

super.setNom("WIN_login");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(625, 360);

super.setTitre("login");

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
// Initialisation des champs de WIN_login
////////////////////////////////////////////////////////////////////////////
mWD_txt_user.initialiserObjet();
super.ajouter("txt_user", mWD_txt_user);
mWD_txt_pass.initialiserObjet();
super.ajouter("txt_pass", mWD_txt_pass);
mWD_IMG_SinNombre1.initialiserObjet();
super.ajouter("IMG_SinNombre1", mWD_IMG_SinNombre1);
mWD_btn_login.initialiserObjet();
super.ajouter("btn_login", mWD_btn_login);
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
return GWDPtest.getInstance().mWD_WIN_login;
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
