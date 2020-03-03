/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creature_by_duy;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class CreatureList {
    private ArrayList<Creature> creatures;
    
    public CreatureList(){
        creatures = new ArrayList<>();
    }
    
    public boolean add(Creature cr){
        return creatures.add(cr);
        
    }
    
    public boolean remove(String ten){
        for (Creature cr : creatures) {
            if(cr.getTen().equalsIgnoreCase(ten))
                return creatures.remove(cr);
        }
        return false;
    }
    
    public Creature search(String ten){
        for (Creature cr : creatures) {
            if(cr.getTen().equalsIgnoreCase(ten))
                return cr;
        }
        return null;
    }
    
    public ArrayList<Creature> getAll(){
        return creatures;
    }
}
