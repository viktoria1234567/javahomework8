// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя. (try быть не должно)

package program;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String input = iScanner.next();
        if (input.isEmpty()) {
            iScanner.close();
            throw new RuntimeException("Ввод не должен быть пустым");
        }
        System.out.println(input);
    }
}