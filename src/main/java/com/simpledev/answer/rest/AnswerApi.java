package com.simpledev.answer.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class AnswerApi {

	@Value("${answer1}")
	private String answer1;

	@Value("${answer2}")
	private String answer2;

	@Value("${answer3}")
	private String answer3;

	@Value("${answer4}")
	private String answer4;

	@GetMapping("/getAnswer")
	public String getAnswer() {

		StringBuilder sb = new StringBuilder();
		sb.append(answer1)
		.append("<br>")
		.append(answer2)
		.append("<br>")
		.append(answer3)
		.append("<br>")
		.append(answer4)
		.append("<br>")
		.append("=========")
		.append("<br>");
		
		return sb.toString();
	}

}
