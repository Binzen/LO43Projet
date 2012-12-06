public class Circuit {
  private
		String m_nom; 
		float m_vMax;
		float m_longueur;
		float m_posStand;
		int m_nbTours;
	
	public
		//Constructeurs :
		//constructeur par dÃ©faut
		Circuit()
		{
		    m_nom = "";
		    m_vMax = 0;
		    m_longueur = 0;
		    m_posStand = 0;
		    m_nbTours = 0;
		  } 
		//constructeur par valeurs
		Circuit(String nom, float vMax, float longueur, float posStand, int nbTours)
		{
			m_nom = nom;
		    m_vMax = vMax;
		    m_longueur = longueur;
		    m_posStand = posStand;
		    m_nbTours = nbTours;
		}
		//contructeur par recopie
		Circuit(Circuit v)
		{
			m_nom = v.m_nom;
		    m_vMax = v.m_vMax;
		    m_longueur = v.m_longueur;
		    m_posStand = v.m_posStand;
		    m_nbTours = v.m_nbTours;
		}
		
		//Accesseurs
		String getm_nom()
		{  
		    return m_nom;
		 }
	
		float getm_vMax()
		{  
		    return m_vMax;
		 }
	
		float getm_longueur()
		{  
		    return m_longueur;
		 }
	
		float getm_posStand()
		{  
		    return m_posStand;
		 }
	
		int getm_nbTours()
		{  
		    return m_nbTours;
		 }
	
		
		//Modifieurs
		void setm_nom(String nom)
		{  
		    m_nom=nom;
		 }
	
		void setm_vMax(float vMax)
		{  
		    m_vMax=vMax;
		 }
	
		void setm_longueur(float longueur)
		{  
		    m_longueur=longueur;
		 }
	
		void setm_posStand(float posStand)
		{  
		    m_posStand=posStand;
		 }
	
		void setm_nbTours(int nbTours)
		{  
		    m_nbTours=nbTours;
		 }
		
		//fct clone
}