// https://leetcode.com/problems/distribute-candies-to-people/
class Solution {
    // tc -> n, sc-> N
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int resIndex = 0;
        int counter = 1;
        while(candies > 0){
            res[resIndex++] += counter;             
            candies -= counter++;
            if(counter > candies) counter = candies;
            if(resIndex==num_people) resIndex %= (num_people); 
        }   
        return res;
    }
}
