package arrays;

import java.util.*;

/*
Given an array of strings strs, group all anagrams together into sublist.
You may return the output in any order.

An anagram is a string that contains the exact same characters as another string,
 but the order of the characters can be different.


 */
public class AnagramGroups {
    public static List<List<String>> groupAnagrams(String[] strs) {
        //This is a brute force approach
        HashMap<String,List<Integer>> anagram = new HashMap<>();
        int i=0;
        for(String s : strs){

            char[] c = s.toCharArray();
            Arrays.sort(c);
            if(anagram.containsKey(String.valueOf(c))) {
                anagram.get(String.valueOf(c)).add(i);
                anagram.put(String.valueOf(c), anagram.get(String.valueOf(c)));
            }else{
                List<Integer> temp =new ArrayList<>();
                temp.add(i);
                anagram.put(String.valueOf(c), temp);
            }
            i++;
        }
        List<List<String>> groupedAnagram = new ArrayList<>();

        for(String s : anagram.keySet()){
            List<String> group = new ArrayList<>();
            for(Integer j : anagram.get(s)) {
                group.add(strs[j]);
            }
            groupedAnagram.add(group);
        }


        return groupedAnagram;
    }
    public static List<List<String>> groupAnagramsOptimized(String[] strs) {
        //This is a brute force approach
        HashMap<HashMap<Character,Integer>,List<String>> anagram = new HashMap<>();
        int i=0;
        for(String s : strs){
            HashMap<Character,Integer> temp = new HashMap<>();
            for(int j=0;j<s.length();j++){
                if(temp.containsKey(s.charAt(j))) {
                    int x =temp.get(s.charAt(j));
                    temp.put(s.charAt(j),x++);
                }else{
                    temp.put(s.charAt(j),1);
                }
            }
            if(anagram.containsKey(temp)){
                anagram.get(temp).add(s);
            }else{
                List<String> l = new ArrayList<>();
                l.add(s);
                anagram.put(temp,l);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(HashMap<Character, Integer> ls : anagram.keySet()){
            res.add(anagram.get(ls));
        }



        return res;
    }

    public static void main(String[] args) {
        String[] strs={"act","pots","tops","cat","stop","hat"};
        List<List<String>> anagram = groupAnagramsOptimized(strs);
        System.out.println(Arrays.stream(anagram.toArray()).toList());

    }
}
