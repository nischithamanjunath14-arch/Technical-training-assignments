package Module8;

import java.util.*;
public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        GroupAnagram ga=new GroupAnagram();
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(ga.groupAnagrams(str));
    }
}
