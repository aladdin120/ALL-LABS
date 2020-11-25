package LAB23;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Part 1");
        Convertation convertation = new Convertation();

        System.out.println("\nPart 2 and 3");
        GenericMassive<String> stringGenericMassive = new GenericMassive<>(new String[]{"Alex", "Ale", "Al", "A"});
        GenericMassive<Integer> integerGenericMassive = new GenericMassive<>(new Integer[]{4, 3, 2, 1});

        System.out.println("\nPart 4");
        CatalogToList catalogToList = new CatalogToList();

        System.out.println("\nPart 5");
        Solution solution = new Solution();
        List<Integer> list = solution.newArrayList(new Integer[]{4, 3, 2, 1});
        HashSet<String> hashSet = solution.newHashSet(new String[]{"Alex", "Ale", "Al", "A"});
        HashMap hashMap = solution.newHashMap(new Solution.Union[]{new Solution.Union<>(4, "Alex"), new Solution.Union<>(3, "Ale")});
        System.out.println("List generated from the array: "+list);
        System.out.println("Hash Set generated from the array: "+hashSet);
        System.out.println("Hash Map generated from the array: "+hashMap);
    }
}
