class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        

        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String str : strs){
            int[] count = new int[26];
            
            for(int i = 0; i<str.length(); i++){
                count[str.charAt(i) - 'a'] += 1;
            }

            String key = Arrays.toString(count);
            if(map.get(key) != null){
                map.get(key).add(str);
            }
            else
                map.put(key, new ArrayList<>(Arrays.asList(str)));
            
        }
        List<List<String>> result = map.values().stream()
                                      .collect(Collectors.toList());;
    
        return result;
        
    }
}
