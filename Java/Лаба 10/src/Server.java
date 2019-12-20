import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
    private int port;

    public Server(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        BufferedReader in = null;
        PrintWriter out = null;
        ServerSocket server = null;
        Socket fromClient = null;
        try {
            server = new ServerSocket(port);
            fromClient = server.accept();
            in = new BufferedReader(new InputStreamReader(fromClient.getInputStream()));
            out = new PrintWriter(fromClient.getOutputStream(), true);
            String input;
            System.out.println("Client " + in.readLine().split(":")[0] + " connected");
            while ((input = in.readLine()) != null) {
                if (input.contains("exit")) {
                    System.out.println("Shutting down...");
                    break;
                } else {
                    String[] msg = input.split(":");
                    out.println("received from " + msg[0] + " : " + msg[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                in.close();
                fromClient.close();
                server.close();
            } catch (IOException ex) {
            }
        }
    }
}