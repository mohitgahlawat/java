import java.util.Scanner;
public class rhombus {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int c;
        int c2;
        char ch;
        do {
            System.out.print("Input the number : ");
            int no = input.nextInt();  //Number of max alphabet from user
            c = 1;
            c2 = 1;
            ch = 'A';
            for (int i=1; i < (no*2); i++) 
            {
                for (int spc=no-c2; spc>0; spc--)   
                {
                    System.out.print(" ");  
                }
                if (i < no) 
                {
                    c2++;
                } 
                else 
                {
                    c2--;
                }
                for (int j=0; j<c; j++) 
                {
                    System.out.print(ch);    
                    if (j < c/2) 
                    {
                        ch++;
                    } 
                    else 
                    {
                        ch--;
                    }
                }
                if (i<no)
                {
                    c = c+2;
                } 
                else
                {
                    c = c-2;
                }
                ch = 'A';

                System.out.println();
            }
            System.out.print("Press N to EXIT else any key to continue :");
            ch = input.next().charAt(0);
            if ((ch == 'N') || (ch == 'n'))
            {
                break;
            }
        } while (true);
    }
}