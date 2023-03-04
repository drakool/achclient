/**
 * 
 */
package hany.modern.treasury.annotation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hany.modern.treasury.model.CounterParty;
//import reactor.core.publisher.Flux;

/**
 * @author hany
 *
 */
@RestController
@RequestMapping("/benefeciary")
public class PaymentController {
	
	/**
	 * @param beneficiaryRepository
	 */
	public PaymentController(BenefeciaryRepository beneficiaryRepository) {
		super();
		BeneficiaryRepository = beneficiaryRepository;
	}


	private BenefeciaryRepository BeneficiaryRepository; 
	

//	@GetMapping("/")
//	private Flux<CounterParty> getAllBenefeciaries(){
//		
//		return BeneficiaryRepository.findAllCounterParties();
//		
//	}
}
