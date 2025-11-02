package DSA.JD05_Searching.Search_LinearSearchAlgo;

public class PQ01_FindElementInArray {

    public static void main(String[] args) {
        String str = "Meghsham Kapure";
        char searchValue = 'q';
        int targetIndex = findCharIndex(str, searchValue);

        System.out.println(
                targetIndex != -1 ?
                        "In string \"" + str + "\" searchValue '" + searchValue + "' is at index " + targetIndex :
                        "In string \"" + str + "\" searchValue '" + searchValue + "' is not found ");
    }

    public static int findCharIndex(String str, char searchValue) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == searchValue) {
                return i;
            }
        }
        return -1;
    }

}
