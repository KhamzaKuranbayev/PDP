package pdp_lessons.module2.lesson10.task2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // 1)	List yarating va unga 10 ta ism kiriting. List elementlarini Iterator orqali ekranga chiqazing.
        LinkedList<String> names = new LinkedList<>();
        names.add("Sobir");
        names.add("Ahmad");
        names.add("Bobur");
        names.add("Anvar");
        names.add("Zokir");
        names.add("Shokir");
        names.add("Kamol");
        names.add("Bekzod");
        names.add("Sherzod");
        names.add("Dilshod");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        // 2)	Listning oxiriga “Xolmat” ismini kiriting
        names.addLast("Xolmat");

        // 3)	Listning birinchi elementiga O’zingizni ismingizni kiriting.
        names.addFirst("Khamza");

        // 4)	Listning 2 elementini Familiyangizga almashtiring
        names.set(1, "Kuranbayev");

        Iterator<String> iterator2 = names.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }

        // 5)	Listni Array ga o’giring.
        String[] namesArray = names.toArray(new String[names.size()]);
        System.out.println("\n\nList to Array:");
        System.out.println(Arrays.toString(namesArray));

        // 6)	Listni ichidan ozingizni Ismingiz va Failiyangizni o’chiring
        names.remove(0);
        names.remove("Kuranbayev");

        System.out.println();
        Iterator<String> iterator3 = names.iterator();
        while (iterator3.hasNext()) {
            System.out.print(iterator3.next() + " ");
        }
    }
}
