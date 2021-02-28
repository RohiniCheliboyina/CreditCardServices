package com.creditcard.creditcardservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creditcard.creditcardservices.constants.CreditCardValidationMessages;
import com.creditcard.creditcardservices.dao.CreditCardServiceDao;
import com.creditcard.creditcardservices.model.CreditCard;

@Service
public class CreditCardServiceImpl implements CreditCardService{
	
	@Autowired
	CreditCardServiceDao creditCardDao;
	
	
	/**
	* Method to add the credit card details
	*
	* @return success message if it is successful.
	**/
	@Override
	public String addNewCreditCard(CreditCard creditCard) {
		
		CreditCard newCreditCard = new CreditCard();
		newCreditCard.setCardNumber(creditCard.getCardNumber());
		newCreditCard.setAccountHolderName(creditCard.getAccountHolderName());
		newCreditCard.setCreditLimit(creditCard.getCreditLimit());
		newCreditCard.setBalance(CreditCardValidationMessages.DEFAULT_BALANCE);
		
		creditCardDao.save(newCreditCard);
		return CreditCardValidationMessages.SUCCESS;
		
		
	}
	/**
	* Method to get all the credit card details
	*
	* @return the List<CreditCard> details
	**/
	@Override
	public List<CreditCard> getAll(){
		
		return creditCardDao.findAll();
	}
	
	

}
