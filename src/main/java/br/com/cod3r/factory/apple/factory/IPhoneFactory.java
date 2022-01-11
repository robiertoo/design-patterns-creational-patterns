package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class IPhoneFactory {
	public static IPhone orderIPhone(String generation, String level) {
		IPhone device = null;
		
		if("X".equals(generation)) {
			if("standard".equals(level)) device = new IPhoneX();
			else if("highend".equals(level)) device = new IPhoneXSMax();
		}
		
		if("11".equals(generation)) {
			if("standard".equals(level)) device = new IPhone11();
			else if("highend".equals(level)) device = new IPhone11Pro();
		}
		
		return device;
	}
}
