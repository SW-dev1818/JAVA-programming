public class TelevisionTest {
	public static void main(String[] args) {
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		tv.setChannel(11);
		int ch = tv.getChannel();
		System.out.println("현재 채널은 " + ch + "입니다.");
		/*tv.print();
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		yourTv.print();*/
		/*System.out.println("텔레비전의 채널은 " + tv.channel + "이고 볼륨은 "
				+ tv.volume + "입니다.");*/
	}
}
