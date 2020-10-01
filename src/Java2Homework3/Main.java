package Java2Homework3;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {

        String[] world = new String[10];
        world[0] = "Word 1";
        world[1] = "123";
        world[2] = "qwerty";
        world[3] = "zxcre";
        world[4] = "zxcre";
        world[5] = "124";
        world[6] = "123";
        world[7] = "qwerty";
        world[8] = "Word 1";
        world[9] = "qwerti";

        task1(world);

        task2();
    }

    public static void task1(String[] world){
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i< world.length; i++){
            if (treeMap.containsKey(world[i])){
                treeMap.put(world[i], treeMap.get(world[i])+1);
            }else{
                treeMap.put(world[i], 1);
            }
        }

        System.out.println(treeMap);
    }

    public static void task2(){

        PhoneList phoneList = new PhoneList();

        phoneList.add("Sergey", "79231992345");
        phoneList.add("Sergey", "79231991245");
        phoneList.add("Sergey", "79231292345");
        phoneList.add("Pasha", "79231992345");
        phoneList.add("Vova", "79231592314");
        phoneList.add("Pasha", "79231992317");
        phoneList.add("Katya", "79231163084");

        System.out.println(phoneList.get("Vasya"));
        System.out.println(phoneList.get("Kolya"));
        System.out.println(phoneList.get("Pasha"));
        System.out.println(phoneList.get("Vova"));
        System.out.println(phoneList.get("Katya"));
    }
}