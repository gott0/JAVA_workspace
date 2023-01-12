import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpChatServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		Socket socket = null;
		
		
		try {
			serverSocket = new ServerSocket(2222);
			System.out.println("서버가 실행됨");
			
			socket = serverSocket.accept();
			
			Sender sender = new Sender(socket);
			sender.start();//Thread의 run()를 직접 호출해서는 안됨, start() 로 호출
			
			Receiver receiver = new Receiver(socket);
			receiver.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
