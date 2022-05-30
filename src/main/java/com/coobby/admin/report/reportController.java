package com.coobby.admin.report;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
	@RequestMapping("/admin")
public class reportController {
	
	private ReportService reportService;

		@RequestMapping("Report/report")
		public void report() {
			
		}
	}
	


