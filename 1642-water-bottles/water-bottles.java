class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;

        while(numBottles>=numExchange){
        int empty = numBottles%numExchange;
        numBottles = numBottles / numExchange;
        drink += numBottles;
        numBottles += empty;
        }
        return drink;
    }
}