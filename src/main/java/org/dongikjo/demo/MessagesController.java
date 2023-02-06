package org.dongikjo.demo;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("")
@Slf4j
public class MessagesController {

	private MessageSource messageSource;

	public MessagesController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@GetMapping("/message")
	public String messagePageRender(Model model, @RequestParam("kor") String kor, @RequestParam("eng") String eng) {
		model.addAttribute("kor", kor);
		model.addAttribute("eng", eng);
		
		log.info(messageSource.getMessage("say.hello", new String[] { kor }, Locale.getDefault()));
		log.info(messageSource.getMessage("say.hello", new String[] { eng }, Locale.US));
		log.info(messageSource.getMessage("say.hello", new String[] { kor }, Locale.KOREA));

		return "message";
	}
}
