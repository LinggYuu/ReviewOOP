package com.ly.p353;

//代理模式
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

//被代理类
class Server implements NetWork{

    @Override
    public void browse() {
        System.out.println("真实服务器访问网络");
    }
}

class Server2 implements NetWork{

    @Override
    public void browse() {
        System.out.println("真实服务器2访问网络");
    }
}

//代理类
class ProxyServer implements NetWork{

    private NetWork work;

    public ProxyServer(NetWork work){
        this.work = work;
    }

//    联网前的校验
    public void check(){
        System.out.println("校验中...");
    }

    @Override
    public void browse() {
        check();
        work.browse();

    }
}


//代理类2，因为不用接口直接用具体的被代理类，所以绑定了具体的被代理类
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
        System.out.println("联网前检查...");
    }
}