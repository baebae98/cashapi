package kr.co.gdu.cashapi.view;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;

/*
 * excel파일이 되는 하나의 클래스
 * extendsAbstractXlsView 추상클래스에서 상속받음.
 */
@Component(value = "cashListExcel") // CashListExcel x = new CashListExcel(); .. 이렇게 프로그램이 실행을 함. 만약 안적게 되면 알아서 자동으로 만들어짐.
public class CashListExcel extends AbstractXlsView {
	
	//EXCEL 파일 하나라고 생각하면 됨.
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//CashList를 가지고 와서 엑셀파일을 생성할거임.-보류
		//응답 body의 내용을 파일로 클라이언트한테 전송(파일이름은 cash_list.xls)
		response.setHeader("Content-Disposition","attachment; filename=\"cash_list.xls\"");
		
		//매개변수로 입력받은 Workbook의 Excel 파일에 첫번쨰 시트를 생성함.
		//Sheet sheet1 = workbook.createSheet("sheet1");
		//첫번쨰 시트에 0번쨰 행에 첫번쨰 셀에 값을 이름으로 넣어주세요.
	/*	sheet1.createRow(0).createCell(0).setCellValue("이름");
		sheet1.createRow(0).createCell(1).setCellValue("구디아카데미");*/
		
		// 1.엑셀 시트 생성
		Sheet sheet = workbook.createSheet("sheet1");
	     //2. 시트에 첫번째(인덱스 0) 접근
		Row row0 = sheet.createRow(0);
	     // 3. 첫번째 행의 첫번쨰 셀(인덱스 0)접근
	    Cell cell0 = row0.createCell(0);
	    // 4. 첫번째 행의 첫번쨰 셀에 문자열 값 입력
	    cell0.setCellValue("이름");
	    // 5. 첫번째 행의 두번쨰 셀(인덱스 1)접근
	    Cell cell1 = row0.createCell(1);
	    // 6. 첫번째 행의 두번쨰 문자열 값 입력
	    cell1.setCellValue("구디아카데미");
		
		
	}
}
