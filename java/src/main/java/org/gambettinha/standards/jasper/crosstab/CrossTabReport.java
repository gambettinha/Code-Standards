package org.gambettinha.standards.jasper.crosstab;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class CrossTabReport {

	public static void main(String[] args) {
		try {
			//Parameters
			Map<String, Object> map = buildParameters();
			// Create jasperReport
			JasperReport jasperReport = JasperCompileManager.compileReport("/crosstabTemplate.jrxml");
			// Create jasperPrint
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, 
																new JREmptyDataSource());
			//Exporting pdf file
			JasperExportManager.exportReportToPdfFile(jasperPrint, "crosstab_report.pdf");
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static Map<String, Object> buildParameters() {
		List<CrossTabBean> dataList = buildListToReport();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("reportField", dataList);
		return map;
	}

	private static List<CrossTabBean> buildListToReport() {
		// Data for row 1
		CrossTabBean h1r1 = new CrossTabBean("header1","row1","VALUE1");
		CrossTabBean h2r1 = new CrossTabBean("header2","row1","VALUE2");

		// Data for row 2
		CrossTabBean h1r2 = new CrossTabBean("header1","row2","VALUE3");
		CrossTabBean h2r2 = new CrossTabBean("header2","row2","VALUE4");

		// Data for row 3
		CrossTabBean h1r3 = new CrossTabBean("header1","row3","VALUE5");
		CrossTabBean h2r3 = new CrossTabBean("header2","row3","VALUE6");
		return Arrays.asList(h1r1,h2r1,h1r2,h2r2,h1r3,h2r3);
	}
}
