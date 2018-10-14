package ija.homework1.objects;

import ija.homework1.tape.TapeObject;

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
}