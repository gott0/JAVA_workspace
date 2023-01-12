import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(7777);
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			try {
				System.out.println("연결요청을 기다립니다.");
				Socket socket = serverSocket.accept(); // accept() : 소켓으로 부터 요청을 받아드림   (클라이언트(연결소켓) -> 서버소켓 -> 서버(연결소켓))
				System.out.println(socket.getInetAddress() + "로 부터 연결 요청이 들어옴"); //요청을 시행한 클라이언트쪽 ip값을 알수있다 
				
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);   // out 스트림 형성 (클라이언트 쪽으로 보내는 중)
				
				dos.writeUTF("[Notice] 접속 성공 Message from server");  //글자가 깨지지않게 인코딩
				System.out.println("데이터를 전송했습니다.");
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
