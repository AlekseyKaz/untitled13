import java.util.Scanner;



public class Main {


    static Scanner sc = new Scanner (System.in);
    static char operation;
    static int number1;
    static int number2;
    static int result;

    public static void main(String[] args) throws Exception {
        calculated calculated = new calculated ( );
        convert convert = new convert ( );
        System.out.println ("введите значение");
        String in = sc.nextLine ( );
        char[] Char = new char[10];
        for (int i = 0; i < in.length ( ); i++) {
            Char[i] = in.charAt (i);
            if (Char[i] == '+') {
                operation = '+';
            }if (Char[i] == '-') {
                operation = '-';
            }if (Char[i] == '*') {
                operation = '*';
            }if (Char[i] == '/') {
                operation = '/';
            }
        }
        String chars = String.valueOf (Char);
        String[] l = in.split ("[+-/*]");
        String one = l[0];
        String two = l[1];
        String three = two.trim ( );
        RomeNumber rome = new RomeNumber ( );

        if( one.matches ("[^\\d]+") && two.matches ("[^\\d]+") ) {

            try {
                number1 = rome.romanNumber (one);
                number2 = rome.romanNumber (three);
            }catch (Exception e){
                e.printStackTrace ();
            }
            if (number1 < 0 || number2 < 0) {
                throw new IllegalArgumentException ("значение не может быть равно 0");

            } else {

                    result = calculated.calculated (number1, number2, operation);// иначе считаем
                    String resultRoman = convert.convertToRoman (result); // создается строка с результатом на римском и присваивается конвертор цифры в римскую
                    System.out.println (resultRoman);
                }

        } else {
              {
                try {
                    number1 = Integer.parseInt (one); // number 1 числовой оберткой конвертируется из строки с цифру
                    number2 = Integer.parseInt (three);
                    result = calculated.calculated (number1, number2, operation);
                }catch (numberException e){
                    e.printStackTrace ();
                }
                  System.out.print (result);
              }

        }
    }


}


