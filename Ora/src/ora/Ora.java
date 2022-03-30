package ora;

/**
 *
 * @author ricca
 */
public class Ora {
    
    public static void main(String[] args) throws Exception {
        
        Time t = new Time(3700);
        
        
        System.out.println(t.toString() +"\n---------------");
        System.out.println(t.convertiSecondi() + "\n---------");
        
        t.addSecondi(130);
        System.out.println(t.toString() +"\n---------------");

    }
}

