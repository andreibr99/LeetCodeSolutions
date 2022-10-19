public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("(]()"));;
    }

    public static boolean isValid(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' && s.charAt(i+1) == ')' || s.charAt(i) == '[' && s.charAt(i+1) == ']' || s.charAt(i) == '{' && s.charAt(i+1) == '}'){
                return true;
            }
        } return false;
    }
}