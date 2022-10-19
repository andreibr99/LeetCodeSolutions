public class Main {
    public static void main(String[] args) {
        int x=lengthOfLastWord("I am a robot");
        System.out.println(x);
    }

    public static int lengthOfLastWord(String s){
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }
}