package kr.co.gdu.cashapi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExcelController {
	//path="...", produces = ".." 
	@GetMapping(path="/cashListExcel",produces = "application/vnd.ms-excel")
	public String cashListExcel() {
		return "cashListExcel";
	}
}
