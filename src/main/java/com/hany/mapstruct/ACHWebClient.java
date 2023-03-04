/**
 * 
 */
package com.hany.mapstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import hany.modern.treasury.model.CounterParty;
//import reactor.core.publisher.Flux;

/**
 * @author hany
 *
 */
public class ACHWebClient {
	private static final Logger LOGGER = LoggerFactory.getLogger(ACHWebClient.class);

//	WebClient client = WebClient.create("http://localhost:8080");

	public void consume() {

//		Flux<CounterParty> counterPartyFlux = client.get().uri("/beneficiary").retrieve()
//				.bodyToFlux(CounterParty.class);

//		counterPartyFlux.subscribe(counterParty -> LOGGER.info("CounterParty: {}", counterParty));
	}

}
