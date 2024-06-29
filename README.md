# Credit Score Grade

This Java program evaluates a user's credit score and assigns a corresponding grade and star rating based on predefined ranges. The program uses the `Scanner` class to read input from the user and employs conditional statements to determine the credit score grade and star rating. Here is a detailed explanation:

The program starts by importing the `Scanner` class from the `java.util` package, which is essential for capturing user input from the console. It then defines a class named `CreditScoreGrade` with a static method `space()` that prints an empty line, enhancing the readability of the console output.

Within the `main` method, a `Scanner` object named `scan` is instantiated to read input from the standard input stream. Two integer variables, `creditScore` and `excellentCredit`, are declared. `creditScore` will hold the user's input, while `excellentCredit` is initialized to 761, representing the threshold for excellent credit.

The program prints a decorative header to introduce the credit score grading system. It then prompts the user to input their credit score, which is read and stored in the `creditScore` variable. The difference between 761 and the user's credit score is calculated and stored in `excellentCredit`, which will be used to inform the user how many points are needed to reach excellent credit.

The program uses a series of `if-else` statements to categorize the credit score into different grades and assign star ratings:

- If the score is between 300 and 620, it assigns a grade of 'D', a star rating of '*', and provides motivational messages along with the points needed to reach excellent credit.
- Scores between 621 and 700 are graded as 'C', with a star rating of '**'.
- Scores between 701 and 760 are graded as 'B', with a star rating of '***'.
- Scores between 761 and 850 are graded as 'A+', with a star rating of '****'.

Each grade and star rating comes with respective messages and encouragement. If the input is outside the valid range of 300 to 850, the program prints an error message indicating an invalid credit score.

Finally, the `Scanner` object is closed to release the resources associated with it, marking the end of the program. This code provides a straightforward yet effective way to evaluate and motivate users based on their credit scores, adding a star rating system for a visual representation of the credit quality.
