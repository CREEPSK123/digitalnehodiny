

public class Segment {
  private Obdlznik Obdlznik;
    public Segment(int sirka, int vyska, int x ,int y){
     this.Obdlznik = new Obdlznik();
     this.Obdlznik.zmenStrany ( sirka, vyska);
     this.Obdlznik.posunVodorovne(x);
     this.Obdlznik.posunZvisle (y);
     
    }
    
    
    
     public void zapni () {
     
     this.Obdlznik.zmenFarbu ("red");
     
    }
    
    
    public void vypni (){
        
        this.Obdlznik.zmenFarbu("black");
    }
}