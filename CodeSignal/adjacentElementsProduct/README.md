#### Challenge

Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For `inputArray = [3, 6, -2, -5, 7, 3]`, the output should be adjacentElementsProduct(inputArray) = 21. `7` and `3` produce the largest product.



#### Solution

```c
int adjacentElementsProduct(int[] inputArray) {

    int tmp = 0;
    
    for(int i = 0; i < inputArray.length-1;i++){       
        if(inputArray[i] * inputArray[i+1] > tmp){        
            tmp = inputArray[i] * inputArray[i+1];
        }      
         if(tmp == 0)
         tmp = inputArray[i] * inputArray[i+1];
    }
    return tmp;
}

```

