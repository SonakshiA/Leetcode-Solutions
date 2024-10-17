class Solution {
    public boolean areNumbersAscending(String s) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        String[] words = s.split(" ");
        for(String word: words){
            try{
                int num = Integer.parseInt(word);
                numbers.add(num);
            }catch (NumberFormatException e){
                
            }
        }
        
        for(int i=0;i<numbers.size()-1;i++){
            if(numbers.get(i+1)<=numbers.get(i)){
                return false;
            }
        }
        return true;
    }
}