package strings;

public class RemoveCharacterFromString {

    public static void main(String[] args) {

        String s = "I am a Software Developer";
        char c = 'a';
        System.out.println(removeChar(s,c));

    }

    public static String removeChar(String s , char c){

        if(s==null)
            return null;

        //return s.replaceAll(Character.toString(c),"");
                  // OR
        return s.replaceAll(""+c,"");

    }
}
