package polymorphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("===>AppleSpeaker 객체 생성");
	}

	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker 음량 증가");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker 음량 감소");
		
	}
	
	
}
