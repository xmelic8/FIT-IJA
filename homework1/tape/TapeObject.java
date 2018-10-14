package ija.homework1.tape;

import ija.homework1.objects.*;

/**
 * @author Michal Melichar
 * xmelic17
 */

public abstract class TapeObject {
  String nazev_objektu;
  protected boolean zavrena;
  
  public TapeObject(String name){
    nazev_objektu = name;
  }
  
  public abstract boolean canSeize();
  public abstract boolean open();
  
  
   public boolean equals (Object o){
    if(o instanceof Wall){     
      TapeObject a = (TapeObject)o;     
     return (nazev_objektu ==  a.nazev_objektu);
    }
    else
    if(o instanceof Gate){     
      TapeObject a = (TapeObject)o;     
     return ((nazev_objektu ==  a.nazev_objektu) && (zavrena == a.zavrena));
    }
    else
      return false;
  }
  
   public int hashCode(){ 
     return nazev_objektu.hashCode(); 
   }
}  
