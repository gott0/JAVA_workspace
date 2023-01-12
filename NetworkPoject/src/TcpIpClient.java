import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient {

	public static void main(String[] args) {

		System.out.println("서버에 연결합니다."); //연결(일반)소켓 만들기
		try {
			Socket socket = new Socket("192.168.0.61",7777);
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);  //받아들이는 스트림 생성
			
			System.out.println("서버로 부터 받은 메세지" + dis.readUTF());
			System.out.println("연결 종료");
			
			dis.close();
			socket.close();
			
		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} 
	}

	/*
	   tcp = 통신방식
	   ip = 주소(cmd에서 "ipconfig"으로 확인)
 
                       서버-[서버소켓] ===== 클라이언트
        (일반소켓)          |   (일반소켓)
			             └ 스트림(데이터의 이동통로)
			                - 데이터를 받는 것 = in
			                - 데이터를 주는 것  = out
			                
		소켓 : 스트림이 연결되는 곳
		     -서버 소켓: 1.서버에만 존재
			          2.클라이언트 요청 감지
			          3.감지한 요청을 서버의 일반 소켓에 전달 
			             (서버에는 소캣이 두개인 것)
			             
	         -일반 소켓: 실질적인 연결을 담당 (서버소캣과는 별개) */
}