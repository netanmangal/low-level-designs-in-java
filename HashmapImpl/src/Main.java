package HashmapImpl.src;

public class Main {

    public static void main(String args[]) {
        Hashmap<Integer, String> hashmap = new Hashmap<Integer, String>();
        hashmap.put(5, "FIVE");
        hashmap.put(21, "TWENTY-ONE");
        hashmap.put(17, "SEVENTEEN");
        hashmap.put(1, "ONE");
        hashmap.put(33, "THIRTY_THREE");
        hashmap.put(2, "TWO");
        hashmap.put(5, "FIVE");
        hashmap.put(50, "FIFTY");
        hashmap.put(15, "FIFTEEN");

        System.out.println(hashmap);
    }


}
