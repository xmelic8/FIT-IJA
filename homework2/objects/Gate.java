package ija.homework2.objects;

import ija.homework2.tape.TapeObject;

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
  
  public boolean canBeOpen(){
    if(zavrena == true)
      return true;
    else
      return false;
  }
}
