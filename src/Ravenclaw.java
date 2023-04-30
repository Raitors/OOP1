public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wit;
    private int creativity;

    public Ravenclaw(String fullName, int magicForce, int transgressionDistance, int smart, int wit, int creativity) {
        super(fullName, magicForce, transgressionDistance);
        this.smart = smart;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creativity;
    }

    public void setCreation(int creativity) {
        this.creativity = creativity;
    }

    private int totalPoint() {
        return this.creativity + this.smart + this.wit;
    }

    public boolean compare(Ravenclaw ravenclaw) {
        return this.totalPoint() > ravenclaw.totalPoint();
    }

    public void printCompare(Ravenclaw ravenclaw) {
        if (this.compare(ravenclaw) == true) {
            System.out.println(this.getFullName() + " лучший Когтевранец, чем " + ravenclaw.getFullName());
        } else {
            System.out.println(ravenclaw.getFullName() + " лучший Когтевранец, чем " + this.getFullName());
        }
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                super.toString() +
                "smart=" + smart +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
}
