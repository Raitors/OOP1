public class Compare {

    public void printCompareHogwarts(Hogwarts hogwarts, Hogwarts hogwarts1) {
        if (hogwarts.compare(hogwarts) == true) {
            System.out.println(hogwarts.getFullName() + " обладает большей мощностью магии, чем " + hogwarts1.getFullName());
        } else {
            System.out.println(hogwarts1.getFullName() + " обладает большей мощностью магии, чем " + hogwarts.getFullName());
        }
    }

}
