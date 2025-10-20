/**
 * <p>Informacio d'una persona</p>
 * 
 * @author Hugo
 * @version 1.0
 * @since 1.0
 * @see <a href="https://google.com">Google</a>
 */
public class InfoPersona {
    /**
     * Guardar nombre de la persona
     */
	public String nom;
	/**
	 * Guardar la edad de la persona
	 */
    public int edat;
    /**
     * 
     * @param nom Nom de la persona
     * @param edat Edat de la persona
     */
    public InfoPersona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }
    
    /**
     * Funcion para mostrar informacion de la persona
     */
    public void mostrarInformacio() {
        System.out.println("Nom: " + nom + ", edat: " + edat);
    }

    /**
     * Funcion para felicitar a la persona
     */
    public void felicitarAniversari() { 
    	 edat++; 
    	 System.out.println("Bon aniversari, " + nom + "! Ara tens " + edat + " anys."); 
    }
}
