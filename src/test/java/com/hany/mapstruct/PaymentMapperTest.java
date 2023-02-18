package com.hany.mapstruct;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.UUID;

import javax.transaction.Transactional;

import org.assertj.core.api.Assert;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.hany.domain.Payment;
import com.hany.hibernate.bootstrap.HibernateConf;
import com.hany.mappers.PaymentMapper;

import lombok.extern.log4j.Log4j2;

/* @RunWith(SpringJUnit4ClassRunner.class)
 */
@SpringBootTest
@ContextConfiguration(classes = { HibernateConf.class })
@Transactional
@Log4j2
public class PaymentMapperTest {
    

    @Autowired
    private SessionFactory sessionFactory;


    @Test
    public void whenBootstrapHibernateSession_thenNoException() {

        Session session = sessionFactory.getCurrentSession();


        Payment payment = new Payment();
        payment.setVersion(1);

        payment.setAmount(30L);

        UUID returnedId = (UUID)session.save(payment);

        Payment tempPayment = session.find(Payment.class, returnedId);
        assertNotNull(tempPayment);
        assertEquals(payment.getAmount(), tempPayment.getAmount());
    }

    @Test
    public void givenAPaymentObject_whenMapping_ShouldReturnSendPaymentObject()
    {
        Payment payment = new Payment();
        
    }
}
