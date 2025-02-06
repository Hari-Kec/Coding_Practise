class Main {
    static List<Integer> findDuplicate(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                    duplicates.add(arr[i]);
                    break; 
                }
            }
        }
        return duplicates;
    }
}