public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wit;
    private int creativity;

    public Ravenclaw(String fullName, int magicForce, int transgressionDistance,int smart, int wit, int creativity) {
        super(fullName,magicForce,transgressionDistance);
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
}
