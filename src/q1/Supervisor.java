package q1;

public class Supervisor extends Worker{
    public String division;
    public Supervisor(String name, double wages,String division) {
        super(name, wages);
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return super.toString() + ", Division: " + division;
    }
}
