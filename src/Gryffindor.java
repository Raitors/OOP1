public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String fullName, int magicForce, int transgressionDistance, int nobility, int honor, int courage) {
        super(fullName, magicForce, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    private int totalPoint() {
        return this.courage + this.honor + this.nobility;
    }

    public boolean compare(Gryffindor gryffindor) {
        return this.totalPoint() > gryffindor.totalPoint();
    }

    public void printCompare(Gryffindor gryffindor) {
        if (this.compare(gryffindor) == true) {
            System.out.println(this.getFullName() + " лучший Гриффиндорец, чем " + gryffindor.getFullName());
        } else {
            System.out.println(gryffindor.getFullName() + " лучший Гриффиндорец, чем " + this.getFullName());
        }
    }


    @Override
    public String toString() {
        return "Gryffindor{" +
                super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }
}
