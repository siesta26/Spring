package polymorphism;

import org.springframework.stereotype.Component;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("===>SonySpeaker 객체 생성");
	}

	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker 음량 증가");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker 음량 감소");
		
	}
	
	
}
