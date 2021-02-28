package com.creditcard.creditcardservices.dao;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.creditcard.creditcardservices.model.CreditCard;

public interface CreditCardServiceDao extends JpaRepository<CreditCard,Integer>{
	
	

}
