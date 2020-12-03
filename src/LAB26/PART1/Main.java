package LAB26.PART1;

import java.util.*;

public class Main {

    private Map<String, String> mapOne = new HashMap<>();
    private List <String> surTemp;

    public String KeyForValue(String k) {
        for (String key : surTemp) {
            String obj = mapOne.get(key);
                if (obj.equals(k)) {
                    return key;
                }
        }
        return "";
    }

    public void m() {

        String[] surnames = {"Mcdonald", "Berry", "Fernandez", "Thompson", "Davidson"};
        String[] names = {"Max", "Alex", "Alex", "Kate", "Max"};

        for(int i = 0; i < 5; i++)
            mapOne.put(surnames[i], names[i]);
        System.out.println("After:\t"+mapOne);

        Map<String, String> mapTemp = new HashMap<>();
        List<String> namesTemp = new ArrayList<>(mapOne.values());
        surTemp = new ArrayList<>(mapOne.keySet());

        ArrayList <String> del = new ArrayList<>();
        for(int i = 0; i < namesTemp.size()-1; i++) {
            for (int j = i+1; j < namesTemp.size(); j ++) {
                if (namesTemp.get(i).equals(namesTemp.get(j))) {
                    del.add(namesTemp.get(i));
                    del.add(namesTemp.get(j));
                }
            }
        }
        for (String string : del) namesTemp.remove(string);

        for (String k : namesTemp)
            mapTemp.put(KeyForValue(k), k);

        System.out.println("Before:\t"+mapTemp);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.m();
    }
}
