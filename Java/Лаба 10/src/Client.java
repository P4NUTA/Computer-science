import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client extends Thread {
    private String host;
    private int port;
    private int id;

    public Client(String host, int port, int id) {
        this.host = host;
        this.port = port;
        this.id = id;
    }

    private String formatMessage(String msg) {
        return "client#" + this.id + ":" + msg;
    }

    @Override
    public void run() {
        Socket fromServer = null;
        BufferedReader in = null;
        PrintWriter out = null;
        BufferedReader inputBuf = null;
        try {
            String clientMsg, serverMsg;
            System.out.println("Connecting to " + host + ":" + port);
            fromServer = new Socket(host, port);
            in = new BufferedReader(new InputStreamReader(fromServer.getInputStream()));
            out = new PrintWriter(fromServer.getOutputStream(), true);
            inputBuf = new BufferedReader(new InputStreamReader(System.in));
            // start message (to be sure client is connected)
            out.println(formatMessage(""));
            // read message from console and send to server
            while ((clientMsg = inputBuf.readLine()) != null) {

                out.println(formatMessage(clientMsg));
                serverMsg = in.readLine();
                System.out.println("Server: " + serverMsg);
                if (clientMsg.contains("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                in.close();
                inputBuf.close();
                fromServer.close();
            } catch (IOException ex) {
            }
        }
    }
}