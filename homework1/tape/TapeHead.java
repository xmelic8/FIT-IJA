package ija.homework1.tape;

/**
 * @author Michal Melichar
 * xmelic17
 */

public class TapeHead {
  private int identifikator;
  
  public TapeHead(int id){
    identifikator = id;
  }
  
  public int id(){ 
    return identifikator; 
  }
  
  public boolean equals (Object o) {
    if(o instanceof TapeHead){
     TapeHead a = (TapeHead)o;
     return (identifikator ==  a.identifikator);
    }
    else
      return false;
  }
  
  public int hashCode(){ 
    return identifikator; 
  }
}