#### Challenge

Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be checkPalindrome(inputString) = true;

For inputString = "abac", the output should be checkPalindrome(inputString) = false;

For inputString = "a", the output should be checkPalindrome(inputString) = true.



#### Solution

```c
boolean checkPalindrome(String inputString) {
​    for(int i = 0, j = inputString.length()-1; i < j; i++,j--){
​        if(inputString.charAt(i) == inputString.charAt(j)){
​        }else{
​            return false;            
        }
​    }
​    return true;
}
```

