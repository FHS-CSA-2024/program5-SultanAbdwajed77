//import stuff here?
public class Program5 {
    public static void main(String[] args) {
        String vehicle1 = "Royale";
        int miles1 = 286;
        int gallons1 = 9;
        double RoyaleAvg = 0.0;
        
        String vehicle2 = "KoopaKing";
        int miles2 = 412;
        int gallons2 = 40;
        double KoopaKingAvg = 0.0;
        
        String vehicle3 = "PipeFrame";
        int miles3 = 361;
        int gallons3 = 18;
        double PipeFrameAvg = 0.0;
        
        String vehicle4 = "Badwagon";
        int miles4 = 161;
        int gallons4 = 11;
        double BandwagonAvg = 0.0;

        
        double RoyaleAvg = (double) miles1 / gallons1;
        double KoopaKingAvg = (double) miles2 / gallons2;
        double PipeFrameAvg = (double) miles3 / gallons3;
        double BandwagonAvg = (double) miles4 / gallons4;


        RoyaleAvg = ((int)((RoyaleAvg*10)+0.5))/10.0;
        KoopaKingAvg = ((int)((KoopaKingAvg*10)+0.5))/10.0;
        PipeFrameAvg = ((int)((PipeFrameAvg*10)+0.5))/10.0;
        BandwagonAvg = ((int)((BandwagonAvg*10)+0.5))/10.0;


        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println(vehicle1 + " averaged " + RoyaleAvg + " m/g");
        System.out.println(vehicle2 + " averaged " + KoopaKingAvg + " m/g");
        System.out.println(vehicle3 + " averaged " + PipeFrameAvg + " m/g");
        System.out.println(vehicle4 + " averaged " + BandwagonAvg + " m/g");
    }
}
//Your code here

//Paste console output below:
/*


*/

