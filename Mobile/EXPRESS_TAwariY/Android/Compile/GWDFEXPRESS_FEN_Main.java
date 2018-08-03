/**
 * Code généré par WINDEV Mobile Express - NE PAS MODIFIER !
 * Objet WINDEV Mobile Express : Fenêtre
 * Classe Android : EXPRESS_FEN_Main
 * Date : 03/08/2018 02:19:00
 * Version de wdjava.dll  : 22.0.104.0
 */


package com.masociete.express_tawariy.wdgen;


import com.masociete.express_tawariy.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFEXPRESS_FEN_Main extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de EXPRESS_FEN_Main
////////////////////////////////////////////////////////////////////////////

/**
 * IMG_SansNom1
 */
class GWDIMG_SansNom1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de EXPRESS_FEN_Main.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3126502283687624350l);

super.setChecksum("1141480993");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(39, 56);

super.setTailleInitiale(155, 229);

super.setValeurInitiale("C:\\Mes Projets Mobile\\EXPRESS_TAwariY\\EmergencyCaseLogo (1).png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setTransparence(1);

super.setParamImage(2097155, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("Segoe UI Semilight", -8.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x212121, 0x0, 0xFFFFFFFF, 4, 4, 0, 1), 0, 0, 0, 0);


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
public GWDIMG_SansNom1 mWD_IMG_SansNom1;

/**
 * #EXPRESSVersion
 */
class GWD_EXPRESSVersion extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de EXPRESS_FEN_Main.#EXPRESSVersion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3126501961560808268l);

super.setChecksum("1137209756");

super.setNom("#EXPRESSVersion");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Version Express");

super.setNote("", "");

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(96, 96);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ EXPRESS_FEN_Main.#EXPRESSVersion

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWD_EXPRESSVersion mWD__EXPRESSVersion;

/**
 * Traitement: Déclarations globales de EXPRESS_FEN_Main
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
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
// Création des champs de la fenêtre EXPRESS_FEN_Main
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_IMG_SansNom1 = new GWDIMG_SansNom1();
mWD__EXPRESSVersion = new GWD_EXPRESSVersion();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre EXPRESS_FEN_Main
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3126501961560742732l);

super.setChecksum("1143652861");

super.setNom("EXPRESS_FEN_Main");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(615, 360);

super.setTitre("Main");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de EXPRESS_FEN_Main
////////////////////////////////////////////////////////////////////////////
mWD_IMG_SansNom1.initialiserObjet();
super.ajouter("IMG_SansNom1", mWD_IMG_SansNom1);
mWD__EXPRESSVersion.initialiserObjet();
super.ajouter("#EXPRESSVersion", mWD__EXPRESSVersion);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
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
public boolean isThemeDark()
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
return GWDPEXPRESS_TAwariY.ms_Project.mWD_EXPRESS_FEN_Main;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "210 MATERIAL DESIGN RED#WM";
}
}
