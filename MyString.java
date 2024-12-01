public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
       String newStr="";
        for(int i=0;i<str.length();i++){ // should cover edge cases
            char chr=str.charAt(i);
            if ((64<chr)&&(chr<91)) {
                chr=(char)(chr+32);
            }
            newStr+=chr;
        }
        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        char chr1,chr2;
        int startIndex=str1.indexOf(str2.charAt(0));
        if(startIndex==-1) {
            return false;
        } else {
            boolean isSub = false;
            int lastIndex = str1.length()-str2.length() + 1;
            for (int i = 0; i < lastIndex && !isSub ; i++){ // checking the potential start of substring
            if (str2.charAt(0) == str1.charAt(i)){ // first letter of str2 is in str1
                isSub = true;
                 for (int j = 0; j < str2.length() && isSub ; j++){ // checks if it continue as a substring
                    isSub = (str2.charAt(j) == str1.charAt(i + j));   
                   }
                }
            }
        return isSub;
     }
}

}