
public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String fullName, int magicForce, int transgressionDistance,int nobility, int honor, int courage) {
        super(fullName,magicForce,transgressionDistance);
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
    public int abil(int abil){
        return abil=getCourage()+getHonor()+getNobility();
    }


}
