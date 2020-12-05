package anonymousclass.anonycreate.eventbutton;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	// 생성자(생성하면서 바로 위의 button1, button2에 익명객체로 생성한 Button.OnClickListener listener를 Setter해준다.)
	public Window() {
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {	
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
