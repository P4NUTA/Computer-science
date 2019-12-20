public class SocketExample {
    public static void main(String[] args) {
        String host = "0.0.0.0";
        int port = 32000;
        Thread server = new Server(port);
        // server thread
        server.start();
        Thread client = new Client(host, port, 1);
        // client thread
        client.start();
    }
}