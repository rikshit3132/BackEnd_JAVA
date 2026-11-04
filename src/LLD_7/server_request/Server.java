package LLD_7.server_request;

public class Server implements Runnable {
    private int reqId;
    Server(int reqId){
        this.reqId = reqId;
    }
    @Override
    public void run(){
        System.out.println("Processing request: "+ reqId +" Thread: "+Thread.currentThread().getName());
    }
//    public void getRequest(int reqId){
//        Thread thread = new Thread(() -> );
//        thread.start();
//    }
}
