package com.stock.controller;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stock.beans.Stocks;
import com.stock.service.StockService;
import com.stocks.cb.model.Cb;
import com.stocks.cb.model.Parameters;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.quotes.stock.StockQuote;


@RestController
@RequestMapping("hello")
public class testing {
	public testing() {}
	Logger logger = LoggerFactory.getLogger(testing.class);
	@Autowired
	private StockService stockService;
	int balance = 0;
	String speech = "";
	List<Stocks> stocks;
	public static Logger LOG = LoggerFactory.getLogger(testing.class);
	
	@GetMapping("/hi")
	public String test() {
		return "oye kello";
	}
	
	
	
	@RequestMapping(value="/post", method=RequestMethod.POST) 
	  public String sayPlainTextHello(@RequestBody Cb request) throws Exception {
		 String action =  request.getQueryResult().getAction();
	  	    ObjectMapper mapper = new ObjectMapper();
	  	    
	  	    
	  	  
	  	    	logger.error("request: error: " + mapper.writeValueAsString(request));
	  	        logger.debug("request: debug: " + mapper.writeValueAsString(request));
	  	        logger.info("request: info: " + mapper.writeValueAsString(request));
	  	     
	  	      String speech = "";
	  	     
	  	    	  com.stocks.cb.model.Parameters params = request.getQueryResult().getParameters();
	  	  
	  	        final Map<String, Object> properties = params.getAdditionalProperties();
	  	    
	  	       
	  	        System.out.println("-------------------"+action);
	  	        BotResponse response = new BotResponse();
	  	        String jsonInString=null;
	  	        
	  	        if (action.equalsIgnoreCase("getStocks"))
	  	        {
	  	          speech = getStocks(properties);
	  	          response.setFulfillmentText(speech);
	  	          jsonInString = mapper.writeValueAsString(response);
	  	        }
	  	         
	  	      
	  	     mapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
	  	      Response.status(201).entity(jsonInString).build();
	  	      
	  	      System.out.println("final output"+jsonInString);
	  	      System.out.println("final output1"+Response.status(201).entity(jsonInString).build());	

         return jsonInString;
	  }
	 private String getStocks( Map<String, Object> properties) throws SQLException, IOException {
         
		 StringBuffer sb = new StringBuffer();
		 YahooFinance yahoofinance = new YahooFinance();
		 Stock  stock=yahoofinance.get("BABA");
		 StockQuote stockQuote = stock.getQuote();
		 sb.append(stockQuote.getPrice().intValue()+"");


		      return " "+sb;
		      }
	}

