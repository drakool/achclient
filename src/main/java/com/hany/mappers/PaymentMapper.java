package com.hany.mappers;

import com.hany.domain.Payment;
import com.hany.messages.SendPayment;

public interface PaymentMapper {
    
    Payment sendPaymentToPayment(SendPayment sendPayment);

}
