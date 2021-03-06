
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bacag
 */
public class StateCapitals {
    public static void main(String[] args) {
        //instantiate an empty map
        Map<String, String> capitals = new HashMap<>();
        
        capitals.put("Alabama", "Montgommery");
        capitals.put("Alaska", "Juneau");
        capitals.put("Arizona", "Pheonix");
        capitals.put("Arkansas", "Little Rock");
        capitals.put("California", "Sacramento");
        
        //purposely assigned wrong capitals to these two entries
        capitals.put("Colorado", "Hartford");
        capitals.put("Connecticut", "Denver");
        
        //System.out.println(capitals.size());
        
        //called Colorado by its key, 
        //put in new capital for that state
        //calleed colorado again with the new capital
        String getColorado = capitals.get("Colorado");
        //System.out.println(getColorado);
        capitals.put("Colorado","Denver");
        getColorado = capitals.get("Colorado");
        //System.out.println(getColorado);
        
        //same process for connecticut
        String getConnect = capitals.get("Connecticut");
        //System.out.println(getConnect);
        capitals.put("Connecticut", "Hartford");
        getConnect = capitals.get("Connecticut");
        //System.out.println(getConnect);
        
        //in orderr to get the items in our map we call it out by their key
        Set<String> keys = capitals.keySet();
        //Enhanced for loop
        //left side declare variable of the type that is in the set
        // : right side we put the collection we want to pull out of this set
        for ( String currentKey : keys) {
            String currentCapital = capitals.get(currentKey);
            System.out.println("The capital of "+currentKey+" is "+currentCapital+".");
        }
        
        
        //use a collection to get out all the non-key values
        //start by creating an empty collectionc
        Collection<String> capitalValues = capitals.values();
        for (String currentCapitalValues : capitalValues ) {
            System.out.println(currentCapitalValues);
        }
    }
}
