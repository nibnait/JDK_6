package 集合.Map;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

/*

 */
public class Main extends TestCase {

    @Test
    public void testCase() {
        Hashtable hashtable;

        HashMap hashMap;

        WeakHashMap weakHashMap;
        IdentityHashMap identityHashMap;

        EnumMap enumMap;


        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(ConcurrentHashMap.DEFAULT_INITIAL_CAPACITY, ConcurrentHashMap.DEFAULT_LOAD_FACTOR, 20);
        concurrentHashMap.put(1, 1);

        LinkedHashMap linkedHashMap = new LinkedHashMap(16,  0.75f, true);

        TreeMap<Integer, Integer> treeMap = new TreeMap(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        treeMap.put(2, 3);
        treeMap.put(1, 3);
        System.out.println(treeMap);

        ConcurrentSkipListMap concurrentSkipListMap;
    }

}
    