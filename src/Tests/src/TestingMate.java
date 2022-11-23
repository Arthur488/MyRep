package Tests.src;

public class TestingMate {

    public static void main(String[] args) {
        Example();
        String str = "4433555155566699999096667775553999999022227778188777999999"; //8s
        System.out.println("Input : " + str);
        char[] chars = Algorithms(str);
        System.out.print("Output: ");
        for (char elChar: chars) {
            System.out.print(elChar);
        }

    }

    public static void Example(){
        System.out.printf("%n-------------------------------------%n");
        System.out.printf("| %1s | %1s | %1s | %15s %n", "    1    ", "    2    ", "    3    ", "Example: ");
        System.out.printf("| %1s | %1s | %1s | %39s %n", "  (nxt)  ", "(a, b, c)", "(d, e, f)", "2 = a, 22 = b, 333 = f, 55555 = k");
        System.out.printf("------------------------------------- %41s %n", "221222 = bc, 44335551555666 = hello");
        System.out.printf("| %1s | %1s | %1s | %n", "    4    ", "    5    ", "    6    ");
        System.out.printf("| %1s | %1s | %1s | %n", "(g, h, i)", "(j, k, l)", "(m, n, 0)");
        System.out.printf("-------------------------------------%n");
        System.out.printf("| %1s | %1s | %1s | %n", "    7    ", "    8    ", "    9    ");
        System.out.printf("| %1s | %1s | %1s | %n", "(p,q,r,s)", "(t, u, v)", "(w,x,y,z)");
        System.out.printf("-------------------------------------%n");
    }


    public static char[] PhoneChars(int number, int counter, int parameter, char[] chars1){
        int ch;
//1112221333
                                         //    22227778188777999999
        //                                0      1     2    2    2    2        3    3    3       4    4    4       5    5    5
        char[][] chars = new char[][]  {{' '}, {35}, {'a', 'b', 'c', 'A'},  {'d', 'e', 'f'},  {'g', 'h', 'i'},  {'j', 'k', 'l'},
        //        6    6    6      7    7    7    7      8    8    8      9    9    9    9    9    9    9
                {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z', ',', '!', '?'} };
        if(counter > chars[number].length){
            ch = counter - chars[number].length;
            while (ch > chars[number].length){
                ch = ch - chars[number].length;
            }
        }
        else {
            ch = counter;
        }
        chars1[parameter] = chars[number][ch - 1];
        return chars1;
    }


    public static char[] Algorithms(String str){
        str += "#";
        int forSizeCounter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) != str.charAt(i + 1)){
                forSizeCounter++;
            }
            if(str.charAt(i) == 49){
                forSizeCounter--;
            }
        }

        int counter = 0, countFullToEachVar = 1;
        char ch;
        char[] chars = new char[20];
        int charToInt = 0;
        char[] chars2 = new char[forSizeCounter];
        int parameter = 0;

        for (int i = 0; i < str.length() - 1; i++){
            boolean first = str.charAt(i) == str.charAt(i+1);

            if(str.charAt(i + 1) != '1'){
                if(first){
                    if(counter == 0){
                        ch = str.charAt(i);
                        charToInt = Character.getNumericValue(ch);
                        counter++;
                        countFullToEachVar++;
                        continue;
                    }
                    ch = str.charAt(i + 1);
                    charToInt = Character.getNumericValue(ch);
                    countFullToEachVar++;
                }
                else{
                    chars = PhoneChars(charToInt, countFullToEachVar, parameter, chars2);
                    parameter++;
                    countFullToEachVar = 1;
                    ch = str.charAt(i + 1);
                    charToInt = Character.getNumericValue(ch);
                }
            }
        }
        return chars;
    }
}
