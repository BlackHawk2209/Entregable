package com.ibm.academia.apirest;


import org.springframework.boot.CommandLineRunner;


import com.ibm.academia.apirest.entities.Pasion;
import com.ibm.academia.apirest.entities.Tarjeta;

public class Comandos implements CommandLineRunner {

	
	
	@Override
	public void run(String... args) throws Exception {
		
		//Pasiones
		Pasion shopping = new Pasion();
		shopping.setPasionNombre("Shopping");
		
		Pasion travels = new Pasion();
		travels.setPasionNombre("Travels");
		
		Pasion help = new Pasion();
		help.setPasionNombre("Help");
		
		Pasion myBussines = new Pasion();
		myBussines.setPasionNombre("My bussines");
		
		Pasion sports = new Pasion();
		sports.setPasionNombre("Sports");
		
		Pasion myStyle = new Pasion();
		myStyle.setPasionNombre("My style");
		
		//Tarjetas
		Tarjeta bsmart= new Tarjeta();
		bsmart.setNombre("Bsmart");
		bsmart.addPasion(shopping);
		bsmart.addPasion(myStyle);
		
		Tarjeta afinityCard= new Tarjeta();
		afinityCard.setNombre("AfinityCard");
		afinityCard.addPasion(shopping);
		afinityCard.addPasion(myStyle);
		
		Tarjeta clasica= new Tarjeta();
		clasica.setNombre("Clasica");
		clasica.addPasion(shopping);
		
		Tarjeta officeDepot= new Tarjeta();
		officeDepot.setNombre("OfficeDepot");
		officeDepot.addPasion(shopping);
		officeDepot.addPasion(myBussines);
		
		Tarjeta costco= new Tarjeta();
		costco.setNombre("Costco");
		costco.addPasion(shopping);
		costco.addPasion(myBussines);
		
		Tarjeta bestBuyBanamex= new Tarjeta();
		bestBuyBanamex.setNombre("Best Buy Banamex");
		bestBuyBanamex.addPasion(shopping);
		bestBuyBanamex.addPasion(myBussines);
		
		Tarjeta homeDepot= new Tarjeta();
		homeDepot.setNombre("Home Depot");
		homeDepot.addPasion(shopping);
		homeDepot.addPasion(myBussines);
		
		Tarjeta oro= new Tarjeta();
		oro.setNombre("Oro");
		oro.addPasion(shopping);
		oro.addPasion(myStyle);
		
		Tarjeta platinum= new Tarjeta();
		platinum.setNombre("Platinum");
		platinum.addPasion(shopping);
		platinum.addPasion(myStyle);
		platinum.addPasion(travels);
			
		Tarjeta cityAAdvantage= new Tarjeta();
		cityAAdvantage.setNombre("City/AAdvantage");
		cityAAdvantage.addPasion(travels);
		
		Tarjeta teleton= new Tarjeta();
		teleton.setNombre("Banamex teleton");
		teleton.addPasion(help);
		
		Tarjeta apac= new Tarjeta();
		apac.setNombre("Apac");
		apac.addPasion(help);
		
		Tarjeta martiClasica= new Tarjeta();
		martiClasica.setNombre("Marti clasica");
		martiClasica.addPasion(sports);
		
		Tarjeta americaDeporteismo= new Tarjeta();
		americaDeporteismo.setNombre("America Deporteismo");
		americaDeporteismo.addPasion(sports);
		
		Tarjeta pumasDeporteismo= new Tarjeta();
		pumasDeporteismo.setNombre("Pumas Deporteismo");
		pumasDeporteismo.addPasion(sports);
		
		Tarjeta tolucaDeporteismo= new Tarjeta();
		tolucaDeporteismo.setNombre("Toluca Deporteismo");
		tolucaDeporteismo.addPasion(sports);
		
		Tarjeta verdeDeporteismo= new Tarjeta();
		verdeDeporteismo.setNombre("La Verde Deporteismo");
		verdeDeporteismo.addPasion(sports);
		
		Tarjeta martiPremium= new Tarjeta();
		martiPremium.setNombre("Marti clasica");
		martiPremium.addPasion(sports);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
