package LLD_7.server_request;

public class Client {
    public static void main(String[] args) {

        for(int i = 1; i <= 30; i++){
            Server server = new Server(i);
            Thread thread = new Thread(server);
            thread.start();
        }
    }
}
