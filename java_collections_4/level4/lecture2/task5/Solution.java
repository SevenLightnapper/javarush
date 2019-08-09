package javarush.java_collections_4.level4.lecture2.task5;
/*
package com.javarush.task.task34.task3404;
*/
/*
Рекурсия для мат. выражения
*/
/*
На вход подается строка - математическое выражение.
Выражение включает целые и дробные числа, скобки (), пробелы, знак отрицания -, возведение в степень ^, sin(x), cos(x), tan(x)
Для sin(x), cos(x), tan(x) выражение внутри скобок считать градусами, например, cos(3 + 19*3)=0.5
Степень задается так: a^(1+3) и так a^4, что эквивалентно a*a*a*a.
С помощью рекурсии вычислить выражение и количество математических операций. Вывести через пробел результат в консоль.
Результат выводить с точностью до двух знаков, для 0.33333 вывести 0.33, использовать стандартный принцип округления.
Знак отрицания перед числом также считать математической операцией.
Не создавай в классе Solution дополнительные поля.
Не пиши косвенную рекурсию.

Пример, состоящий из операций sin * - + * +:
sin(2*(-5+1.5*4)+28)
Результат:
0.5 6

Пример, состоящий из операций tan ^:
tan(2025 ^ 0.5)
Результат:
1 2
Требования:

    •
    В классе Solution не должны быть созданы дополнительные поля.
    •
    Метод recurse должен выводить на экран результат вычисления заданного выражения (пример в условии).
    •
    Метод recurse не должен быть статическим.
    •
    Метод recurse должен быть рекурсивным.
    */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Stack;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.recurse("sin(2*(-5+1.5*4)+28)", 0); //expected output 0.5 6
    }

    public void recurse(final String expression, int countOperation) {
        Locale.setDefault(Locale.ENGLISH);
        final DecimalFormat fourDigitFormat = new DecimalFormat("#.####");
        final DecimalFormat twoDigitFormat = new DecimalFormat("#.##");
        fourDigitFormat.setRoundingMode(RoundingMode.HALF_UP);
        twoDigitFormat.setRoundingMode(RoundingMode.HALF_UP);
        final String cleanExpression = expression
                .replace(" ", "")
                .replace("+-", "-")
                .replace("--", "+");
        if (countOperation == 0) {
            countOperation = countNegativeNumbers(cleanExpression);
        }
        final Stack<Integer> brackets = new Stack<>();

        if (cleanExpression.contains("(")) {
            for (int i = 0; i < cleanExpression.length(); i++) {
                if (cleanExpression.charAt(i) == '(') brackets.push(i);
                if (cleanExpression.charAt(i) == ')') {
                    final int indOpenBracket = brackets.pop();
                    String newExpression = cleanExpression.substring(indOpenBracket + 1, i);
                    if (newExpression.matches(".*[+^/*].*") || (newExpression.contains("-") && newExpression.lastIndexOf('-') != 0)) {
                        final String res = calculateSimpleMathOperation(newExpression);
                        newExpression = cleanExpression.substring(0, indOpenBracket + 1) + res + cleanExpression.substring(i);
                        recurse(newExpression, countOperation + 1);
                        return;
                    }
                    final double numberInBrackets = Double.parseDouble(newExpression);
                    if (indOpenBracket > 2) {
                        if (cleanExpression.contains("sin") && cleanExpression.indexOf("sin") == indOpenBracket - 3) {
                            final String sin = fourDigitFormat.format(StrictMath.sin(Math.toRadians(numberInBrackets)));
                            newExpression = cleanExpression.substring(0, indOpenBracket - 3) + sin + cleanExpression.substring(i + 1);
                            recurse(newExpression, countOperation + 1);
                            return;
                        }
                        if (cleanExpression.contains("cos") && cleanExpression.indexOf("cos") == indOpenBracket - 3) {
                            final String cos = fourDigitFormat.format(StrictMath.cos(Math.toRadians(numberInBrackets)));
                            newExpression = cleanExpression.substring(0, indOpenBracket - 3) + cos + cleanExpression.substring(i + 1);
                            recurse(newExpression, countOperation + 1);
                            return;
                        }
                        if (cleanExpression.contains("tan") && cleanExpression.indexOf("tan") == indOpenBracket - 3) {
                            final String tan = fourDigitFormat.format(StrictMath.tan(Math.toRadians(numberInBrackets)));
                            newExpression = cleanExpression.substring(0, indOpenBracket - 3) + tan + cleanExpression.substring(i + 1);
                            recurse(newExpression, countOperation + 1);
                            return;
                        }
                    }
                    newExpression = cleanExpression.substring(0, indOpenBracket) + newExpression + cleanExpression.substring(i + 1);
                    recurse(newExpression, countOperation);
                    return;
                }
            }
        }

        if (cleanExpression.matches(".*[+^/*].*") || (cleanExpression.contains("-") && cleanExpression.lastIndexOf('-') != 0)) {
            final String newExpression = calculateSimpleMathOperation(cleanExpression);
            recurse(newExpression, countOperation + 1);
            return;
        }

        final double result = Double.parseDouble(cleanExpression);
        System.out.print(twoDigitFormat.format(result) + ' ' + countOperation);
    }

    String calculateSimpleMathOperation(final String expression) {
        final Pattern COMPILE = Pattern.compile("[-+^/*]");
        final DecimalFormat fourDigitFormat = new DecimalFormat("#.####");
        fourDigitFormat.setRoundingMode(RoundingMode.HALF_UP);

        final String operation;
        final int operationPos;
        if (expression.contains("^")) {
            operation = "^";
            operationPos = expression.lastIndexOf(operation);
        } else if (expression.matches(".*[*/].*")) {
            final int indMultiplication = expression.indexOf('*');
            final int indDivision = expression.indexOf('/');

            if (indDivision > 0 && indMultiplication > 0) operation = indDivision < indMultiplication ? "/" : "*";
            else if (indDivision > 0) operation = "/";
            else operation = "*";

            operationPos = expression.indexOf(operation);
        } else {
            final int indAddition = expression.indexOf('+');
            final int indSubtraction = expression.indexOf('-', 1);

            if (indAddition > 0 && indSubtraction > 0) operation = indAddition < indSubtraction ? "+" : "-";
            else if (indAddition > 0) operation = "+";
            else operation = "-";

            operationPos = expression.indexOf(operation, 1);
        }

        final String leftSide = expression.substring(0, operationPos);
        final String[] leftSideNumbers = COMPILE.split(leftSide);
        String sLeftNumber = leftSideNumbers[leftSideNumbers.length - 1];
        final int indOfLeftNumber = expression.indexOf(sLeftNumber);
        if (indOfLeftNumber > 0 && expression.charAt(indOfLeftNumber - 1) == '-') {
            sLeftNumber = '-' + sLeftNumber;
        }
        final double leftNumber = Double.parseDouble(sLeftNumber);

        final String rightSide = expression.substring(operationPos + 1);
        final String[] rightSideNumbers = COMPILE.split(rightSide);
        final String sRightNumber = rightSideNumbers[0].isEmpty() ? '-' + rightSideNumbers[1] : rightSideNumbers[0];
        final double rightNumber = Double.parseDouble(sRightNumber);

        String result = "";
        switch (operation) {
            case "^":
                result = fourDigitFormat.format(StrictMath.pow(leftNumber, rightNumber));
                break;
            case "*":
                result = fourDigitFormat.format(leftNumber * rightNumber);
                break;
            case "/":
                result = fourDigitFormat.format(leftNumber / rightNumber);
                break;
            case "+":
                result = fourDigitFormat.format(leftNumber + rightNumber);
                break;
            case "-":
                result = fourDigitFormat.format(leftNumber - rightNumber);
                break;
        }
        if (leftNumber < 0 && expression.indexOf(sLeftNumber) > 0 && result.charAt(0) != '-') {
            result = '+' + result;
        }
        return expression.substring(0, operationPos - sLeftNumber.length()) + result + expression.substring(operationPos + sRightNumber.length() + 1);
    }

    int countNegativeNumbers(final String expression) {
        int counter = 0;
        if (expression.indexOf('-') == 0)
            counter++;
        counter += expression.split("\\(-").length - 1;
        return counter;
    }

    public Solution() {
        //don't delete
    }
}

