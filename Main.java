import java.io.IOException;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) throws IOException {
        System.out.println("Введите выражение: ");
        Scanner vvod = new Scanner(System.in);
        String stVvod = vvod.nextLine();
        String finaly = calc(stVvod);
        System.out.println("Ответ: ");
        System.out.println(finaly);


    }
    public static String calc(String input) throws IOException {

        String[] akameStVvod = input.split(" ");

        String oneX = akameStVvod[0];
        String twoX = akameStVvod[2];
        String operator = akameStVvod[1];

        int firstNum = 0, twoNum = 0, intOtvet = 0;

        switch (oneX) {
            case "1", "I" -> firstNum = 1;
            case "2", "II" -> firstNum = 2;
            case "3", "III" -> firstNum = 3;
            case "4", "IV" -> firstNum = 4;
            case "5", "V" -> firstNum = 5;
            case "6", "VI" -> firstNum = 6;
            case "7", "VII" -> firstNum = 7;
            case "8", "VIII" -> firstNum = 8;
            case "9", "IX" -> firstNum = 9;
            case "10", "X" -> firstNum = 10;
            default -> System.out.println("Диапазон чисел от 1 до 10 включительно!");
        }

        switch (twoX) {
            case "1", "I" -> twoNum = 1;
            case "2", "II" -> twoNum = 2;
            case "3", "III" -> twoNum = 3;
            case "4", "IV" -> twoNum = 4;
            case "5", "V" -> twoNum = 5;
            case "6", "VI" -> twoNum = 6;
            case "7", "VII" -> twoNum = 7;
            case "8", "VIII" -> twoNum = 8;
            case "9", "IX" -> twoNum = 9;
            case "10", "X" -> twoNum = 10;
            default -> throw new IOException();
        }
        int predOtvet;
        String stPredOtvet;
        switch (operator) {
            case "-" -> intOtvet = firstNum - twoNum;
            case "+" -> intOtvet = firstNum + twoNum;
            case "*" -> intOtvet = firstNum * twoNum;
            case "/" -> intOtvet = firstNum / twoNum;
            default -> throw new IOException();
        }

        String[] araNum = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] romNum = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};


        int romIndex = intOtvet - 1;
        if ( intOtvet <= 0) {
            romIndex = 1;
        }else{
            romIndex = intOtvet - 1;
        }
        int oneXIndex = firstNum - 1;
        int twoXIndex = twoNum - 1;

        String stOtvetRom = String.valueOf(romNumber.values()[romIndex]);
        String stOtvetAra = Integer.toString(intOtvet);
        String stOtvet = "Integer.toString(intOtvet)";

        if (romNum[oneXIndex].equals(oneX)){
            if (romNum[twoXIndex].equals(twoX)) {
                if (intOtvet>0){
                    stOtvet = stOtvetRom;
                }else {
                    System.out.println("В римской системе нет отрицательных чисел");
                    throw new IOException();
                }
            }else {
                System.out.println("Калькулятор проводит вычисления типа: римские числа +-/* римские числа " +
                        "и арабские числа +-/* арабские числа1");
                throw new IOException();
            }
        } else if (araNum[oneXIndex].equals(oneX)) {
            if (araNum[twoXIndex].equals(twoX)) {
                if (intOtvet> -1000) {
                    stOtvet = stOtvetAra;
                }
            }else {
                System.out.println("Калькулятор проводит вычисления типа: римские числа +-/* римские числа " +
                        "и арабские числа +-/* арабские числа2");
                throw new IOException();
            }
        }else {
            System.out.println("Калькулятор проводит вычисления типа: римские числа +-/* римские числа " +
                    "и арабские числа +-/* арабские числа3");
            throw new IOException();
        }


        return stOtvet;
    }


}


