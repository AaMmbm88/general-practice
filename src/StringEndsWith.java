public class StringEndsWith {
    public static boolean solution(String str, String ending) {
        boolean endsWith = false;
        if(ending.length()>str.length()){
            endsWith = false;
        }else if (ending.length()<=str.length()){
            String substring = str.substring(str.length()-ending.length());
            if (substring.equals(ending)){

                endsWith = true;
            }
        }
        return endsWith;
    }
    public static String substring(String string, String ending){
        return string.substring(string.length()-ending.length());
    }
}


