/**
 * 
 */
package hany.modern.treasury.annotation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hany
 *
 */
@RestController
@RequestMapping(path="/")
public class AccountController {
	
	
	@GetMapping(value = "/greetings-with-response-body", produces="application/json")
    public String getGreetingWhileReturnTypeIsString() { 
        return "{\"test\": \"Hello\"}";
    }

}
