import java.util.Scanner;
public class Test3 {
	public static void main(String[] args) {
		  System.out.println("숫자 두개를 입력하세요.");
          Scanner input = new Scanner(System.in);
          double num1 = input.nextDouble();
          double num2 = input.nextDouble();
          System.out.println("연산자를 입력하세요.");
          String operator = input.next();
          if (operator.equals("+")) {
                 System.out.println("결과는 " + num1 + " + " + num2 + " = " + (num1 + num2) + " 입니다.");
          } else if (operator.equals("-")) {
                 System.out.println("결과는 " + num1 + " - " + num2 + " = " + (num1 - num2) + " 입니다.");
          } else if (operator.equals("*")) {
                 System.out.println("결과는 " + num1 + " * " + num2 + " = " + (num1 * num2) + " 입니다.");
          } else if (operator.equals("/")) {
                 System.out.println("결과는 " + num1 + " / " + num2 + " = " + (num1 / num2) + " 입니다.");
          } else {
                 System.out.println("잘못 입력하셨습니다. +, -, *, / 중 하나를 입력하세요.");
          }
    }
}