package ija.homework2.tape;

import ija.homework2.objects.*;

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
   
   public abstract boolean canBeOpen();
   
   public static TapeObject create(String format){
    if(format.equals("w"))
        return new Wall("wall");
    else if(format.equals("g"))
        return new Gate("gate");
    else
     return null;
   }
 }
