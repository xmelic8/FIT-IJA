package ija.homework2.tape;

/**
 * @author Michal Melichar
 * xmelic17
 */

public class TapeHead {
  private int identifikator;
  TapeField info_policko;
  int pocet_klicu;
  
  public TapeHead(int id, TapeField f){
      identifikator = id;
      info_policko = f;
      pocet_klicu = 0;
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
  
  public TapeField seizedField(){
      return info_policko;
  }
  
  public void addKeys(int n){
      pocet_klicu = n;
  }
}