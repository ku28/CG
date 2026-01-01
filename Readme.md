# Capgemini Training

**Date** 31st December 2025
---

# Java Programming Concepts - Notes

## 1. Java Comments
- **Single Line:** // This is a single line comment
- **Multi-line:**
  /* This is a 
     multi-line comment */
- Comments are ignored by the compiler and help improve code readability.

## 2. Java Data Types
- `int`: Integer values (e.g., int age = 25;)
- `double`: Floating point numbers (e.g., double height = 5.9;)
- `char`: Single character (e.g., char grade = 'A';)
- `String`: Sequence of characters (e.g., String name = "John";)

## 3. Java Variables
- Variables store data for later use.
- **Declaration & Assignment:**
  int salary = 100000;
  double price = 99.99;
  char initial = 'C';
  String city = "Mumbai";
- **Changing Value:**
  salary = 120000;
- **Variable Naming:**
  - Use meaningful names: annualSalary (good), as (bad)
  - No special characters: flatNumber (good), flat# (bad)

## 4. Displaying Text and Variables
- Use System.out.println() to display text and variables.
- Concatenate using + operator:
  System.out.println("Annual Salary: " + annualSalary);
  System.out.println("Old Salary = " + (salary-increment) + "\nIncrement = " + increment + "\nNew Salary " + salary);

## 5. Arithmetic Operators
- Used for calculations: +, -, *, /, %
- Example:
  int increment = salary * 10 / 100;
  salary = salary + increment;
- Multiple variables can be declared in one line:
  int salary = 100000, annualSalary = 1000000;

## 6. Operator Precedence
- Order of operations: Parentheses > Multiplication/Division/Modulus > Addition/Subtraction
- Example:
  int x = 9 + 3 / 2 * 4 - 2; // Output: 11
  int y = (9 + 3) / 2 * 4 - 2; // Output: 22

## 7. Type Conversion
- Implicit and explicit conversion between data types.
- Example:
  double halfLitre = 500/1000; // 0.0 (int division)
  halfLitre = (double)500 / (double)1000; // 0.5
- Cannot assign double to int directly:
  // int value1 = 20 + 45.68; // Error
  double value3 = 20 + 45.68; // OK

## 8. User Input
- Use Scanner class to take input from user.
- Example:
  import java.util.Scanner;
  Scanner input = new Scanner(System.in);
  int age = input.nextInt();
  double height = input.nextDouble();
  input.close();
- See ContactDetails.java in this codebase for a full example.

## 9. Reference to Java Programs in This Codebase
- **ContactDetails.java**: Demonstrates user input and displaying variables.
- **BasicCalc.java, AverageCalc.java, PriceCalc.java, ProfitLoss.java, DiscountFee.java, DiscountFeeInput.java, DividePens.java, DoubleOpt.java, QuotientRemainderCalc.java**: Practice arithmetic operations, variable usage, and operator precedence.
- **KmToMiles.java, KmToMilesInput.java, CmToFeetInches.java, FeetToYardsMiles.java, SideOfSquare.java, AreaOfTriangle.java, VolOfEarth.java**: Practice type conversion, variable naming, and calculations.
- **AgeCal.java**: Practice variable declaration, assignment, and displaying results.

---