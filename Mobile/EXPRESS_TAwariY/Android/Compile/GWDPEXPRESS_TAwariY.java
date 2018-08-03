/**
 * Code généré par WINDEV Mobile Express - NE PAS MODIFIER !
 * Objet WINDEV Mobile Express : Projet
 * Classe Android : EXPRESS_TAwariY
 * Date : 03/08/2018 02:19:00
 * Version de wdjava.dll  : 22.0.104.0
 */


package com.masociete.express_tawariy.wdgen;


import com.masociete.express_tawariy.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPEXPRESS_TAwariY extends WDProjet
{
/**
 * Accès au projet: EXPRESS_TAwariY
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPEXPRESS_TAwariY.ms_Project
 */
public static GWDPEXPRESS_TAwariY ms_Project;

 // EXPRESS_FEN_Main
public GWDFEXPRESS_FEN_Main mWD_EXPRESS_FEN_Main = new GWDFEXPRESS_FEN_Main();
 // accesseur de EXPRESS_FEN_Main
public GWDFEXPRESS_FEN_Main getEXPRESS_FEN_Main()
{
mWD_EXPRESS_FEN_Main.verifierOuverte();
return mWD_EXPRESS_FEN_Main;
}


 // Constructeur de la classe GWDPEXPRESS_TAwariY
public GWDPEXPRESS_TAwariY()
{
ajouterFenetre("EXPRESS_FEN_Main", mWD_EXPRESS_FEN_Main);

}


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
static
{
// Allocation de l'objet global
GWDPEXPRESS_TAwariY.ms_Project = new GWDPEXPRESS_TAwariY();

// Définition des langues du projet
GWDPEXPRESS_TAwariY.ms_Project.setLangueProjet(new int[] {1}, new int[] {0}, 1, false);
GWDPEXPRESS_TAwariY.ms_Project.setNomAnalyseProjet("express_tawariy");
GWDPEXPRESS_TAwariY.ms_Project.setModeGestionFichier(true);
GWDPEXPRESS_TAwariY.ms_Project.setCreationAutomatiqueFichierDonnees(true);
GWDPEXPRESS_TAwariY.ms_Project.setNomCollectionProcedure(new String[]{});
}
public String getVersionApplication(){ return "0.0.1.0";}
public String getNomSociete(){ return "";}
public String getNomAPK(){ return "EXPRESS_TAwariY";}
public int getIdNomApplication(){return com.masociete.express_tawariy.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.express_tawariy";}
public int getIdIconeApplication(){ return com.masociete.express_tawariy.R.drawable.i_c_o_n_e________2;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 480;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 640;
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
protected void declarerRessources()
{
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\EXPRESS_TAWARIY\\EMERGENCYCASELOGO (1).PNG",com.masociete.express_tawariy.R.drawable.emergencycaselogo__1__3+23, "");
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////


/**
 * Appel des méthodes d'initialisation des classes / collections de procédures / projet
 */
static void GWDPEXPRESS_TAwariY_InitProjet( String [] args)
{
GWDPEXPRESS_TAwariY.ms_Project.initialiserProjet("EXPRESS_TAwariY", "Application Android", args);
}

/**
 * Appel des méthodes de terminaison des projet / collections de procédures / classes
 */
static protected void GWDPEXPRESS_TAwariY_TermineProjet()
{

// Terminaison des collections de procédures et des classes

// Libération de l'objet global
GWDPEXPRESS_TAwariY.ms_Project = null;
}

/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public void init()
{
// Appel des méthodes d'initialisation
GWDPEXPRESS_TAwariY_InitProjet(null);
}
public void run()
{

GWDPEXPRESS_TAwariY.ms_Project.lancerProjet();
}
}
}
