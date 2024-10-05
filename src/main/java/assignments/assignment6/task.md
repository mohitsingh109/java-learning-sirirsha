
# Assignment: String Functions in Java

**Objective:**  
The purpose of this assignment is to familiarize you with the various string functions available in Java and how to use them effectively to manipulate and analyze strings.

---

**Instructions:**

1. **String Creation and Initialization**
    - Create a class named `StringManipulation`.
    - In the `main` method, initialize the following strings:
        - A string that contains your full name.
        - A string that contains your favorite quote.
        - A string that represents a sentence with a mix of uppercase and lowercase letters.

2. **String Functions**
    - Perform the following operations on the strings you created:
        1. **Length**: Print the length of each string using the `length()` method.
        2. **Character Access**: Retrieve and print the first character of your name using the `charAt()` method.
        3. **Substring**: Extract and print a substring from your favorite quote using the `substring(int beginIndex, int endIndex)` method.
        4. **String Comparison**: Create another string that contains your full name in all lowercase. Compare it with the original name using the `equals()` and `equalsIgnoreCase()` methods and print the results.
        5. **Search**: Find and print the index of the first occurrence of the letter 'a' in your favorite quote using the `indexOf(char ch)` method.
        6. **String Replacement**: Replace all occurrences of the letter 'a' in your favorite quote with '@' and print the modified string using the `replace(char oldChar, char newChar)` method.
        7. **Trim**: Create a string with leading and trailing spaces. Use the `trim()` method to remove the spaces and print the result.

3. **String Formatting**
    - Create a formatted string that includes your name, favorite quote, and the length of the quote. Use the `String.format()` method for this.

4. **Bonus Challenge**
    - Write a method `isPalindrome(String str)` that checks if a given string is a palindrome (reads the same backward as forward). Test this method with several strings, including your favorite quote after removing spaces and converting it to lowercase.

---

**Submission Requirements:**
- Implement the `StringManipulation` class as specified above.
- Ensure your code is well-commented to explain each section.
- Submit your Java file (.java) via the designated submission platform.


---

### Example Output

Your output might look something like this (actual values will vary):

```
Length of name:  10
Length of quote: 42
First character of name: J
Substring of quote: "Java is fun"
Comparison result (equals): false
Comparison result (equalsIgnoreCase): true
Index of 'a': 10
Modified quote: "J@v@ is fun"
Trimmed string: "Hello, World!"
Formatted String: "Name: John Doe, Quote: 'Java is fun', Length: 42"
```
