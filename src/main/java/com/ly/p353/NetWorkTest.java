package com.ly.p353;

//����ģʽ
//

public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();
        Server2 server1 = new Server2();
        ProxyServer proxyServer = new ProxyServer(server);
        ProxyServer2 proxyServer2 = new ProxyServer2(server1,3);
        proxyServer.browse();
        System.out.println("..........................................");
        proxyServer2.browse();
    }
}

interface NetWork{
    public void browse();
}

//��������
class Server implements NetWork{

    @Override
    public void browse() {
        System.out.println("��ʵ��������������");
    }
}

class Server2 implements NetWork{

    @Override
    public void browse() {
        System.out.println("��ʵ������2��������");
    }
}

//������
class ProxyServer implements NetWork{

    private NetWork work;

    public ProxyServer(NetWork work){
        this.work = work;
    }

//    ����ǰ��У��
    public void check(){
        System.out.println("У����...");
    }

    @Override
    public void browse() {
        check();
        work.browse();

    }
}


//������2����Ϊ���ýӿ�ֱ���þ���ı������࣬���԰��˾���ı�������
class ProxyServer2 implements NetWork{
    private Server2 server;
    private int id;
    public ProxyServer2(Server2 server,int id){
        this.server = server;
        this.id = id;
    }


    @Override
    public void browse() {
        check();
        server.browse();
    }


    private void check(){
        System.out.println("����ǰ���...");
    }
}