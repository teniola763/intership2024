import java.util.HashSet;

public class HashSetCompare {
    public static void main(String[] args) {
        HashSet<String> hairStyles = new HashSet<String>();
        hairStyles.add("bob");
        hairStyles.add("knotless braids");
        hairStyles.add("lowcut");
        hairStyles.add("taper");
        System.out.println("hairStyles:" + " " + hairStyles);

        HashSet<String >hairStylesOne = new HashSet<>();
        hairStylesOne.add("zizZag");
        hairStylesOne.add("lowcut");
        hairStylesOne.add("sewIn");
        hairStylesOne.add("dreads");
        hairStylesOne.add("locs");
        System.out.println("hairStylesOne :" + " "  + hairStylesOne);
        hairStyles.retainAll(hairStylesOne);
        System.out.println("Comapared HashSet contains: ");
        System.out.println(hairStyles);
    }
}
