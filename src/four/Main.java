package four;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	while(true) {
        /* **** ����ָ�� **** */
    		System.out.println("������������Ŀ��-n");
    		Scanner inputn=new Scanner(System.in);
    		int n=inputn.nextInt();
    		System.out.println("������������Ŀ������Χ-r");
    		Scanner inputr=new Scanner(System.in);
    		int r=inputr.nextInt();         
            String submitPath = null;
            String answersPath = null;

            /* **** ִ�к��� **** */
            System.out.println("n: " + n + ", r: " + r);
            Function makefile = new Function();
            /*if (submitPath != null && answersPath != null)
                makefile.createGradeFile(submitPath,answersPath);
            else*/
                makefile.createProblemSet(n,r);
        }
    }
}
