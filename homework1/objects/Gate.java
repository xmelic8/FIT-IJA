package ija.homework1.objects;

import ija.homework1.tape.TapeObject;

/**
 * @author Michal Melichar
 * xmelic17
 */

public class Gate extends TapeObject {
  public Gate(String jmeno_objektu){
    super(jmeno_objektu);
    zavrena = true;
  }
  
  public boolean canSeize(){ 
    return (zavrena == false); 
  }
  
  public boolean open(){
    if(zavrena == true){
      zavrena = false;
      return true;
    }
    else
      return false;
  }
}
