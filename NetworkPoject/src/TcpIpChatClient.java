import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpChatClient {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("192.168.0.120",7777);
			System.out.println("서버에 연결 되었습니다.");
			
			Sender sender = new Sender(socket);
			sender.start();//Thread의 run()를 직접 호출해서는 안됨, start() 로 호출
			
			Receiver receiver = new Receiver(socket);
			receiver.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
