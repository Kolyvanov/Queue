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
        if (countTicket > 1) {
            countTicket--;
            return true;
        } else if (countTicket == 1) {
            countTicket--;
            return false;
        } else {
            return false;
        }
    }
}
