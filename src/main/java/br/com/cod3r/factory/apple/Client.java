package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	public static void main(String[] args) {
		System.out.println("### Ordering an iPhone X");
		IPhone iphone1 = IPhoneFactory.orderIPhone("X", "standard");
		iphone1.getHardware();
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = IPhoneFactory.orderIPhone("11", "highend");
		iphone2.getHardware();
	}
}
