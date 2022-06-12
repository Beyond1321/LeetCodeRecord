package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplacePattern890 {

    public String getIntPattern(String words){
        String newPattern = "";
        HashMap<Character, Character> temp_map = new HashMap<>();
        int cnt=65;
        for(int i=0;i<words.length();i++){
            char temp_c = words.charAt(i);
            if(temp_map.containsKey(temp_c)){
                newPattern+=temp_map.get(temp_c);
            }
            else{
                temp_map.put(temp_c,(char)cnt);
                newPattern+=((char)cnt);
                cnt++;
            }
        }
        return newPattern;
    }

    @Test
    public void findAndReplacePattern() {

        System.out.println(getIntPattern("abcdefghijkabl"));

    }
}

//["abcdefghijklab","abcdefghijkabl"]
//        "abcdefghijklab"