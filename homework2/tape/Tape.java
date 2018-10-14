package ija.homework2.tape;

/**
 * @author Administrator
 */

public class Tape {
  TapeField [] pole_policek;
  TapeHead [] pole_hlav;
  private int vel_pole_policek;
  private int umisteni_hlava;
  
  public Tape(int f, int h, String format){
    pole_policek = new TapeField[f];
    pole_hlav = new TapeHead[h];
    umisteni_hlava = 0;
    vel_pole_policek = f;

    
    char znak;
    int j = 0;

    for(int i = 0; i < format.length(); i++){
      znak = format.charAt(i);
      
      if(znak == 'w'){
        pole_policek[j] = new TapeField(this, j, "w");
        j++;
      }
      else if(znak == 'g'){
        pole_policek[j] = new TapeField(this, j, "g");
        j++;
      }
      else if(znak == 'p'){
        pole_policek[j] = new TapeField(this, j, "p");
        j++;
      }
    }
  }
  
  public TapeField fieldAt(int i){
    if(i >= vel_pole_policek)
      return null;
    return pole_policek[i];
  }
  
  public TapeHead createHead(int i){
      TapeHead hlava;
      
      for(int j = 0; j < vel_pole_policek; j++){
          if(pole_policek[j].canSeize() == true){
            hlava = new TapeHead(i, pole_policek[j]);
            pole_hlav[umisteni_hlava] = hlava;
            pole_policek[j].seize(hlava);
            umisteni_hlava++;
            return hlava;
          }
      }

      return null;
  }
}