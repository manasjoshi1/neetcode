package arrays;

import java.util.HashMap;
import java.util.Objects;
/*
Problems
Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.
 */
public class isAnagram {
    public boolean isAnagramSolution(String s, String t) {

        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> iv = new HashMap<>();
        HashMap<Character,Integer> mv = new HashMap<>();
        for(char c: s.toCharArray()){
            if(iv.containsKey(c)){iv.put(c,iv.get(c)+1);}
            else{
                iv.put(c,1);
            }
        }
        for(char c: t.toCharArray()){
            if(mv.containsKey(c)){mv.put(c,mv.get(c)+1);}
            else{
                mv.put(c,1);
            }
        }
        boolean isAnagram = false;
//        iv.forEach((charcoacter, integer) -> mv.get(charcoacter).compareTo(integer));

        for(char c: s.toCharArray()){
            if(!(iv.containsKey(c)&& mv.containsKey(c)&& Objects.equals(iv.get(c), mv.get(c)))){isAnagram=false;break;}
            else{
                isAnagram=true;
            }
        }


return isAnagram;
    }
}
