package modul;

public abstract class Stage implements IStage{
    protected int cost;
    protected String start_date;
    protected String end_date;
    protected Status status;
    public static int completed_count = 0;

    public Stage(int cost, String start_date, String end_date){
        this.cost = cost;
        this.start_date = start_date;
        this.end_date = end_date;
        start();
    }

    @Override
    public void start(){
        status = Status.PLANNED;
        while (status != Status.COMPLETED && status != Status.FAULT) {
            if (Math.random() < 0.1) {
                if (status == Status.PLANNED) {
                    status = Status.FAULT;
                } else if (status == Status.INPROCESS) {
                    status = Status.PLANNED;
                }
            } else {
                if (status == Status.PLANNED) {
                    status = Status.INPROCESS;
                } else if (status == Status.INPROCESS) {
                    status = Status.COMPLETED;
                }
            }
        }
        stop();
    };

    @Override
    public void stop(){
        if(status == Status.COMPLETED) {
            next();
        }
        else if(status == Status.FAULT) {
            prev();
        }
    }

    @Override
    abstract public void next();

    @Override
    abstract public void prev();
}
