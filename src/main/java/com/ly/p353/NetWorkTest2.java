package com.ly.p353;

//��д�Ĳ��ýӿڵĴ���

public class NetWorkTest2 {
    public static void main(String[] args) {
        ProxyServer3 proxyServer3 = new ProxyServer3(new Server3());
        proxyServer3.browse();
    }
}

class Server3{
    public void browse(){
        System.out.println("���������3����");
    }
}

class ProxyServer3{
    private Server3 server3;
    public ProxyServer3(Server3 server3){
        this.server3 = server3;
    }

    public void browse(){
        check();
        server3.browse();
    }

    private void check(){
        System.out.println("����ǰ�ļ��...");
    }

}