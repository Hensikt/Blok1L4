import java.awt.*;
import java.util.*;

public class Practicum3
{

    public static void main(String[] args)
    {
        int[] chunkList = new int[5];

        chunkList[0] = 123;
        chunkList[1] = 69;
        chunkList[2] = 420;
        chunkList[3] = 999;
        chunkList[4] = 666;

        int[] getallenReeks = { 4, 874, 129, 1234, 812904 };

        System.out.println( Arrays.toString(getallenReeks) );

        getallenReeks = Arrays.copyOf(getallenReeks, getallenReeks.length + 1);

        Scanner scan = new Scanner(System.in);

        getallenReeks[getallenReeks.length - 1] = scan.nextInt();

        System.out.println( Arrays.toString(getallenReeks) );

    }
}
