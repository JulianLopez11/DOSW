package com.dosw.TallerEvaluativo2.decorator.impl;

import com.dosw.TallerEvaluativo2.decorator.ReportDecorator;
import com.dosw.TallerEvaluativo2.decorator.ReportInterface;

import java.util.logging.Logger;

/**
 * Concrete decorator that adds PDF and Excel export support to a report.
 */
public class PDFExcelReport extends ReportDecorator {

    private static final Logger logger = Logger.getLogger(PDFExcelReport.class.getName());
    /**
     * Constructor for PDFExcelReport.
     *
     * @param decoratedReport The ReportInterface instance to be decorated.
     */
    public PDFExcelReport(ReportInterface decoratedReport) {
        super(decoratedReport);
    }
    /**
     * Generates a report by delegating the call to the decorated report
     * and logs an informational message about the inclusion of PDF and Excel support.
     */
    @Override
    public void generateReport() {
        decoratedReport.generateReport();
        logger.info("PDFExcel has been added to the report.");

    }

}