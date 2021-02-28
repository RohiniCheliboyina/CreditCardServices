package com.creditcard.creditcardservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.creditcard.creditcardservices.constants.CreditCardValidationMessages;
import com.creditcard.creditcardservices.customvalidations.CreditCardNumberCheck;
import com.creditcard.creditcardservices.customvalidations.NumericCheck;

@Entity
@Table(name="creditcard")
public class CreditCard {
	
	private Long id;
	
	@NotNull
	@Size(max=19, message= CreditCardValidationMessages.MAX_DIGITS)
	@CreditCardNumberCheck(message = CreditCardValidationMessages.INVALID_CARD_NUMBER)
	@NumericCheck(message = CreditCardValidationMessages.IS_NOT_NUMERIC)
	private String cardNumber;
	
	@NotNull
	@Size(min=2, message = CreditCardValidationMessages.MIN_CHARS_NAME)
	
	private String accountHolderName;
	private double creditLimit;
	private double balance;
	
	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public CreditCard(
			@NotNull @Size(max = 19, message = CreditCardValidationMessages.MAX_DIGITS) String cardNumber,
			@NotNull @Size(min = 2, message = CreditCardValidationMessages.MIN_CHARS_NAME) String accountHolderName,
			double creditLimit,
			double balance) {
		
		this.cardNumber = cardNumber;
		this.accountHolderName = accountHolderName;
		this.creditLimit = creditLimit;
		this.balance = balance;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	@Column(name = "card_number")
	public String getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Column(name = "account_holder_name")
	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	@Column(name = "credit_limit")
	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	
   @Column(name = "balance")
	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", accountHolderName=" + accountHolderName + ", creditLimit="
				+ creditLimit + "]";
	}

	
	
	
	

}
