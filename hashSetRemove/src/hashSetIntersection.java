import java.util.HashSet;

public class hashSetIntersection {
    public static void main(String[] args) {

        // two HashSets have to be created
        HashSet<String> clothingAccessories = new HashSet<String>();
        clothingAccessories.add("trousers");
        clothingAccessories.add("chanel");
        clothingAccessories.add("skirt");
        clothingAccessories.add("birkin");
        clothingAccessories.add("Shirt");
        clothingAccessories.add("coperni");

        HashSet<String> bags  =  new HashSet<String>();
        bags.add("Lv");
        bags.add("coperni");
        bags.add("shirt");
        bags.add("birkin");
        bags.add("trousers");
        bags.add("chanel");


        //create an intersection here
        //note that a retainAll method would be used to retain all the other things in the set that dont intersect

        HashSet<String> intersection = new HashSet<>(clothingAccessories);
        intersection.retainAll(bags);

        System.out.println("clothingAccesories :"  +  " "  + clothingAccessories);
        System.out.println("bags :"  + " " + bags);

        System.out.println("Intersection contains :" ) ;
        System.out.println(intersection);
    }

}
