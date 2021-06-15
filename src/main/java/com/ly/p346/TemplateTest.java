package com.ly.p346;


//�������Ӧ�ã�ģ�巽�������ģʽ,�Ѳ�ȷ���ĳ����ˣ�������д����ȷ���Ĳ�����

import java.sql.SQLOutput;

public class TemplateTest {
    public static void main(String[] args) {
        Template t = new SubTemplate();
        t.spendTime();
    }
}

abstract class Template{
    //�ó�ĳ�δ����ִ��ʱ��
    public void spendTime(){
        //��ǰʱ��
        long start = System.currentTimeMillis();
        //code���־��ǲ�ȷ�����ǲ��֣������������㲿����ȷ����
        this.code();

        long end  =System.currentTimeMillis();
        System.out.println("�˷���ִ��ʱ��Ϊ��"+(end-start));
    }
    //code���־��ǲ�ȷ�����ǲ���
    public abstract void code();

}


class SubTemplate extends Template{

    @Override
    public void code() {
        for(int i = 2;i<= 10000;i++){
            boolean isFlag = true;//ÿ�ν���ѭ����������
            for (int j = 2;j<=Math.sqrt(i);j++){
                if(i%j ==0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }
        }

    }
}
