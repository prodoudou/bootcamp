public class leetcode {
 

    public String reversePrefix(String word, char ch) {
        
        //1. check if ch exists
        //2. lowcas only word.length(1) >= 1
        // idx
        int idx = word.indexOf(ch);
        if(idx == -1)
        

            return word;
        } 

        char[] arr = word.toCharArray();
        char temp;
        int strLength = idx + 1;
        for (int i = 0;i < strLength; i++){
            //scenario 1: 1, 2, 3, 4, 5,// -> length /2 -1
            //secenario 2: 1, 2 ,3, 4, 6, 7// >length / 2 - 1
            if(i > strLength / 2 - 1)
                break;
            //swap
            temp = arr[i];
            arr[i] = arr[arr.length -1 -i];
            arr[arr.length -1 -i] = temp;
        }
        
        return String.valueOf(arr);




    


    

