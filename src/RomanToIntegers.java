
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
class Solution {

    public int romanToInt(String s) {
        int sum = 0;
        int j;

        String valueOf ="";
        String roman = "";
        String input = s;

        for (int i = 0; i < input.length(); i++) {
            roman = String.valueOf(input.charAt(i));
            if (i == 0){
                j = 0;
            }else{
                j = 1;
            }
            valueOf = String.valueOf(input.charAt(i-j));
            if (roman.equals("M")) {
                if (valueOf.equals("C")) {
                    sum += 800;
                } else {
                    sum += 1000;
                }
            } else if (roman.equals("D")) {
                if (valueOf.equals("C")) {
                    sum += 300;
                } else {
                    sum += 500;
                }

            } else if (roman.equals("C")){
                if (valueOf.equals("X")){
                    sum += 80;
                } else {
                    sum += 100;
                }
            } else if (roman.equals("L")){
                if (valueOf.equals("X")){
                    sum += 30;
                } else {sum+=50;}
            } else if (roman.equals("X")){
                if (valueOf.equals("I")){
                    sum += 8;
                }else {sum+= 10;}
            } else if (roman.equals("V")){
                if (valueOf.equals("I")){
                    sum += 3;
                }else{sum+=5;}
            } else if (roman.equals("I")){
                sum += 1;
            }
        }
        return sum;
    }
}

public class RomanToIntegers{
    private static String[] strings = {"CCCXVIII", "DCXCII", "XLV", "CLXVIII"};

    public static void main(String[] args) {

            Solution solution1 = new Solution();
            int r1 = solution1.romanToInt(strings[0]);

            Solution solution2 = new Solution();
            int r2 = solution2.romanToInt(strings[1]);


            Solution solution3 = new Solution();
            int r3 = solution3.romanToInt(strings[2]);

            Solution solution4 = new Solution();
            int r4 = solution4.romanToInt(strings[3]);

            System.out.println(r1+"\n"+r2+"\n"+r3+"\n"+r4+"\n");
    }
}


