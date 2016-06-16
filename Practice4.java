import java.io.BufferedReader;
import java.io.FileWriter;
import java.math.*;
import java.util.regex.*;
import java.util.*;
import java.text.*;

/**
 * Created by Min on 16/06/2016.
 */
public class Practice4 {
    static String compute(String instructions ){
        int[] loaded=new int [10];
        int cursor=0;
        for (int i=0; i<instructions.length(); i++){
            char c=instructions.charAt(i);
            switch (c) {
                case 'P': cursor=0;
                     break;
                case 'M': cursor+=1;
                    if (cursor>9) cursor=9;
                    break;
                case 'L':
                    if (loaded[cursor]<15) {
                        loaded[cursor]++;
                        cursor=0;
                    }
                    break;
            }
        }
        StringBuffer buf=new StringBuffer();
        for (int i=0; i<10; i++ ) {
            buf.append(Integer.toHexString(loaded[i]).toUpperCase());
        }
        return buf.toString();
    }
    public static void main ( String[] args) throws Exception{
        /*
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String _instructions;
        try {
            _instructions = in.nextLine();
        }catch (Exception e){
            _instructions= null;
        }
        */
        String _instructions = new String("PMLPMMMLPMLPMML");
        _instructions = new String("PLPLPLPLPLPLPLPLPLPL");
        String res = compute(_instructions);
        /*
        bw.write(res);
        bw.newLine();
        bw.close();
        */
        System.out.println("Computed-"+res);
    }
}
