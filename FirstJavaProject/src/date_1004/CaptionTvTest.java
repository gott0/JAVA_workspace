package date_1004;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		System.out.println(ctv.channel);	
		ctv.channelDown();
		System.out.println(ctv.channel);
		
		
		ctv.caption  = true;
		ctv.displayCaption("오늘의 날씨를 알려드립니다.");
		
		I3dTv idd = new I3dTv();
		idd.i3d = true;
		idd.i3dPower();
	}
}
