package de.juli.workbench.userapi.api;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

	@GetMapping("/")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> home() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Custom-Header", "Moin");
		return new ResponseEntity<>("Moin", headers, HttpStatus.OK);
	}

}
