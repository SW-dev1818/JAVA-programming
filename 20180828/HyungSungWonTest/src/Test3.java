import java.util.Scanner;
public class Test3 {
	public static void main(String[] args) {
		  System.out.println("���� �ΰ��� �Է��ϼ���.");
          Scanner input = new Scanner(System.in);
          double num1 = input.nextDouble();
          double num2 = input.nextDouble();
          System.out.println("�����ڸ� �Է��ϼ���.");
          String operator = input.next();
          if (operator.equals("+")) {
                 System.out.println("����� " + num1 + " + " + num2 + " = " + (num1 + num2) + " �Դϴ�.");
          } else if (operator.equals("-")) {
                 System.out.println("����� " + num1 + " - " + num2 + " = " + (num1 - num2) + " �Դϴ�.");
          } else if (operator.equals("*")) {
                 System.out.println("����� " + num1 + " * " + num2 + " = " + (num1 * num2) + " �Դϴ�.");
          } else if (operator.equals("/")) {
                 System.out.println("����� " + num1 + " / " + num2 + " = " + (num1 / num2) + " �Դϴ�.");
          } else {
                 System.out.println("�߸� �Է��ϼ̽��ϴ�. +, -, *, / �� �ϳ��� �Է��ϼ���.");
          }
    }
}