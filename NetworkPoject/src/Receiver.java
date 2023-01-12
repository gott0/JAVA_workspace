import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Receiver extends Thread {

	Socket socket;
	DataInputStream in;
	String name;
	
	public Receiver(Socket socket) {
		super();
		this.socket = socket;
		
		try {
			in = new DataInputStream(socket.getInputStream());
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void run() {
		while(in != null) {//스트림(in)이 살아있을 때까지 
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
