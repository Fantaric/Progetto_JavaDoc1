package ora;
/**
 * La classe rappresenta e gestisce dati di tipo temporale
 * @author Riccardo Fantacci
 */

public class Time {
    
    /**
     * numero di minuti dell'oggetto Time
     */
    protected int minuti;
    /** 
     * numero di secondi dell'oggetto Time
     */
    protected int secondi;
    /**
     * numero di ore dell'oggetto Time
     */
    protected int ore;

    
    /**
     * Costruisce un oggetto Time dato in ingresso ore, minuti e secondi. <br>
      <u> Se i parametri di ingresso non sono validi (es. minuti 78) allora l'oggetto Time verrÃ  inizializzato con tutti ore, minuti e secondi impostati a 0.</u>
     * @param ore ore da assegnare al nuovo oggetto
     * @param minuti minuti da assegnare al nuovo oggetto
     * @param secondi secondi da assegnare al nuovo oggetto
     */
    public Time(int ore, int minuti, int secondi)
    {
        if (secondi >= 60 || secondi < 0 || ore > 24 || ore < 0 || minuti >=24)
        {
            this.minuti = 0;
            this.ore = 0;
            this.minuti = 0;
        }
        else
        {
            this.secondi = secondi;
            this.ore = ore;
            this.minuti = minuti;
        }
    }

    /**
     * Costruisce un oggetto Time dato in ingresso ore, minuti e secondi. <br>
      <u> Vengono distribuite in automatico i secondi tra le ore, minuti e secondi.</u> Esempio: se in input viene passato 100 allora ora 0, minuti 1 e secondi 40
     * @param secondi secondi da assegnare al nuovo oggetto
     */
    public Time(int secondi)
    {
       if((secondi / 3600) >=1)
            {
                this.ore = secondi / 3600;
                secondi -= 3600 * (secondi/3600);
            }
            if ((secondi / 60) >= 1)
            {
                this.minuti = secondi / 60;
                secondi -= 60 * (secondi/60);
            }
                this.secondi = secondi;
    }
    

    /**
     * Vengono addizionati il numero di secondi specificati. Il tempo viene normalizzato in automatico.
     * @param secondi numero di secondi da aggiungere
     */
    
    public void addSecondi(int secondi)
    {
        if((secondi / 3600) >=1)
            {
                this.ore += secondi / 3600;
                secondi -= 3600 * (secondi/3600);
            }
            if ((secondi / 60) >= 1)
            {
                this.minuti += secondi / 60;
                secondi -= 60 * (secondi/60);
            }
                this.secondi += secondi;
    }
    
    /**
     * Esprime le ore, i minuti e i secondi dell'oggetto Time in secondi. Esempio. 1 ora, 20 min, 10 secondi - 4810s
     * @return il numero totale dei secondi
     */
    public int convertiSecondi()
    {
        return getOre() * 3600 + getMinuti()* 60 + getSecondi();
    }

    /**
     * Restituisce il numero di minuti
     * @return il numero di minuti dell'oggetto Time
     */
    public int getMinuti() {
        return this.minuti;
    }

    /**
     * 
     * @param minuti setta minuti
     * @deprecated 
     */
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    /**
     * Restituisce il numero delle ore
     * @return il numero di ore dell'oggetto Time
     */
    public int getOre() {
        return this.ore;
    }

    /**
     *
     * @param ore setta ore
     * @deprecated 
     */
    public void setOre(int ore) {
        this.ore = ore;
    }

    /**
     * Restituisce il numero di secondi
     * @return il numero di secondi dell'oggetto Time
     */
    public int getSecondi() {
        return this.secondi;
    }

    /**
     *
     * @param secondi setta secondi
     * @deprecated 
     */
    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }
    
    /**
     * Restituisce una stringa che rappresenta l'oggetto
     * @return Rappresentazione testuale dell'oggetto Time {ore:minuti:secondi}
     */
    @Override
    public String toString()
    {
        return ("Ore: " +ore + "h\nMinuti: " +minuti + "m\nSecondi: " +secondi + "s");
                
    }
}
