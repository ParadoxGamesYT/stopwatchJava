import java.util.Random;
import java.util.Scanner;


public class stopWatch {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Time t = new Time(sc.nextLong());
        t.printTime();

    }
    protected static class Time {
        int h = 0;
        int m = 0;
        int s = 0;
        public Time(long sec) {
            if(sec < 60l) {
                s = (int)sec;
            } else if(sec < 60l * 60l) {
                m = (int)(sec / (60) );
                sec -= m * 60;
                s = (int)(sec);
            } else {
                h = (int)(sec / (60 * 60));
                sec -= h *(60 * 60);
                m = (int)(sec / (60) );
                        sec -= m * 60;
                s = (int)(sec);
            }
        }
        public void printTime(){
            System.out.println((h < 10 ? "0" + h : h ) + ":" + (m < 10 ? "0" + m : m) + ":" + (s < 10 ? "0" + s : s ));
        }
    }
}
