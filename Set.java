import java.util.ArrayList;


public class Set<T> extends ArrayList {

    public static <T> Set<T> symmetricDifference(Set<? extends T> m1, Set<? extends T> m2) {
        Set<T> m3 = new Set<>();
        for (int i=0;i<m1.size();i++) {
            if (!m2.contains(m1.get(i))) {
                m3.add(m1.get(i));
            }
        }

        for (int i=0;i<m2.size();i++) {
            if (!m1.contains(m2.get(i))) {
                m3.add(m2.get(i));
            }
        }
            return m3;

        }

    }
