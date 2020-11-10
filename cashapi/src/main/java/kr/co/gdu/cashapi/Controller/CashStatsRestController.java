package kr.co.gdu.cashapi.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.co.gdu.cashapi.service.CashStatsService;

@RestController
public class CashStatsRestController {
	
	@Autowired CashStatsService cashStatsService;
	/* Logger loger = LoggerFactory.getLogger(CashStatsRestController.class); */
	
	@GetMapping("/totalOutAndInByYear/{year}")
	public Map<String,Object> totalOutAndInByYear(@PathVariable(name = "year")int year){
		return cashStatsService.getTotalOutAndInByYear(year);
	}
	
	@GetMapping("totalMonthlyByYear")
	public Map<String, Object> totalMonthlyByYear() {
		//Map<String, Object> map = cashStatsService.getTotalOfMonthByYear();
		return cashStatsService.getTotalMonthlyByYear();
		//return map;
	}
}
