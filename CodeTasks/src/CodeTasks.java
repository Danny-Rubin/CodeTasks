public class CodeTasks {

    /*
    1. Write a program to take two numbers as input and print their difference if the first number is
    greater than the second number otherwise print their sum.

    Input: two integers N1, N2

    Output: a single line containing the difference of 2 numbers (N1−N2) if the first number is greater than
    the second number otherwise output their sum (N1+N2).

    Example: 25, 40 – result 65
     */

    public static void sum_or_diff(int a, int b){
        if (a > b){
            System.out.println(a-b);
        }
        else{
            System.out.println(a+b);
        }
        return;
    }

    /*
    2. Write a program to obtain a number N and increment its value by 1 if the number is divisible by 4
    otherwise decrement its value by 1.

    Input : integer N

    Example: 10 – result 9
     */

    public static void inc_or_dec(int a){
        if(a%4 == 0){
            System.out.println(a + 1);
        }
        else{
            System.out.println(a - 1);
        }
    }

    /*
    3. Gnome buys a lottery ticket with a four-digit code associated with it. He thinks that digit 5 is
    his lucky digit and brings him good luck.

    Gnome will win some amount in the lottery if at least one of the digits of the lottery ticket is 5.

    Given three digits N1, N2, N3, and N4 of the lottery ticket, tell whether Gnome wins something or not?

    Input: four integers N1, N2, N3, N4

    Example: 2 4  6 8 – result “no”, 4 5 6 7 – result “yes”

    ## Assumption : in line 49 "three" is supposed to be "four"
     */

    public static void is_gnome_lucky(int a, int b, int c, int d){
        String result = "no";
        if (a == 5 ||b == 5 ||c == 5 ||d == 5){
            result = "yes";
        }
        System.out.println(result);
        return;
    }


    public static void main(String[] args) {
        sum_or_diff(25, 40);
        System.out.println();

        inc_or_dec(10);
        System.out.println();

        is_gnome_lucky(2, 4, 6, 8);
        System.out.println();

        is_gnome_lucky(4, 5, 6, 7);

    }
}
