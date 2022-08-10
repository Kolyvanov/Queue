import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<Person> list = generateClients();
        Queue<Person> queue = new LinkedList<>();
        
        for (Person c: list) {
            queue.offer(c);
        }


    }


    static List<Person> generateClients() {
        List<Person> list = new ArrayList<>();
        Person client1 = new Person("Андрей", "Качановский", 1);
        Person client2 = new Person("Сергей", "Панков", 3);
        Person client3 = new Person("Юля", "Сорока", 5);
        Person client4 = new Person("Александр", "Хорошилов", 4);
        Person client5 = new Person("Андрей", "Смирнов", 2);
        list.add(client1);
        list.add(client2);
        list.add(client3);
        list.add(client4);
        list.add(client5);
        return list;
    }

}
