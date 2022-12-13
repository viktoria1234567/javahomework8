// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя
// ввод данных. В этом задании не используем try catch. Пишем регулярное выражение и используем на строке метод matches.

package program;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String input = iScanner.nextLine();
        String floatPattern = "([+-]?(\\d+\\.)?\\d+)";
        while (!input.matches(floatPattern)) {
            System.out.println("Неверный формат" + input);
            input = iScanner.nextLine();
        }

        float num = Float.parseFloat(input);
        System.out.println(num + 1);
        iScanner.close();
    }
}
