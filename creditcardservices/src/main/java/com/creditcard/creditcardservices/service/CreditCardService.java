package com.creditcard.creditcardservices.service;


import java.util.List;

import com.creditcard.creditcardservices.model.CreditCard;


public interface CreditCardService {
	
	public String addNewCreditCard(CreditCard creditCard) ;
	public List<CreditCard> getAll();

}
