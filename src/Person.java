public class Person {
    protected String name;
    protected String surname;
    protected int countTicket;

    public Person(String name, String surname, int countTicket) {
        this.name = name;
        this.surname = surname;
        this.countTicket = countTicket;
    }

    public boolean minusTicket() {
        if (countTicket > 0) {
            countTicket--;
            return true;
        } else {
            return false;
        }
    }

    public int getCountTicket() {
        return countTicket;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
