/**
* Código generado por WINDEV Mobile Express - ¡NO MODIFICAR!
 * Objeto WINDEV Mobile Express: Projet
 * Clase Android: test
 * Date: 31/12/2021 12:19:24
 * Versión de wdjava.dll: 26.0.407.3
 */


package com.mrdavis.test.wdgen;


import com.mrdavis.test.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPtest extends WDProjet
{
private static GWDPtest ms_instance = null;
/**
 * Accès au projet: test
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPtest.getInstance()
 */
public static GWDPtest getInstance()
{
return (GWDPtest) ms_instance;
}

 // WIN_testselect
public GWDFWIN_testselect mWD_WIN_testselect = new GWDFWIN_testselect();
 // accesseur de WIN_testselect
public GWDFWIN_testselect getWIN_testselect()
{
mWD_WIN_testselect.checkOuverture();
return mWD_WIN_testselect;
}

 // WIN_login
public GWDFWIN_login mWD_WIN_login = new GWDFWIN_login();
 // accesseur de WIN_login
public GWDFWIN_login getWIN_login()
{
mWD_WIN_login.checkOuverture();
return mWD_WIN_login;
}

 // WIN_inico
public GWDFWIN_inico mWD_WIN_inico = new GWDFWIN_inico();
 // accesseur de WIN_inico
public GWDFWIN_inico getWIN_inico()
{
mWD_WIN_inico.checkOuverture();
return mWD_WIN_inico;
}

 // WIN_paginarecibo
public GWDFWIN_paginarecibo mWD_WIN_paginarecibo = new GWDFWIN_paginarecibo();
 // accesseur de WIN_paginarecibo
public GWDFWIN_paginarecibo getWIN_paginarecibo()
{
mWD_WIN_paginarecibo.checkOuverture();
return mWD_WIN_paginarecibo;
}


 // Constructeur de la classe GWDPtest
public GWDPtest()
{
ms_instance = this;
// Définition des langues du projet
setLangueProjet(new int[] {8}, new int[] {0}, 8, false);

// Palette des couleurs
setPaletteCouleurGabarit(new int[] {0xF48542, 0x313FD2, 0xA6F2, 0x4F900D, 0xA95CF8, 0xB86592, 0xB74A5E, 0xA5A595, 0x654E44, 0x383838, 0x0});
ajouterFenetre("WIN_testselect", mWD_WIN_testselect);
ajouterFenetre("WIN_login", mWD_WIN_login);
ajouterFenetre("WIN_inico", mWD_WIN_inico);
ajouterFenetre("WIN_paginarecibo", mWD_WIN_paginarecibo);



}


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
public String getVersionApplication(){ return "0.0.1.0";}
public String getNomSociete(){ return "";}
public String getNomAPK(){ return "test";}
public int getIdNomApplication(){return com.mrdavis.test.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.mrdavis.test";}
public int getIdIconeApplication(){ return com.mrdavis.test.R.drawable.icons8_coming_soon_100_0;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 160;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 56;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 650;
case LARGEUR_ECRAN : return 360;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return true;
}
////////////////////////////////////////////////////////////////////////////
public String getAdresseEmail() 
{
return "";
}
public boolean isIgnoreErreurCertificatHTTPS()
{
return false;
}
////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
public String getNomProjet()
{
return "test";
}
public String getNomConfiguration()
{
return "Aplicación Android";
}
public String getNomAnalyse()
{
return "";
}
public String getMotDePasseAnalyse()
{
return "";
}
public boolean isModeGestionFichierMultiUtilisateur()
{
return true;
}
public boolean isCreationAutoFichierDonnees()
{
return true;
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////
public String getFichierWDM()
{
return null;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("D:\\MY MOBILE PROJECTS\\TEST\\TEMPLATES\\WM\\250 PHOENIX\\PHOENIX_BREAK_PICT.PNG?E2_4O",com.mrdavis.test.R.drawable.phoenix_break_pict_5_selector+23, "");
super.ajouterFichierAssocie("D:\\MY MOBILE PROJECTS\\TEST\\TEMPLATES\\WM\\250 PHOENIX\\PHOENIX_COMBO.PNG?E5_3NP_32_6_42_6",com.mrdavis.test.R.drawable.phoenix_combo_4_np3_32_6_42_6_selector+23, "");
super.ajouterFichierAssocie("D:\\MY MOBILE PROJECTS\\TEST\\TEMPLATES\\WM\\250 PHOENIX\\PHOENIX_EDT.PNG?E5_3NP_8_8_8_8",com.mrdavis.test.R.drawable.phoenix_edt_3_np3_8_8_8_8_selector+23, "");
super.ajouterFichierAssocie("D:\\MY MOBILE PROJECTS\\TEST\\TEMPLATES\\WM\\250 PHOENIX\\PHOENIX_BTN_MENU.PNG?E5_3NP_10_10_10_10",com.mrdavis.test.R.drawable.phoenix_btn_menu_2_np3_10_10_10_10_selector+23, "");
super.ajouterFichierAssocie("D:\\MY MOBILE PROJECTS\\TEST\\7FISRREB_400X400.JPG",com.mrdavis.test.R.drawable.afisrreb_400x400_1+23, "");
}



/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public Class<? extends WDProjet> getClasseProjet()
{
return GWDPtest.class;
}
}
}
