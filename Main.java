import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scunner = new Scanner(System.in);
        System.out.println( "1)Выводит все элементы массива.\n" +
                "2)Выводит все элементы массива в обратном порядке.\n" +
                "3)Выводит чётные элементы массива.\n" +
                "4)Выводит нечётные элементы массива.\n" +
                "5)Выводит все элементы массива пока не встретится элемент -1.\n" +
                "6)В массив добавляется элемент в конец.\n" +
                "7)В массив добавляется элемент в начало.\n" +
                "8)В массив добавляется элемент в позицию.\n" +
                "9)Из массива удаляется элемент с конца.\n" +
                "10)Из массива удаляется элемент с начала.\n" +
                "11)Из массива удаляется элемент с позиции.\n" +
                "12)Создание массива из двух массивов. В итоговом массиве должны быть элементы первого и второго массива.");
        int choose = scunner.nextInt();
        if (choose==1){
            first();
        }else if (choose==2){
            second();
        }else if(choose==3){
            third();
        }else if(choose == 4){
            fourth();
        }
        else if(choose==5){
            fifth();
        }
        else if(choose==6){
            sixth();
        }else if(choose==7) {
            seventh();
        }else if(choose==8){
            eighth();
        }else if(choose==9){
            nineth();
        }else if (choose==10){
            tenth();
        }else if (choose==11){
            eleventh();
        }else if(choose==12){
            twelth();
        }
    }
    static void first()
    {
        int [] k = {2, 18, 16, 99, 1, 12345};
        for (int j : k) {
            System.out.println(j);
        }
    }
    static void second()
    {
        int [] k = {2, 18, 16, 99, 1, 12345};
        for(int i = k.length; i > 0;i=i-1)
        {
            System.out.println(k[i-1]);
        }
    }
    static void third()
    {
        int [] k = {2,31, 18, 16, 99, 1, 12345};
        for(int i=0; i< k.length;i++)
        {
            if(i %2 == 0)
            {
                System.out.println(k[i]);
            }
        }

    }
    static void fourth()
    {
        int [] k = {2,31, 18, 16, 99, 1, 12345};
        for(int i=0; i< k.length;i++)
        {
            if (i % 2 == 0) {
            } else {
                System.out.println(k[i]);
            }
        }
    }
    static void fifth()
    {
        int [] k = {2,31, 18, 16, 99, -1, 12345};
        for (int j : k) {
            if (j == -1) {
                break;
            } else {
                System.out.println(j);
            }
        }
    }
    //С этого момента я начал списывать
    /*                                  ⡜⠀
⠀  ⠀⠘⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀          ⠀⡔⠁⠀⠀
⠀⠀⠀   ⠑⡀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀         ⣀⠴⠁⠀⠀
⠀⠀⠀⠀    ⠈⠢⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⣀⠴⠊⠀⠀⠀⠀⠀
⠀⠀⠀⠀    ⠀⠀⠀⢸⠀⠀⠀⢀⣀⣀⣀⣀⣀⡀⠤⠄⠤⠄⠒⠈⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀    ⠀⠀⠀⠘⣀⠄⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠔⠒⠒⠒⠒⠒⠢⠤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⡰⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⢄⡀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⡸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠙⠄⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⢀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃⠀⢠⠂⠀⠀⠘⡄⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠈⢤⡀⢂⠀⢨⠀⢀⡠⠈⢣⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⢀⢀⡖⠒⠶⠤⠭⢽⣟⣗⠲⠖⠺⣖⣴⣆⡤⠤⠤⠼⡄⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠘⡈⠃⠀⠀⠀⠘⣺⡟⢻⠻⡆⠀⡏⠀⡸⣿⢿⢞⠄⡇⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⢣⡀⠤⡀⡀⡔⠉⣏⡿⠛⠓⠊⠁⠀⢎⠛⡗⡗⢳⡏⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⢱⠀⠨⡇⠃⠀⢻⠁⡔⢡⠒⢀⠀⠀⡅⢹⣿⢨⠇⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⢸⠀⠠⢼⠀⠀⡎⡜⠒⢀⠭⡖⡤⢭⣱⢸⢙⠆⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⡸⠀⠀⠸⢁⡀⠿⠈⠂⣿⣿⣿⣿⣿⡏⡍⡏⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⢀⠇⠀⠀⠀⠀⠸⢢⣫⢀⠘⣿⣿⡿⠏⣼⡏⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⣀⣠⠊⠀⣀⠎⠁⠀⠀⠀⠙⠳⢴⡦⡴⢶⣞⣁⣀⣀⡀⠀⠀⠀⠀⠀
⠀⠐⠒⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⢀⠤⠀⠀⠀⠀⠀⠀⠀⠈⠉⠀⠀⠀
     */
    static void sixth()
    {
        double[] k = {2,3.1, 1.8, 1.6, 9.9, 1, 123.45};
        Scanner scunner = new Scanner(System.in);
        k = Arrays.copyOf(k,k.length + 1);
        System.out.println("Введите число");
        double number = scunner.nextDouble();
        k[k.length-1] = number;
        System.out.println("Новый массив");
        for (double v : k) {
            System.out.println(v);
        }
    }
    static void seventh()
    {
        double[] k = {2,3.1, 1.8, 1.6, 9.9, 1, 123.45};
        Scanner scunner = new Scanner(System.in);
        System.out.println("Введите число");
        double number = scunner.nextDouble();
        k = Arrays.copyOf(k,k.length + 1);
        double [] k2;
        k2 = Arrays.copyOf(k,k.length);
        for (int i = 1;i < k.length;i++)
        {
            k2[k2.length-i] = k[k.length-i-1];
        }
        k2[0] = number;
        for (double v : k2) {
            System.out.println(v);
        }

    }
    static void eighth()
    {

        double[] k = {2,3.1, 1.8, 1.6, 9.9, 1, 123.45};
        Scanner scunner = new Scanner(System.in);
        System.out.println("Введите порядковый номер элемента массива");
        int index = scunner.nextInt();
        System.out.println("Введите число");
        double number = scunner.nextDouble();
        double [] k2 ;
        k = Arrays.copyOf(k,k.length + 1);
        k2 = Arrays.copyOf(k,k.length);
        if (k.length - 1 - index >= 0) System.arraycopy(k, index, k2, index + 1, k.length - 1 - index);
        k2[index] = number;
        for (double v : k2) {
            System.out.println(v);
        }
    }
    static void nineth()
    {
        double[] k = {2,3.1, 1.8, 1.6, 9.9, 1, 123.45};
        k = Arrays.copyOf(k,k.length - 1);
        for (double v : k) {
            System.out.println(v);
        }
    }
    static void tenth()
    {
        double[] k = {2,3.1, 1.8, 1.6, 9.9, 1, 123.45};
        double [] k2;
        System.out.println("old");
        for (double v : k) {
            System.out.println(v);
        }
        k2 = Arrays.copyOf(k,k.length-1);
        for (int i = k.length-1;i >=1;i--)
        {
            k2[k2.length-i] = k[k.length-i];
        }
        System.out.println("New");
        for (double v : k2) {
            System.out.println(v);
        }
    }
    static void eleventh()
    {
        double[] k = {2,3.1, 1.8, 1.6, 9.9, 1, 123.45};
        Scanner scanne = new Scanner(System.in);
        System.out.println("Введите число");
        int index = scanne.nextInt();
        index--;
        double [] k2;
        k2 = Arrays.copyOf(k,k.length-1);
        for(int i = 0;i < k.length;i++)
        {
            if (i < index+1)
            {
                k2[i] = k[i];
            }
            else
            {
                k2[i-1] = k[i];
            }
        }
        System.out.println("Новый массив");
        for (double v : k2) {
            System.out.println(v);
        }
    }
    static void twelth()
    {
        double [] k2 = {1,2,3,4,5,6,7};
        double[] k = {2,3.1, 1.8, 1.6, 9.9, 1, 123.45};
        double[] summ;
        summ = new double[k.length + k2.length];
        System.arraycopy(k, 0, summ, 0, k2.length);
        System.arraycopy(k2, 0, summ, k.length, k2.length);

        for (double v : summ) {
            System.out.println(v);
        }
    }
}