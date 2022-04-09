public class calculated {
    static int calculated(int num1, int num2, char operation) throws numberException {
        int result = 0;
        if (num1>10 | num2 >10){
            throw new numberException ("цифры должны быть до десяти");
        }
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:

        }


        return result;
    }

}


