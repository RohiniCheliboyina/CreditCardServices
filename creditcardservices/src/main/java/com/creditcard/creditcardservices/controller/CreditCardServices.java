package com.creditcard.creditcardservices.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.creditcard.creditcardservices.constants.CreditCardValidationMessages;
import com.creditcard.creditcardservices.model.CreditCard;
import com.creditcard.creditcardservices.service.CreditCardService;

@RestController

public class CreditCardServices {

	@Autowired
	CreditCardService creditCardService;

	@GetMapping(value = "/creditcardprovider", produces = MediaType.APPLICATION_JSON_VALUE)
	public String welcome() {

		return CreditCardValidationMessages.WELCOME_MSG;
	}

	/**
	* Method to add the credit card details
	*
	* @return HTTPSTATUS.CREATED if it is successful.
	**/
	
	@PostMapping(value = "/creditcardprovider/add", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<String> addCreditCard(@Valid @RequestBody CreditCard creditCard) {

		return new ResponseEntity<>(creditCardService.addNewCreditCard(creditCard), HttpStatus.CREATED);
	}

	/**
	* Method to get all the credit card details
	*
	* @return HTTPSTATUS.OK if it is successful.
	**/
	@GetMapping(value = "/creditcardprovider/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<CreditCard>> getAll() {

		return new ResponseEntity<List<CreditCard>>(creditCardService.getAll(), HttpStatus.OK);
	}

}
