package com.ly.p353;

//自写的不用接口的代理

public class NetWorkTest2 {
    public static void main(String[] args) {
        ProxyServer3 proxyServer3 = new ProxyServer3(new Server3());
        proxyServer3.browse();
    }
}

class Server3{
    public void browse(){
        System.out.println("具体服务器3访问");
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
        System.out.println("联网前的检查...");
    }

}