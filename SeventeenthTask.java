/**
 * Напишите Java-программу для проверки является ли введенное число - числом Армстронга.
 * Прежде всего, нам нужно понять, что такое число Армстронга. Число Армстронга это число,
 * значение которого равно сумме цифр, из которых оно состоит, возведенных в степень,
 * равной количеству цифр в этом числе. Как пример - число 371:
 * 371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
 * Если у вас число четырехзначное:
 * 8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8 = 4096 + 16 + 0 + 4096 = 8208
 */

public class SeventeenthTask {
    public static void main(String[] args) {
        int y = 0;
        int x;
        int tempNum;
        int currentNum = 8208;
        tempNum = currentNum;

        while (currentNum>0){
            x = currentNum%10;
            currentNum=currentNum/10;
            y=y+(x*x*x*x);
        }
        if (tempNum==y){
            System.out.println("Armstrong");
        }else System.out.println("not Armstrong");
    }
}
