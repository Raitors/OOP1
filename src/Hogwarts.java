public class Hogwarts    {
    private String fullName;
    private int magicForce;
    private int transgressionDistance;

    public Hogwarts(String fullName, int magicForce, int transgressionDistance) {
        this.fullName = fullName;
        this.magicForce = magicForce;
        this.transgressionDistance = transgressionDistance;
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

    public boolean compare(Hogwarts hogwarts) {
        return this.magicForce + this.transgressionDistance > hogwarts.magicForce + hogwarts.magicForce;
    }

    public void printCompare(Hogwarts hogwarts) {
        if (this.compare(hogwarts) == true) {
            System.out.println(this.getFullName() + " обладает большей мощностью магии, чем " + hogwarts.getFullName());
        } else {
            System.out.println(hogwarts.getFullName() + " обладает большей мощностью магии, чем " + this.getFullName());
        }
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "fullName='" + fullName + '\'' +
                ", magicForce=" + magicForce +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
