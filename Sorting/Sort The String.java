class Solution 
{ 
    String sort(String s) 
    {
        char temp[] = s.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
} 