package org.jsp.merchantbootapp.controller;

import org.jsp.merchantbootapp.dto.Merchant;
import org.jsp.merchantbootapp.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/merchants")
public class MerchantController {
	@Autowired
	private MerchantRepository merchantRepository;

	@PostMapping
	public Merchant saveMerchant(@RequestBody Merchant merchant) {
		return merchantRepository.save(merchant);
	}
}
