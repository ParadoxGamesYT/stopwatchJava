import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите Enter, чтобы начать секундомер...");
        scanner.nextLine();
        
        long startTime = System.currentTimeMillis();
        
        System.out.println("Секундомер запущен! Нажмите Enter, чтобы остановить...");
        scanner.nextLine();
        
        long endTime = System.currentTimeMillis();
        
        long elapsedTime = endTime - startTime;
        long seconds = elapsedTime / 1000;
        
        System.out.println("Прошло " + seconds + " секунд.");
    }
}
// Для компиляции можно использовать Launch4j