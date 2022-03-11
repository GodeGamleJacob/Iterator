package FilEksempler;

public class Main {

    public static void main(String[] args) {

        Person[] personer = new Person[4];
        personer[0] = new Person("Torben", "Iorden", "001");
        personer[1] = new Person("Mads", "Olsen", "002");
        personer[2] = new Person("Nicklas", "Jensen", "003");
        personer[3] = new Person("Jacob", "Fisker", "007");


        CollectionOfPersons collectionOfPersons = new CollectionOfPersons(personer);

        for (Iterator iter = collectionOfPersons.getIterator(); iter.hasNext(); ) {
            Person person = (Person) iter.next();
            System.out.printf(">>> Stdnr: %-4s >>> Fornavn: %-4s >>> Efternavn: %s \n", person.getStdnr(), person.getForNavn(), person.getEfterNavn());
        }
    }
}
/*
4.	Implementer et Iterator mønster, hvor container klassen indeholder person objekter (stdnr, fnavn, enavn).
 */