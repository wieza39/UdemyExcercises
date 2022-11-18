package udemy.collections.hashMap.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hashMapExercise {
    public static void main(String[] args) {

        HashMap<String, Client> map = new HashMap<>();
        String names[] = {"Ann", "Thomas", "Johnny", "Stefan"};

        for(int i = 0; i < names.length; i++){
            map.put(names[i], new Client(names[i]));
        }

        System.out.println(map.get("Johnny"));

        for ( Map.Entry<String, Client> e : map.entrySet()){
            String key = e.getKey();
            Client value = e.getValue();

            System.out.println("Key " + key + " - " + "value " + value);
        }
    }
}
