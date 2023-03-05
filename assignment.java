
// you can run my program simply by loading it as normal and state the sal file name. eg "test1.sal" .

import java.io.File;
import java.util.Scanner;
import java.lang.StringBuilder;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.lang.Math;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class assignment {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner1 = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(10000);
        int count = 0;
        int nthLine2nd = 2; // line number
        int nthLine3rd = 3; // line number
        int nthLine4th = 4; // line number
        String Str = new String("1 2 3 4 5 6 7 8 9");
        String xValue = "";
        String yValue = "";
        String sumValue = "";
        if (scanner1.hasNextLine()) {
            String filename = scanner1.nextLine();

            Scanner fileContent = new Scanner(new File(filename));

            while (fileContent.hasNextLine()) {

                int regCount = 0;

                String line = fileContent.nextLine();

                if (line.equals("     x") || line.equals("    x") || line.equals("   x") || line.equals("  x")
                        || line.contains("      x")) {
                    fileContent.next();

                }

                if (line.contains(" ADD")) {
                    stringBuilder.append("0000");
                }

                if (line.contains(" SUB")) {
                    stringBuilder.append("0001");
                }

                if (line.endsWith(" OR")) {
                    stringBuilder.append("0011");
                }

                if (line.contains(" JMP")) {
                    stringBuilder.append("0100");
                    stringBuilder.append("000");
                }

                if (line.contains(" JGT")) {
                    stringBuilder.append("0101");
                }

                if (line.contains(" JLT")) {
                    stringBuilder.append("0110");
                }

                if (line.contains(" JEQ")) {
                    stringBuilder.append("0111");
                }

                if (line.contains(" INC")) {
                    stringBuilder.append("1001");

                    if (line.contains(" r0") && regCount == 0) {
                        stringBuilder.append("000");
                        regCount++;
                    }

                    if (line.contains(" r1") && regCount == 0) {
                        stringBuilder.append("001");
                        regCount++;
                    }

                    if (line.contains(" r2") && regCount == 0) {
                        stringBuilder.append("010");
                        regCount++;
                    }
                    if (line.contains(" r3") && regCount == 0) {
                        stringBuilder.append("011");
                        regCount++;
                    }

                    if (line.contains(" r4") && regCount == 0) {
                        stringBuilder.append("100");
                        regCount++;
                    }

                    if (line.contains(" r5") && regCount == 0) {
                        stringBuilder.append("101");
                        regCount++;
                    }

                    if (line.contains(" r6") && regCount == 0) {
                        stringBuilder.append("101");
                        regCount++;
                    }

                    if (line.contains(" ,r7") && regCount == 0) {
                        stringBuilder.append("111");
                        regCount++;
                    }

                    stringBuilder.append("0");
                    stringBuilder.append("11");
                    stringBuilder.append("000000");
                    stringBuilder.append("\n");
                }

                if (line.contains(" DEC")) {
                    stringBuilder.append("1010");

                    if (line.contains(" r0") && regCount == 0) {
                        stringBuilder.append("000");
                        regCount++;
                    }

                    if (line.contains(" r1") && regCount == 0) {
                        stringBuilder.append("001");
                        regCount++;
                    }

                    if (line.contains(" r2") && regCount == 0) {
                        stringBuilder.append("010");
                        regCount++;
                    }
                    if (line.contains(" r3") && regCount == 0) {
                        stringBuilder.append("011");
                        regCount++;
                    }

                    if (line.contains(" r4") && regCount == 0) {
                        stringBuilder.append("100");
                        regCount++;
                    }

                    if (line.contains(" r5") && regCount == 0) {
                        stringBuilder.append("101");
                        regCount++;
                    }

                    if (line.contains(" r6") && regCount == 0) {
                        stringBuilder.append("101");
                        regCount++;
                    }

                    if (line.contains(" r7") && regCount == 0) {
                        stringBuilder.append("111");
                        regCount++;
                    }
                    stringBuilder.append("0");
                    stringBuilder.append("11");
                    stringBuilder.append("000000");
                    stringBuilder.append("\n");
                }

                if (line.contains(" NOT")) {
                    stringBuilder.append("1010");

                    if (line.contains(" r0") && regCount == 0) {
                        stringBuilder.append("000");
                        regCount++;
                    }
                    if (line.contains(" r1") && regCount == 0) {
                        stringBuilder.append("001");
                        regCount++;
                    }

                    if (line.contains(" r2") && regCount == 0) {
                        stringBuilder.append("010");
                        regCount++;
                    }
                    if (line.contains(" r3") && regCount == 0) {
                        stringBuilder.append("011");
                        regCount++;
                    }

                    if (line.contains(" r4") && regCount == 0) {
                        stringBuilder.append("100");
                        regCount++;
                    }

                    if (line.contains(" r5") && regCount == 0) {
                        stringBuilder.append("101");
                        regCount++;
                    }

                    if (line.contains(" r6") && regCount == 0) {
                        stringBuilder.append("101");
                        regCount++;
                    }

                    if (line.contains(" ,r7") && regCount == 0) {
                        stringBuilder.append("111");
                        regCount++;
                    }
                    stringBuilder.append("0");
                    stringBuilder.append("11");
                    stringBuilder.append("000000");
                    stringBuilder.append("\n");
                }

                if (line.contains(" LOAD")) {
                    stringBuilder.append("1011");

                }

                if (line.contains(" STORE")) {
                    stringBuilder.append("1101");

                }

                if (line.contains(" r0,") && regCount == 0 && !(line.endsWith("r0")) && !(line.endsWith("r1"))
                        && !(line.endsWith("r2")) && !(line.endsWith("r3")) && !(line.endsWith("r4"))
                        && !(line.endsWith("r5")) && !(line.endsWith("r6")) && !(line.endsWith("r7"))) {
                    stringBuilder.append("000");
                    regCount++;
                }

                if (line.contains(" r0") && regCount == 0) {
                    stringBuilder.append("000");
                    regCount++;

                }

                if (line.contains(" r1") && regCount == 0) {
                    stringBuilder.append("001");
                    regCount++;

                }

                if (line.contains(" r2") && regCount == 0) {
                    stringBuilder.append("010");
                    regCount++;
                }
                if (line.contains(" r3") && regCount == 0) {
                    stringBuilder.append("011");
                    regCount++;
                }

                if (line.contains(" r4") && regCount == 0) {
                    stringBuilder.append("100");
                    regCount++;
                }

                if (line.contains(" r5") && regCount == 0) {
                    stringBuilder.append("101");
                    regCount++;
                }

                if (line.contains(" r6") && regCount == 0) {
                    stringBuilder.append("101");
                    regCount++;
                }

                if (line.contains(" r7") && regCount == 0) {
                    stringBuilder.append("111");
                    regCount++;
                }

                if (line.endsWith(", r0")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000000");
                    stringBuilder.append("\n");
                    regCount++;

                }

                if (line.endsWith(", r1")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000001");
                    stringBuilder.append("\n");
                    regCount++;

                }

                if (line.endsWith(", r2")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000010");
                    stringBuilder.append("\n");
                    regCount++;
                }
                if (line.endsWith(", r3")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000011");
                    stringBuilder.append("\n");
                    regCount++;
                }

                if (line.endsWith(", r4")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000100");
                    stringBuilder.append("\n");
                    regCount++;
                }

                if (line.endsWith(", r5")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000101");
                    stringBuilder.append("\n");
                    regCount++;
                }

                if (line.endsWith(", r6")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000110");
                    stringBuilder.append("\n");
                    regCount++;
                }

                if (line.endsWith(", r7")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000111");
                    stringBuilder.append("\n");
                    regCount++;
                }

                if (line.contains("r0, x")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000000");
                    stringBuilder.append("\n");
                    regCount++;

                }

                if (line.contains("r1, x")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000000");
                    stringBuilder.append("\n");
                    regCount++;

                }

                if (line.contains("r2, x")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000000");
                    stringBuilder.append("\n");
                    regCount++;
                }
                if (line.contains("r3, x")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000000");
                    stringBuilder.append("\n");
                    regCount++;
                }

                if (line.contains("r4, x")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000000");
                    stringBuilder.append("\n");
                    regCount++;
                }

                if (line.contains("r5, x")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000000");
                    stringBuilder.append("\n");
                    regCount++;
                }

                if (line.contains("r6, x")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000000");
                    stringBuilder.append("\n");
                    regCount++;
                }

                if (line.contains("r7, x")) {
                    stringBuilder.append("0");
                    stringBuilder.append("00");
                    stringBuilder.append("000000");
                    stringBuilder.append("\n");
                    regCount++;
                }

                if (line.endsWith("0") || line.endsWith("1") || line.endsWith("2") || line.endsWith("3")
                        || line.endsWith("4") || line.endsWith("5") || line.endsWith("6") || line.endsWith("7")
                        || line.endsWith("8")
                        || line.endsWith("9") && !line.contains("#") && !line.endsWith("r0") && !line.endsWith("r1")
                                && !line.endsWith("r4") && !line.endsWith("r5")
                                && !line.endsWith("r6") && !line.endsWith("r7")) {

                    for (int i = 0; i < 4194303; i++) {
                        String num5 = Integer.toString(i);
                        if (line.contains(num5) && !line.contains("#") && !line.endsWith("r0") && !line.endsWith("r1")
                                && !line.endsWith("r4") && !line.endsWith("r5")
                                && !line.endsWith("r6") && !line.endsWith("r7")) {
                            String[] parts5 = line.split(" ");
                            String lastWord6 = parts5[parts5.length - 1];
                            System.out.println(lastWord6);
                            int foo23 = Integer.parseInt(lastWord6);
                            String foo8 = Integer.toBinaryString(foo23);

                            if (foo8.length() == 1) {

                                String foo29 = "00000" + foo8;
                                stringBuilder.append("0");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 2) {

                                String foo29 = "0000" + foo8;
                                stringBuilder.append("0");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 3) {

                                String foo29 = "000" + foo8;
                                stringBuilder.append("0");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 4) {

                                String foo29 = "00" + foo8;
                                stringBuilder.append("0");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 5) {

                                String foo29 = "0" + foo8;
                                stringBuilder.append("0");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 6) {
                                String foo29 = foo8;
                                stringBuilder.append("0");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");

                            }

                            if (foo8.length() == 7) {

                                String foo29 = "000000000000000" + foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 8) {

                                String foo29 = "00000000000000" + foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 9) {

                                String foo29 = "0000000000000" + foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 10) {

                                String foo29 = "000000000000" + foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 11) {

                                String foo29 = "00000000000" + foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 12) {

                                String foo29 = "0000000000" + foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 13) {

                                String foo29 = "000000000" + foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 14) {

                                String foo29 = "00000000" + foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 15) {

                                String foo29 = "0000000" + foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 16) {

                                String foo29 = "000000" + foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 17) {

                                String foo29 = "00000" + foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 18) {

                                String foo29 = "0000" + foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 19) {

                                String foo29 = "000" + foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 20) {

                                String foo29 = "00" + foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                            if (foo8.length() == 21) {

                                String foo29 = "0" + foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }

                            if (foo8.length() == 22) {

                                String foo29 = foo8;
                                stringBuilder.append("1");
                                stringBuilder.append("10");
                                stringBuilder.append(foo29);
                                stringBuilder.append("\n");
                            }
                        }
                    }
                }

                if (line.contains(" 0")) {
                    stringBuilder.append("0");
                    stringBuilder.append("10");

                }
                if (line.contains(" 1")) {
                    stringBuilder.append("0");
                    stringBuilder.append("10");

                }
                if (line.contains(" 2")) {
                    stringBuilder.append("0");
                    stringBuilder.append("10");

                }
                if (line.contains(" 3")) {
                    stringBuilder.append("0");
                    stringBuilder.append("10");

                }
                if (line.contains(" 4")) {
                    stringBuilder.append("0");
                    stringBuilder.append("10");

                }
                if (line.contains(" 5")) {
                    stringBuilder.append("0");
                    stringBuilder.append("10");

                }
                if (line.contains(" 6")) {
                    stringBuilder.append("0");
                    stringBuilder.append("10");

                }
                if (line.contains(" 7")) {
                    stringBuilder.append("0");
                    stringBuilder.append("10");

                }
                if (line.contains(" 8")) {
                    stringBuilder.append("0");
                    stringBuilder.append("10");

                }
                if (line.contains(" 9")) {
                    stringBuilder.append("0");
                    stringBuilder.append("10");

                }

                if (line.contains("#")) {

                    for (int i = 0; i < 64; i++) {
                        String num = Integer.toString(i);

                        if (line.contains(" #" + num)) {
                            stringBuilder.append("0");
                            stringBuilder.append("01");

                            String[] parts = line.split(" ");
                            String lastWord = parts[parts.length - 1];
                            String lastWord1 = lastWord.replace("#", "");
                            int foo = Integer.parseInt(lastWord1);
                            String foo1 = Integer.toBinaryString(foo);
                            if (foo1.length() == 1) {

                                String foo2 = "00000" + foo1;
                                stringBuilder.append(foo2);
                                stringBuilder.append("\n");
                            }
                            if (foo1.length() == 2) {

                                String foo2 = "0000" + foo1;
                                stringBuilder.append(foo2);
                                stringBuilder.append("\n");
                            }
                            if (foo1.length() == 3) {

                                String foo2 = "000" + foo1;
                                stringBuilder.append(foo2);
                                stringBuilder.append("\n");
                            }
                            if (foo1.length() == 4) {

                                String foo2 = "00" + foo1;
                                stringBuilder.append(foo2);
                                stringBuilder.append("\n");
                            }
                            if (foo1.length() == 5) {

                                String foo2 = "0" + foo1;
                                stringBuilder.append(foo2);
                                stringBuilder.append("\n");
                            }

                        } else {
                            count++;
                        }
                    } // put this into one of the if statements could work but idk

                }

                if (count >= 64) {
                    System.out.println(count);
                    stringBuilder.append("1");
                    stringBuilder.append("01");

                    for (int i = 64; i < 4194303; i++) {
                        String num1 = Integer.toString(i);
                        if (line.contains(" #" + num1)) {

                            String[] parts1 = line.split(" ");
                            String lastWord2 = parts1[parts1.length - 1];
                            String lastWord3 = lastWord2.replace("#", "");
                            int foo22 = Integer.parseInt(lastWord3);
                            String foo3 = Integer.toBinaryString(foo22);

                            if (foo3.length() == 7) {

                                String foo4 = "000000000000000" + foo3;
                                stringBuilder.append(foo4);
                                stringBuilder.append("\n");
                            }
                            if (foo3.length() == 8) {

                                String foo4 = "00000000000000" + foo3;
                                stringBuilder.append(foo4);
                                stringBuilder.append("\n");
                            }
                            if (foo3.length() == 9) {

                                String foo4 = "0000000000000" + foo3;
                                stringBuilder.append(foo4);
                                stringBuilder.append("\n");
                            }
                            if (foo3.length() == 10) {

                                String foo4 = "000000000000" + foo3;
                                stringBuilder.append(foo4);
                                stringBuilder.append("\n");
                            }
                            if (foo3.length() == 11) {

                                String foo4 = "00000000000" + foo3;
                                stringBuilder.append(foo4);
                                stringBuilder.append("\n");
                            }
                            if (foo3.length() == 12) {

                                String foo4 = "0000000000" + foo3;
                                stringBuilder.append(foo4);
                                stringBuilder.append("\n");
                            }
                            if (foo3.length() == 13) {

                                String foo4 = "000000000" + foo3;
                                stringBuilder.append(foo4);
                                stringBuilder.append("\n");
                            }
                            if (foo3.length() == 14) {

                                String foo4 = "00000000" + foo3;
                                stringBuilder.append(foo4);
                                stringBuilder.append("\n");
                            }
                            if (foo3.length() == 15) {

                                String foo4 = "0000000" + foo3;
                                stringBuilder.append(foo4);
                                stringBuilder.append("\n");
                            }
                            if (foo3.length() == 16) {

                                String foo4 = "000000" + foo3;
                                stringBuilder.append(foo4);
                                stringBuilder.append("\n");
                            }
                            if (foo3.length() == 17) {

                                String foo4 = "00000" + foo3;
                                stringBuilder.append(foo4);
                                stringBuilder.append("\n");
                            }
                            if (foo3.length() == 18) {

                                String foo4 = "0000" + foo3;
                                stringBuilder.append(foo4);
                                stringBuilder.append("\n");
                            }
                            if (foo3.length() == 19) {

                                String foo4 = "000" + foo3;
                                stringBuilder.append(foo4);
                                stringBuilder.append("\n");
                            }
                            if (foo3.length() == 20) {

                                String foo4 = "00" + foo3;
                                stringBuilder.append(foo4);
                                stringBuilder.append("\n");
                            }
                            if (foo3.length() == 21) {

                                String foo4 = "0" + foo3;
                                stringBuilder.append(foo4);
                                stringBuilder.append("\n");
                            }

                        }

                        count = 0;
                    }

                    // if (line.contains("#1")) {
                    // stringBuilder.append("000001");
                    // }

                }

                String newString = stringBuilder.toString();

                try {
                    FileWriter myWriter = new FileWriter("result.bin");
                    myWriter.write(newString);
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
