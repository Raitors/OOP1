public class PrintStudents {
    public void print(Gryffindor[] gryffindors) {
        System.out.println("Gryffindor :");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("name : " + gryffindor.getFullName()
                    + "; magickForce " + gryffindor.getMagicForce()
                    + "; transgressionDistance " + gryffindor.getTransgressionDistance()
                    + "; nobility " + gryffindor.getNobility()
                    + "; honor " + gryffindor.getHonor()
                    + "; courage " + gryffindor.getCourage());
        }
        System.out.println();
    }
    public void print(Hufflepuff[] hufflepuffs){
        System.out.println("Hufflepuff :");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("name : " + hufflepuff.getFullName()
                    + "; magickForce " + hufflepuff.getMagicForce()
                    + "; transgressionDistance " + hufflepuff.getTransgressionDistance()
                    + "; hardWorking " + hufflepuff.getHardWorking()
                    + "; loyal " + hufflepuff.getLoyal()
                    + "; honest " + hufflepuff.getHonest());
        }
        System.out.println();
    }
    public void print(Ravenclaw[] ravenclaws){
        System.out.println("Ravenclaw :");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("name : " + ravenclaw.getFullName()
                    +"; magickForce "+ravenclaw.getMagicForce()
                    +"; transgressionDistance "+ravenclaw.getTransgressionDistance()
                    +"; cunning "+ ravenclaw.getSmart()
                    +"; decisiveness "+ ravenclaw.getWit()
                    +"; ambition "+ ravenclaw.getCreation());
        }
        System.out.println();
    }
    public void print(Slytherin[] slytherins){
        System.out.println("Slytherin");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("name : " + slytherin.getFullName()
                    + "; magickForce " + slytherin.getMagicForce()
                    + "; transgressionDistance " + slytherin.getTransgressionDistance()
                    + "; cunning " + slytherin.getCunning()
                    + "; decisiveness " + slytherin.getDecisiveness()
                    + "; ambition " + slytherin.getAmbition()
                    + "; resourcefulness " + slytherin.getResourcefulness()
                    + "; lustForPower " + slytherin.getLustForPower());
        }
        System.out.println();
    }
}

