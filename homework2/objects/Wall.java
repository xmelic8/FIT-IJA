package ija.homework2.objects;

import ija.homework2.tape.TapeObject;

/**
 * @author Michal Melichar
 * xmelic17
 */

public class Wall extends TapeObject {

  public Wall(String jmeno_objektu) {
    super(jmeno_objektu);
  }
  
  public boolean canSeize(){ 
    return false; 
  }
  
  public boolean open(){ 
    return false; 
  }
  
  public boolean canBeOpen(){
    return false;
  }
}