package ija.homework2.tape;

public class TapeField {  
  private int id_policka;
  TapeObject policko;
  TapeHead hlava;
  Tape objekt;
  private boolean obsazeno_policko;
  private boolean obsazeno_hlava;
  
  public TapeField(Tape tape, int p, String type){
    id_policka = p;
    objekt = tape;
    obsazeno_policko = false;
    obsazeno_hlava = false;
    if(type.equals("w")){
      policko = TapeObject.create("w");
      obsazeno_policko = true;
    }
    else if(type.equals("g")){
      policko = TapeObject.create("g");
      obsazeno_policko = true;
    }
    else if(type.equals("p"))
      policko = TapeObject.create("p");
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
      
    if(policko.canSeize())
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
  
  public TapeField rightField(){
    return objekt.fieldAt(id_policka + 1);
  }
  
  public boolean canBeOpen(){
      return policko.canBeOpen();
  }
}