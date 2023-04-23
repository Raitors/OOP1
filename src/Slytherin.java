public class Slytherin extends Hogwarts{
    private int cunning;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String fullName, int magicForce, int transgressionDistance,int cunning, int decisiveness, int ambition, int resourcefulness, int lustForPower) {
        super(fullName,magicForce,transgressionDistance);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

}
