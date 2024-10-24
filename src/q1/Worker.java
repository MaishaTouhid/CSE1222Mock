package q1;

public class Worker {
    public String name;
    public double wages;

    public Worker(String name, double wages) {
        this.name = name;
        this.wages = wages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }
    public  String toString(){
        return "Name : " + name +" , Wages : " + wages ;
    }

}
