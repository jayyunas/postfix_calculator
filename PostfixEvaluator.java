/*
*
*/
public class PostfixEvaluator {
    Stack numbers = new Stack();

    public int evaluatePostfix(String exp) {

        for(int i = 0; i < exp.length(); i++) {

            char j = exp.charAt(i);

            if(Character.isDigit(j))
                numbers.push(j - '0');
            else {
                int number1 = numbers.pop();
                int number2 = numbers.pop();

                if(j == '+')
                    numbers.push(number1 + number2);
                else if(j == '-')
                    numbers.push(number2 - number1);
                else if(j == '*')
                    numbers.push(number1 * number2);
                else
                    numbers.push(number2 / number1);
                }
            }
        return numbers.pop();
    }
}