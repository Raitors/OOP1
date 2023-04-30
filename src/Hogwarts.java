public abstract class Hogwarts {
    private String fullName;
    private int magicForce;
    private int transgressionDistance;

    public Hogwarts(String fullName, int magicForce, int transgressionDistance) {
        this.fullName = fullName;
        this.magicForce = magicForce;
        this.transgressionDistance = transgressionDistance;
    }

    public Hogwarts() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getMagicForce() {
        return magicForce;
    }

    public void setMagicForce(int magicForce) {
        this.magicForce = magicForce;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }


    @Override
    public String toString() {
        return "Hogwarts{" +
                "fullName='" + fullName + '\'' +
                ", magicForce=" + magicForce +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public void printCompare(Gryffindor hogwarts) {
    }

    public void printCompare(Hufflepuff hogwarts) {
    }

    public void printCompare(Ravenclaw hogwarts) {
    }

    public void printCompare(Slytherin hogwarts) {
    }

    public boolean compare(Hogwarts hogwarts) {
        return false;
    }
}
