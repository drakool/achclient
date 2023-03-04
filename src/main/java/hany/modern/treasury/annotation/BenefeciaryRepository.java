/**
 * 
 */
package hany.modern.treasury.annotation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import hany.modern.treasury.model.CounterParty;
//import reactor.core.publisher.Flux;

/**
 * @author hany
 *
 */
@Repository
public class BenefeciaryRepository {
	
	private static final Map<String, CounterParty> BENEFICIARY_DATA;
	
	static {
		BENEFICIARY_DATA = new HashMap<String, CounterParty>();
		BENEFICIARY_DATA.put("1", CounterParty.builder().id("4456bd77-2a65-49fb-bbcb-16be70be8243")
				.name("Harry Potter").build());
	}
	
//	public Flux<CounterParty> findAllCounterParties(){
//		return Flux.fromIterable(BENEFICIARY_DATA.values());
//	}
	

}
