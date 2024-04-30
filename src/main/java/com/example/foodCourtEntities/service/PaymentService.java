package com.example.foodCourtEntities.service;

import java.util.List;
import com.example.foodCourtEntities.entity.Payment;
public interface PaymentService {

	Payment addPayment(Payment Payment);
	
List<Payment> getAllPayments();
	
	Payment getPaymentById(Long PaymentId);
	
	Payment updatePayment(Long PaymentId,Payment Payment);
	
	void deletePaymentById(Long PaymentId);
	
	void deleteAllPayment();
	
	boolean isPaymentExists(Long PaymentId);
}
