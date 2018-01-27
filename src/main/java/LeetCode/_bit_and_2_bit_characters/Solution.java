package LeetCode._bit_and_2_bit_characters;

public class Solution {
	public boolean isOneBitCharacter(int[] bits) {
        int index = 0;
        int start = 0;
        while(index != bits.length){
            if (bits[index]==1){
            	start = index;
                index += 2;
            }else{
            	start = index;
                index++;
            }
        }
        if(start == bits.length - 1 && bits[bits.length-1] == 0){
            return true;
        } else{
            return false;
        }
    }
}
