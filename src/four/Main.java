package four;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	while(true) {
        /* **** 输入指令 **** */
    		System.out.println("请输入生成题目数-n");
    		Scanner inputn=new Scanner(System.in);
    		int n=inputn.nextInt();
    		System.out.println("请输入生成题目参数范围-r");
    		Scanner inputr=new Scanner(System.in);
    		int r=inputr.nextInt();         
            String submitPath = null;
            String answersPath = null;

            /* **** 执行函数 **** */
            System.out.println("n: " + n + ", r: " + r);
            Function makefile = new Function();
            /*if (submitPath != null && answersPath != null)
                makefile.createGradeFile(submitPath,answersPath);
            else*/
                makefile.createProblemSet(n,r);
        }
    }
}
