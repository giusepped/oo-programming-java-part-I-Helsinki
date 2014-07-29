import java.util.ArrayList;
/**
 *
 * @author giuseppedesantis
 */
public class Points {
    private ArrayList<Integer> points;
    int accepted;
    int zeros;
    
    public Points(ArrayList<String> gradesInString){
        this.points = new ArrayList<Integer>();
        for(String g : gradesInString){
            int points = Integer.parseInt(g);
            if (points >= 0 && points <= 29){
            this.points.add(0);
            this.zeros++;
            }else if (points <= 34 && points >= 30){
            this.points.add(1);
            this.accepted++;
            }else if (points <= 39 && points >= 35){
            this.points.add(2);
            this.accepted++;
            }else if (points <= 44 && points >= 40){
            this.points.add(3);
            this.accepted++;
            }else if (points <= 49 && points >= 45){
            this.points.add(4);
            this.accepted++;
            }else if (points <= 60 && points >= 50){
            this.points.add(5);
            this.accepted++;
            }
        }
    }
    
    public void pointsStats(){
        System.out.println("Grade distribution:");
        for(int i = 5; i >= 0; i--){
            System.out.print(i+": ");
            for(int points : this.points){
                if(points == i){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
    public void acceptancePercentage(){
        double allScores = (double)(this.accepted + this.zeros);
        double accepted = (double)(this.accepted);
        double acceptancePercentage = 100*accepted/allScores;
        System.out.println("Acceptance percentage: "+ acceptancePercentage);
    }
}
