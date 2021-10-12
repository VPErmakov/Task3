public class Osn {
    public static void main(String[] args){
        Set<Object> m1 = new Set<>();
        Set<Object> m2 = new Set<>();
        m1.add(20);
        m1.add("Str");
        m2.add("a");
        m2.add(21);
        m2.add("Str");

        System.out.println(Set.symmetricDifference(m1,m2));
    }
}
