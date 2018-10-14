package ija.homework1.tape;

/**
 * @author Michal Melichar
 * xmelic17
 */

public class TapeField {  
  private int id_policka;
  TapeObject policko;
  TapeHead hlava;
  private boolean obsazeno_policko;
  private boolean obsazeno_hlava;
  
  
  public TapeField(int p){
    id_policka = p;
    obsazeno_policko = false;
    obsazeno_hlava = false;
  }

  public TapeField(int p, TapeObject obj){
    id_policka = p;
    policko = obj;
    obsazeno_policko = true;
    obsazeno_hlava = false;
  }
  
  public int position(){ 
    return id_policka; 
  }
  
  public boolean seize(TapeHead head){
    if((obsazeno_hlava == false) &&(canSeize())){
      hlava = head;
      obsazeno_hlava = true;
      return true;
    }
    else
      return false;
  }

  public TapeHead leave(){
    if(obsazeno_hlava == true){
      obsazeno_hlava = false;
      return hlava;
    }  
    else
      return null;
  }

  public boolean canSeize(){
    if((obsazeno_hlava == false) && (obsazeno_policko == false))
      return true;
    else if (obsazeno_hlava == true)
      return false;
      
    if((policko.canSeize()) == true)
      return true;
    else
      return false;
  }

  public boolean open(){
    if(obsazeno_policko == true){
      boolean operace = policko.open();
      return operace == true;
    }
    else
      return false;
  }
  
  public boolean equals (Object o){
    if(o instanceof TapeField){
     TapeField a = (TapeField)o;
     return ((id_policka ==  a.id_policka) && 
             (obsazeno_policko == a.obsazeno_policko));
    }
    else
      return false;
  }
  
  public int hashCode(){
    return id_policka; 
  }
}
