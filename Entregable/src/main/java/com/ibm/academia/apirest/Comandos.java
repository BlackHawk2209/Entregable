package com.ibm.academia.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.apirest.entities.Tarjeta;
import com.ibm.academia.apirest.enums.Pasion;
import com.ibm.academia.apirest.services.TarjetaDAO;

@Component
public class Comandos implements CommandLineRunner
{
	@Autowired
	private TarjetaDAO tarjetaDAO;
	
	@Override
	public void run(String... args) throws Exception 
	{
		//Tarjetas de SHOPPING 
		/*
		Tarjeta bsmartS = new Tarjeta(null, "Bsmart", 18, 32, 7000, 50000, Pasion.SHOPPING);
		Tarjeta afinityCardS = new Tarjeta(null, "Afinity Card", 18, 32, 7000, 50000, Pasion.SHOPPING);
		Tarjeta clasicaS = new Tarjeta(null, "Clasica", 24, 75, 7000, 14999, Pasion.SHOPPING);
		Tarjeta officeDepotS = new Tarjeta(null, "Office Depot", 24, 75, 7000, 49999, Pasion.SHOPPING);
		Tarjeta costcoS = new Tarjeta(null, "Costco", 24, 75, 7000, 49999, Pasion.SHOPPING);
		Tarjeta bestBuyS = new Tarjeta(null, "Best buy Banamex", 24, 75, 7000, 49999, Pasion.SHOPPING);
		Tarjeta homeDepotS = new Tarjeta(null, "The Home Depot", 24, 75, 7000, 49999, Pasion.SHOPPING);
		Tarjeta oroS = new Tarjeta(null, "Oro", 24, 75, 15000, 34999, Pasion.SHOPPING);
		Tarjeta platinumS = new Tarjeta(null, "Platinum", 24, 75, 35000, 50000, Pasion.SHOPPING);
		
		//Tarjetas de Travels
		Tarjeta cityAadvantageT = new Tarjeta(null, "Citi/Aadvantage", 18, 75, 12000, 50000, Pasion.TRAVELS);
		Tarjeta platinumT = new Tarjeta(null, "Platinum", 24, 75, 30000, 50000, Pasion.TRAVELS);
		
		//Tarjetas de Help
		Tarjeta teleton = new Tarjeta(null, "Banamex Teleton", 18, 75, 12000, 50000, Pasion.HELP);
		Tarjeta apac = new Tarjeta(null, "APAC", 18, 75, 12000, 50000, Pasion.HELP);
		
		//Tarejta de My bussines
		Tarjeta officeDepotM = new Tarjeta(null, "Office Depot", 18, 75, 7000, 50000, Pasion.MYBUSSINES);
		Tarjeta costcoM = new Tarjeta(null, "Costco", 18, 75, 7000, 50000, Pasion.MYBUSSINES);
		Tarjeta bestBuyM = new Tarjeta(null, "Best Buy Banamex", 18, 75, 7000, 50000, Pasion.MYBUSSINES);
		Tarjeta homeDepotM = new Tarjeta(null, "The home depot", 18, 75, 12000, 50000, Pasion.MYBUSSINES);
		
		//Tarjetas de Sports
		Tarjeta martiClasica = new Tarjeta(null, "Marti Clasica CityBanamex", 18, 75, 7000, 34999, Pasion.SPORTS);
		Tarjeta americaDeporteismo = new Tarjeta(null, "America Deporteismo", 18, 75, 7000, 34999, Pasion.SPORTS);
		Tarjeta pumasDeporteismo = new Tarjeta(null, "Pumas Deporteismo", 18, 75, 7000, 34999, Pasion.SPORTS);
		Tarjeta tolucaDeporteismo = new Tarjeta(null, "Toluca Deporteismo", 18, 75, 7000, 34999, Pasion.SPORTS);
		Tarjeta verdeDeporteismo = new Tarjeta(null, "La verde Deporteismo ", 18, 75, 7000, 34999, Pasion.SPORTS);
		Tarjeta martiPremium = new Tarjeta(null, "Marti Premium CityBanamex", 18, 75, 35000, 50000, Pasion.SPORTS);
		
		
		//Tarjetas de Mystyle
		Tarjeta bsmartMS = new Tarjeta(null, "Bsmart", 18, 75, 7000, 50000, Pasion.MYSTYLE);
		Tarjeta afinityCardMS = new Tarjeta(null, "Afinity Card", 18, 32, 7000, 34999, Pasion.MYSTYLE);
		Tarjeta oroMS = new Tarjeta(null, "Oro", 24, 75, 15000, 29999, Pasion.MYSTYLE);
		Tarjeta platinumMS = new Tarjeta(null, "Platinum", 24, 75, 30000, 50000, Pasion.MYSTYLE);
		
		tarjetaDAO.guardar(bsmartS);
		tarjetaDAO.guardar(afinityCardS);
		tarjetaDAO.guardar(clasicaS);
		tarjetaDAO.guardar(officeDepotS);
		tarjetaDAO.guardar(costcoS);
		tarjetaDAO.guardar(bestBuyS);
		tarjetaDAO.guardar(homeDepotS);
		tarjetaDAO.guardar(oroS);
		tarjetaDAO.guardar(platinumS);
		
		tarjetaDAO.guardar(cityAadvantageT);
		tarjetaDAO.guardar(platinumT);
		
		tarjetaDAO.guardar(teleton);
		tarjetaDAO.guardar(apac);
		
		tarjetaDAO.guardar(officeDepotM);
		tarjetaDAO.guardar(costcoM);
		tarjetaDAO.guardar(bestBuyM);
		tarjetaDAO.guardar(homeDepotM);
		
		tarjetaDAO.guardar(martiClasica);
		tarjetaDAO.guardar(americaDeporteismo);
		tarjetaDAO.guardar(pumasDeporteismo);
		tarjetaDAO.guardar(tolucaDeporteismo);
		tarjetaDAO.guardar(verdeDeporteismo);
		tarjetaDAO.guardar(martiPremium);
		
		tarjetaDAO.guardar(bsmartMS);
		tarjetaDAO.guardar(afinityCardMS);
		tarjetaDAO.guardar(oroMS);
		tarjetaDAO.guardar(platinumMS);
		*/
	}
	
}
