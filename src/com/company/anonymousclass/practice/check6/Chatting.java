package anonymousclass.practice.check6;

public class Chatting {
	void startChat(String chatId) {
		String nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			void start() {
				while(true) {
					String inputData = "님 안녕하세요.";
					String message = "[" + nickName + "]" + inputData;
					System.out.println(sendMessage(message));
					break;
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		String sendMessage(String message) {
			return message;
		}
	}
}
