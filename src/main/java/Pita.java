public class Pita {
    //{"A1","B2","C3"};
    //{"C3", "B2", "A1"};
    //DO NOT TYPE ABOVE HERE
    public static String[] swap(String[] stringArray) {
        String[] swaping = new String[stringArray.length];
        for(int i = stringArray.length-1;i > -1;i--){
            swaping[i] = stringArray[i];
            System.out.println(swaping[i]);
        }
        return swaping;
    }  // DO NOT TYPE BELOW HERE!!!
    public static void main(String[] args){
        String[] arr = {"A1","B2","C3"};
        swap(arr);
    }
}
