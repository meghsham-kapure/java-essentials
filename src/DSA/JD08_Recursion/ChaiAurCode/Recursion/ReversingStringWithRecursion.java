package DSA.JD08_Recursion.ChaiAurCode.Recursion;

public class ReversingStringWithRecursion {
    public static void main(String[] args) {

        String originalString = "Okey";
        String reversedString = reverseString(originalString);
        System.out.println(reversedString);

    }

    public static String reverseString(String str) {
        if (str.length() <=1){
            return  str;
        }else {
            String subString = str.substring(1);
            char firstChar = str.charAt(0);
            String reverse = reverseString(subString);
            return  reverse + firstChar ;
        }
    }


    /*
     Sudo-Code:
    
     We call reverseString() with input "Okey"
     base condition is checked for whether the String having length lesser than  2
       if true then return the string
       if false then
           create a characters of substring of str  present on index (0 to str.length-1)
           extract the firstChar from str
           recall reverseString for reversing the subString
           concatenate the substring with first char
    
     Code Dry Run
    
        reverseString("okey")
            base condition false
                substring = "key"
                firstChar = 'o'
                reverse = reverseString("key")
                    base condition false
                        substring = "ey"
                        firstChar = 'k'
                        reverse = reverseString("ey")
                            base condition false
                                substring = "y"
                                firstChar = 'e'
                                reverse = reverseString("y")
                                    base condition true
                                    return "y"
                                return "y" + 'e' = "ye"
                            return "ye" + 'k' = "yek"
                    return "yek" + 'o' = "yeko"
            return "yeko"
    */


}
