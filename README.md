# iNEURON Assignments (Java)

Solutions to Java programming assignments from iNeuron courses. Each program is a standalone Java class with a `main` method and hard-coded sample input; it prints its result to the console. There are no external dependencies or build files.

## Contents

### Assignment_1_Enterprise - pattern printing

| File | Description |
| --- | --- |
| `Question_1.java` | Prints the word "INEURON" in large letters made of `|` characters |
| `Question_2.java` | Prints a number square where each row repeats its row number |
| `Question_3.java` - `Question_5.java` | Print star (`*`) shape patterns inside a square grid |

The folder also contains the assignment PDF, screenshots of the output (`q1.png` - `q5.png`) and a README that displays them.

### Assignment_2_Fullstack - arrays and sorting

| File | Description |
| --- | --- |
| `Question_1.java` | Find duplicate elements in an array |
| `Question_2.java` | Quick sort |
| `Question_3.java` | Bubble sort |
| `Question_4.java` | Merge sort |
| `Question_5.java` | Selection sort |
| `Question_6.java` | Insertion sort |
| `Question_7.java` | Check whether one array is a subset of another |

Includes the assignment PDF (`2.pdf`).

### Assignment_3_Enterprise - strings

| File | Description |
| --- | --- |
| `Question_1.java` | Reverse a string |
| `Question_2.java` | Reverse each word of a sentence while keeping word positions |
| `Question_3.java` | Check whether two strings are anagrams |
| `Question_4.java` | Check whether a string is a pangram |
| `Question_5.java` | Print repeated characters in a string |
| `Question_6.java` | Sort the characters of a string alphabetically |
| `Question_7.java` | Count vowels and consonants |
| `Question_8.java` | Count special characters |

Includes the assignment PDF (`PDF.pdf`).

### Assignment_4_FullStack - more string problems

| File | Description |
| --- | --- |
| `Anagram.java` | Check whether two character arrays are anagrams |
| `Consonants_Vowels_and_SpecialCharacters.java` | Count distinct vowels, consonants and special characters |
| `MaximumOccurringCharacter.java` | Find the most frequent character |
| `Palindrome.java` | Check whether a string is a palindrome |
| `Pangram.java` | Check whether a string is a pangram |
| `PrintDuplicates.java` | Print characters that occur more than once |
| `RemoveDuplicates.java` | Remove duplicate characters from a string |
| `UniqueCharacters.java` | Check whether all characters in a string are unique |

Includes the assignment PDF (`4.pdf`).

## Prerequisites

- A JDK (Java 8 or later)

## How to run

Each source file declares a `package` that does not match its folder name, so compile the file into an output directory and run it by its fully qualified class name:

| Folder | Package |
| --- | --- |
| `Assignment_1_Enterprise` | `Assignment_1` |
| `Assignment_2_Fullstack` | `Assignment_3` |
| `Assignment_3_Enterprise` | `Assignment_3` |
| `Assignment_4_FullStack` | `Assignmnet_4_FullStack` |

Example, from the repository root (the same commands work on Windows, Linux and macOS):

```bash
javac -d out Assignment_2_Fullstack/Question_2.java
java -cp out Assignment_3.Question_2

javac -d out Assignment_4_FullStack/Pangram.java
java -cp out Assignmnet_4_FullStack.Pangram
```

Because `Assignment_2_Fullstack` and `Assignment_3_Enterprise` use the same package and class names, use a separate output directory (or clear `out`) when switching between them.

To change the input, edit the hard-coded values in the `main` method of the file.
