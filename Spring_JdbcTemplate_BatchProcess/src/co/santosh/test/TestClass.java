package co.santosh.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.santosh.dao.StockDAO;
import co.santosh.entity.Stock;

public class TestClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		List <Stock> stocks=new ArrayList<Stock>();
		for(int i=0;i<2000;i++){
			Stock obj=new Stock("Colgate-Sensitive","Toothpaste",i+1);
			stocks.add(obj);
		}
		StockDAO stockDAO=(StockDAO)context.getBean("stockDAO");
		stockDAO.batchInsert(stocks);
		System.out.println("2000 entries have been added into Stock table successfully");
	}

}


