package four;

import java.io.*;
import java.util.ArrayList;

public class Function {
    /**
     * ���ɲ����Exercises.txt��Answer.txt
     * @param n Ϊ ��Ҫ��ʽ������
     * @param r Ϊ ʽ���в������ķ�Χ
     */
    public void createProblemSet(int n,int r){
        Check temporarySet = new Check();
        ArrayList returnList = temporarySet.generate(n,r);
        ArrayList<String> txtList = new ArrayList<>();
        ArrayList<String> ansList = new ArrayList<>();

        //��ȡ�⼯���𰸼�
        for (int i =0;i<2*n;i++) {
            if(i<n) txtList.add(returnList.get(i).toString());
            else ansList.add(returnList.get(i).toString());
        }
        //����⼯�����𰸼�
        createEXEFile(txtList);
        createAnsFile(ansList);
    }

    /**
     * ���ɲ����Exercises.txt
     * @param txtList Ϊ �����⼯�� ʽ���ַ���
     */
    private void createEXEFile(ArrayList txtList){
        try{
            File exTXT = new File("../Exercises.txt");

            //����ļ��Ѵ��ڣ���ɾ���ļ�
            if (exTXT.exists()) {
                exTXT.delete();
            }
            //�����ļ��ɹ�����
            if(exTXT.createNewFile()){
                System.out.println("����Exercises.txt:");
                FileOutputStream txtFile = new FileOutputStream(exTXT);
                PrintStream q = new PrintStream(exTXT);

                for(int i=0;i<txtList.size();i++){
                    System.out.print(">");
                    q.println(i+1 + ". " +txtList.get(i));
                    System.out.println(i+1 + ". " +txtList.get(i));
                }

                txtFile.close();
                q.close();
                System.out.println("Exercises.txt �����ɹ���");
            }
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    /**
     * ���ɲ����Answer.txt
     * @param ansList Ϊ ���ô𰸼��� ���ַ���
     */
    private void createAnsFile(ArrayList ansList){
        try{
            File ansTXT = new File("../Answer.txt");

            //����ļ��Ѵ��ڣ���ɾ���ļ�
            if (ansTXT.exists()) {
                ansTXT.delete();
            }
            //�����ļ��ɹ�����
            if(ansTXT.createNewFile()){
                System.out.print("����Answer.txt:");
                FileOutputStream ansFile = new FileOutputStream(ansTXT);
                PrintStream p = new PrintStream(ansTXT);
                p.println("�𰸣�\n");

                for(int i=0;i<ansList.size();i++){//��������
                //for(int i=0;i<ansList.size()+1;i++){//���Դ��븲����
                    System.out.print(">");
                    p.println(i+1 + ". " +ansList.get(i));
                }
                ansFile.close();
                p.close();
                System.out.println("�����ɹ���");
            }
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    /**
     * ���ɲ����Grade.txt
     * -e F:\5168-homework\theFourArithmeticGenerator\Answer.txt -a F:\5168-homework\theFourArithmeticGenerator\submit.txt
     * @param submitPath Ϊ �����ļ� �� ·��
     * @param answersPath Ϊ ���ļ� �� ·��
     */
     
    

}