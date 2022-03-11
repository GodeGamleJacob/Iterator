package FilEksempler;

public class CollectionOfPersons implements Container {
    public String name[] = {"Mip-mippen", "Mester Jakel", "Onkel Dinosaurus", "Fætter Guf", "Rapand"};
    public Person[] personer;

    public CollectionOfPersons(Person[] arrayOfPersons) {
        this.personer = arrayOfPersons;
    }

    @Override
    public Iterator getIterator() {
        return new CollectionofPersonsIterate();
    }

    private class CollectionofPersonsIterate implements Iterator {
        int i;

        @Override
        public boolean hasNext() {
            if (i < personer.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return personer[i++];
            }
            return null;
        }
    }
}

