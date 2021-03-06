package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {
//		ServicesAbstractFactory factory = new EJBAbstractFactory();
		ServicesAbstractFactory factory = new RestAbstractFactory();
		
		CarService carService = factory.getCarService();
		UserService userService = factory.getUserService();
		
		carService.save("Carro");
		carService.update("New Beetle");
		
		userService.save("Pessoa");
		userService.delete(1);	
		
	}
}
