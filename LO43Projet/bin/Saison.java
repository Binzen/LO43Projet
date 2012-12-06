import java.util.ArrayList;
import java.util.List;


public class Saison {
  private
		String m_nom;
		int m_nbCircuits;
		Circuit m_listeCircuits[];
	
	public
	//Constructeurs :
			//constructeur par dÃ©faut
			Saison()
			{
			    m_nom = "";
			    m_nbCircuits = 0;
			    List<Circuit> m_listeCircuits = new ArrayList<Circuit>();
			  } 
			//constructeur par valeurs
			Saison(String nom, int nbCircuits, List<Circuit> listeCircuits)
			{     
			    m_nom = nom;
			    m_nbCircuits = nbCircuits;
			    List<Circuit> m_listeCircuits = listeCircuits;
			}
			//contructeur par recopie
			Saison(Saison s)
			{   
			    m_nom = s.m_nom;
			    m_nbCircuits = s.m_nbCircuits;
			    List<Circuit> m_listeCircuits = new ArrayList<Circuit>(s.m_listeCircuits.length);
			    for(liste)
			    	//utilise clone(), a def dans circuits
			}
			
			//Accesseurs
			String getm_nom()
			{  
			    return m_nom;
			 }
		

			
			//Modifieurs
			void setm_nom(String nom)
			{  
			    m_nom=nom;
			 }
		

}