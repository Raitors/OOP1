import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Gryffindor [] gryffindorsStudent = {
                new Gryffindor("Harry Potter",random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100)),
                new Gryffindor("Hermione Granger",random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100)),
                new Gryffindor("Ron Weasley",random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100))
        };
        Hufflepuff [] hufflepuffStudent = {
                new Hufflepuff("Zacharias Smith",random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100)),
                new Hufflepuff("Cedric Diggory",random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100)),
                new Hufflepuff("Justin Finch-Fletchley",random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100))
        };
        Ravenclaw [] ravenclawStudent = {
                new Ravenclaw("Zhou Chang",random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100)),
                new Ravenclaw("Padma Patil",random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100)),
                new Ravenclaw("Marcus Belby",random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100))
        };
        Slytherin [] slytherinStudent = {
                new Slytherin("Draco Malfoy",random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100)),
                new Slytherin("Graham Montague",random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100)),
                new Slytherin("Gregory Goyle",random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100))
        };

        PrintStudents printStudents = new PrintStudents();
        printStudents.print(gryffindorsStudent);
        printStudents.print(hufflepuffStudent);
        printStudents.print(ravenclawStudent);
        printStudents.print(slytherinStudent);


    }
}