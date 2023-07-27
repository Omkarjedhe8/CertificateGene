package com.renocrewsoluations.certgenerator;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

// Controller class for generating offer letter and certificate
@Controller
public class OfferLetterCertificateController {
	
	@PostMapping("/generated")
    public ResponseEntity<byte[]> generateOfferLetter(@RequestBody generateOfferLetter offerLetter) throws IOException {
        
        // generate offer letter using offerLetter object
        
        // convert offer letter to byte array
        byte[] bytes = offerLetter.toByteArray();
        
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("attachment", "offer-letter.pdf");
        
        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(bytes.length)
                .body(bytes);
    }

	@GetMapping("/generateOfferLetter")
	public String generateOfferLetter(@RequestParam(value = "internName") String name,
			@RequestParam(value = "internshipTitle") String position, Model model) {
		// Get current date and format it
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String formattedDate = formatter.format(date);

		// Create map to store offer letter details
		Map<String, String> offerLetterDetails = new HashMap<>();
		offerLetterDetails.put("name", name);
		offerLetterDetails.put("position", position);
		offerLetterDetails.put("date", formattedDate);

		// Add offer letter details to model
		model.addAttribute("offerLetterDetails", offerLetterDetails);

		// Return offer letter template name
		return "offerLetterTemplate";
	}

	@GetMapping("/generateCertificate")
	public String generateCertificate(@RequestParam(value = "internName") String name,
			@RequestParam(value = "course") String course) {
		// Create map to store certificate details
		Map<String, String> certificateDetails = new HashMap<>();
		certificateDetails.put("name", name);
		certificateDetails.put("course", course);

		// Add certificate details to model
	

		// Return certificate template name
		return "certificateTemplate";
	}

}



