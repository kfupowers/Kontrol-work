import modul.Project;
import modul.Stage;



import java.util.Random;

public class Main {
    public static void main(String[] args){
        for(int i=0; i<1000; i=i+1){
            Random random = new Random();
            String start_d = String.valueOf(random.nextInt(30)+1)+"."+String.valueOf(random.nextInt(11)+1)+"."+String.valueOf(random.nextInt(40)+2000);
            String end_d = String.valueOf(random.nextInt(30)+1)+"."+String.valueOf(random.nextInt(11)+1)+"."+String.valueOf(random.nextInt(40)+2000);
            new Project(random.nextInt(10000000)+1000000, start_d, end_d);
        }
        System.out.println(Stage.completed_count*0.001);
    }

}
