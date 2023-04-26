public class Hufflepuff extends Hogwarts {
    private int hardWorking;
    private int loyal;
    private int honest;

    public Hufflepuff(String fullName, int magicForce, int transgressionDistance,int hardworking, int loyal, int honest) {
        super(fullName,magicForce,transgressionDistance);
        this.hardWorking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public int getHardWorking() {
        return hardWorking;
    }

    public void setHardworking(int hardWorking) {
        this.hardWorking = hardWorking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    private int totalPoint() {
        return this.hardWorking + this.loyal + this.honest;
    }

    public boolean compare(Hufflepuff hufflepuff) {
        return this.totalPoint() > hufflepuff.totalPoint();
    }

    public void printCompare(Hufflepuff hufflepuff) {
        if (this.compare(hufflepuff) == true) {
            System.out.println(this.getFullName() + " лучший Пуффендуец, чем " + hufflepuff.getFullName());
        } else {
            System.out.println(hufflepuff.getFullName() + " лучший Пуффендуец, чем " + this.getFullName());
        }
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                super.toString() +
                "hardWorking=" + hardWorking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
}
