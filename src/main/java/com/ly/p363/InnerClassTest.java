package com.ly.p363;

public class InnerClassTest {

//    �����к��ټ�
public void method(){
    //�ֲ��ڲ���
    class AA{

    }
}

//����һ��ʵ����Comparable�ӿڵ������
public Comparable getComparable(){
//    ����һ��ʵ����Comparable�ӿڵ��ࣺ�ֲ��ڲ���
    //��ʽһ��
//    class MyComparable implements Comparable{
//
//        @Override
//        public int compareTo(Object o) {
//            return 0;
//        }
//    }
//    return new MyComparable();

    //��ʽ����
    return new Comparable() {
        @Override
        public int compareTo(Object o) {
            return 0;
        }
    };

}



}


