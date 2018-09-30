package four;

import java.io.*;
import java.util.ArrayList;

public class Function {
    /**
     * 生成并输出Exercises.txt、Answer.txt
     * @param n 为 需要的式子总数
     * @param r 为 式子中操作数的范围
     */
    public void createProblemSet(int n,int r){
        Check temporarySet = new Check();
        ArrayList returnList = temporarySet.generate(n,r);
        ArrayList<String> txtList = new ArrayList<>();
        ArrayList<String> ansList = new ArrayList<>();

        //获取题集、答案集
        for (int i =0;i<2*n;i++) {
            if(i<n) txtList.add(returnList.get(i).toString());
            else ansList.add(returnList.get(i).toString());
        }
        //输出题集、、答案集
        createEXEFile(txtList);
        createAnsFile(ansList);
    }

    /**
     * 生成并输出Exercises.txt
     * @param txtList 为 所得题集的 式子字符串
     */
    private void createEXEFile(ArrayList txtList){
        try{
            File exTXT = new File("../Exercises.txt");

            //如果文件已存在，则删除文件
            if (exTXT.exists()) {
                exTXT.delete();
            }
            //创建文件成功？？
            if(exTXT.createNewFile()){
                System.out.println("创建Exercises.txt:");
                FileOutputStream txtFile = new FileOutputStream(exTXT);
                PrintStream q = new PrintStream(exTXT);

                for(int i=0;i<txtList.size();i++){
                    System.out.print(">");
                    q.println(i+1 + ". " +txtList.get(i));
                    System.out.println(i+1 + ". " +txtList.get(i));
                }

                txtFile.close();
                q.close();
                System.out.println("Exercises.txt 创建成功！");
            }
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    /**
     * 生成并输出Answer.txt
     * @param ansList 为 所得答案集的 答案字符串
     */
    private void createAnsFile(ArrayList ansList){
        try{
            File ansTXT = new File("../Answer.txt");

            //如果文件已存在，则删除文件
            if (ansTXT.exists()) {
                ansTXT.delete();
            }
            //创建文件成功？？
            if(ansTXT.createNewFile()){
                System.out.print("创建Answer.txt:");
                FileOutputStream ansFile = new FileOutputStream(ansTXT);
                PrintStream p = new PrintStream(ansTXT);
                p.println("答案：\n");

                for(int i=0;i<ansList.size();i++){//正常运行
                //for(int i=0;i<ansList.size()+1;i++){//测试代码覆盖率
                    System.out.print(">");
                    p.println(i+1 + ". " +ansList.get(i));
                }
                ansFile.close();
                p.close();
                System.out.println("创建成功！");
            }
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    /**
     * 生成并输出Grade.txt
     * -e F:\5168-homework\theFourArithmeticGenerator\Answer.txt -a F:\5168-homework\theFourArithmeticGenerator\submit.txt
     * @param submitPath 为 解题文件 的 路径
     * @param answersPath 为 答案文件 的 路径
     */
     
    

}