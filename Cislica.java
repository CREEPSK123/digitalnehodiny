
public class Cislica {
    private Segment segmentA;
    private Segment segmentB;
    private Segment segmentC;
    private Segment segmentD;
    private Segment segmentE;
    private Segment segmentF;
    private Segment segmentG;

   
    public Cislica(int x,int y) {
        this.segmentA = new Segment(40, 10 ,10 + x , 0 + y);
        this.segmentB = new Segment(10, 40 ,50 + x , 10 + y);
        this.segmentC = new Segment(10, 40 ,50 + x , 60 + y);
        this.segmentD = new Segment(40, 10 ,10 + x , 100 + y);
        this.segmentE = new Segment(10, 40 ,0 + x , 60 + y);
        this.segmentF = new Segment(10, 40 ,0 + x , 10 + y);
        this.segmentG = new Segment(40, 10 ,10 + x , 50 + y);

    
    }

    
    public void zobraz (int n ) {
        this.skry();
        switch (n){
            case 1:
            this.segmentB.zapni();
            this.segmentC.zapni();

            break;

            case 2:
            this.segmentA.zapni();
            this.segmentB.zapni();
            this.segmentG.zapni();
            this.segmentE.zapni();
            this.segmentB.zapni();
            break;
            case 3:
            this.segmentA.zapni();
            this.segmentB.zapni();
            this.segmentG.zapni();
            this.segmentC.zapni();
            this.segmentD.zapni();
            break;
            case 4:
            this.segmentA.zapni();
            this.segmentF.zapni();
            this.segmentG.zapni();
            this.segmentC.zapni();

            break;
            case 5:
            this.segmentA.zapni();
            this.segmentB.zapni();
            this.segmentG.zapni();
            this.segmentE.zapni();
            this.segmentB.zapni();
            break;
            case 6:
            this.segmentA.zapni();
            this.segmentB.zapni();
            this.segmentG.zapni();
            this.segmentE.zapni();
            this.segmentB.zapni();
            break;
            case 7:
            this.segmentA.zapni();
            this.segmentB.zapni();
            this.segmentG.zapni();
            this.segmentE.zapni();
            this.segmentB.zapni();
            
            
            case 8:
            break;
            
            this.segmentA.zapni();
            this.segmentB.zapni();
            this.segmentG.zapni();
            this.segmentE.zapni();
            this.segmentB.zapni();
            this.segmentB.zapni();
            this.segmentB.zapni();
            this.segmentB.zapni();
        
        }

        
        



    }
    public void skry(){
        
        
    }
        
}
