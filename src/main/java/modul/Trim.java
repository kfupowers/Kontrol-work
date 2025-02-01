package modul;

import java.util.Random;

public class Trim extends Stage {
    public Trim(int cost, String start_date, String end_date) {
        super(cost, start_date, end_date);
    }

    @Override
    public void next() {
        Stage.completed_count += 1;
    }

    @Override
    public void prev() {
        Random random = new Random();
        String start_d = String.valueOf(random.nextInt(30)+1)+"."+String.valueOf(random.nextInt(11)+1)+"."+String.valueOf(random.nextInt(40)+2000);
        String end_d = String.valueOf(random.nextInt(30)+1)+"."+String.valueOf(random.nextInt(11)+1)+"."+String.valueOf(random.nextInt(40)+2000);
        new Roof(random.nextInt(10000000)+1000000, start_d, end_d);
    }
}
