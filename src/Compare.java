public class Compare extends Hogwarts {


    public Compare(String fullName, int magicForce, int transgressionDistance) {
        super(fullName, magicForce, transgressionDistance);
    }

    public boolean compare(Hogwarts hogwarts) {
        return this.getMagicForce() + this.getTransgressionDistance() > hogwarts.getMagicForce() + hogwarts.getMagicForce();
    }

    public void printCompareHogwarts(Hogwarts hogwarts) {
        if (this.compare(hogwarts) == true) {
            System.out.println(this.getFullName() + " обладает большей мощностью магии, чем " + hogwarts.getFullName());
        } else {
            System.out.println(hogwarts.getFullName() + " обладает большей мощностью магии, чем " + this.getFullName());
        }
    }

}
