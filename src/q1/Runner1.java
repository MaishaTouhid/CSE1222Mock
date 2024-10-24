package q1;

public class Runner1 {
    public static void main(String[] args) {
        Worker  worker = new Worker("Afnan",150000);
        Supervisor supervisor = new Supervisor("Luba",200000,"Sales");
        Director director = new Director("Tiasha", 500000,"Project Managing");

        System.out.println(worker);
        System.out.println(supervisor);
        System.out.println(director);


    }
}
