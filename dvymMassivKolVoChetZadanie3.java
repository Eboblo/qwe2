import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    //Создание двумерного массива забитым рандомами
	    Scanner in = new Scanner(System.in);
		System.out.println("Напишите размерность двумерного массива: ");
		int x = in.nextInt();
		int y = in.nextInt();
		int a = 0;
		int b = 10;
		int[][] massiv  = new int[x][y];
		for (int i = 0; i < x; i++)
		{
		    for (int j = 0; j < x; j++)
		    {
		         massiv[i][j] = a + (int) (Math.random() * b);
		    }
		}
		 int q = 0;
		//Вывод начального двумерного массива
		System.out.println("Изначальный двумерный массив:");
		for (int i = 0; i < x; i++)
		{
		    for (int j = 0; j < x; j++)
		    {
		         System.out.print(" " + massiv[i][j]);
		    }
		         System.out.println();
    	}
    	for (int i = 0; i < 1; i++)
    	{
		    for (int j = 0; j < x; j++)
		    {
		        if (massiv[i][j] % 2 == 0)
		        {
		            q++;
		        }
		    }
    	} 
    	System.out.println("Кол-во четных чисел в первой строке:" + q);
	}
}