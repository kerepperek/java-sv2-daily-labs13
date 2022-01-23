package day04;

import day05.TransferPerClient;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Vowel {
    private static final String VOWELS="aeiou";

    public Map<Character,Integer> getVowels(String text){
        Map<Character,Integer> chars=new HashMap<>();
        for(Character ch:text.toCharArray()){
            Character c=Character.toLowerCase(ch);
            if(VOWELS.contains(c.toString())){
                Integer point=chars.computeIfAbsent(c,k -> 0);
                chars.put(c, point + 1);

       //      vagy
//                if(!chars.containsKey(c)){
//                    chars.put(c,1);
//                }else {
//                    chars.put(c, chars.get(c) + 1);
//                }
            }
        }

        return chars;
    }

    public static void main(String[] args) {
        Vowel vowel=new Vowel();
        System.out.println(vowel.getVowels("Twist and shout! Get ready!"));
    }
}
