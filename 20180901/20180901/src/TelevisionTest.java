public class TelevisionTest {
	public static void main(String[] args) {
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		tv.setChannel(11);
		int ch = tv.getChannel();
		System.out.println("���� ä���� " + ch + "�Դϴ�.");
		/*tv.print();
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		yourTv.print();*/
		/*System.out.println("�ڷ������� ä���� " + tv.channel + "�̰� ������ "
				+ tv.volume + "�Դϴ�.");*/
	}
}