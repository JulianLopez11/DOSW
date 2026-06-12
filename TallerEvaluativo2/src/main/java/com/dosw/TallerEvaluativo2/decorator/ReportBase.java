package com.dosw.TallerEvaluativo2.decorator;

import java.util.logging.Logger;

import com.dosw.TallerEvaluativo2.decorator.impl.PDFExcelReport;
import com.dosw.TallerEvaluativo2.model.Report;


/**
 * Base class for report generation.
 * Implements the ReportInterface and provides basic functionality
 * for creating reports.
 */
public class ReportBase implements ReportInterface {

    private static final Logger logger = Logger.getLogger(ReportBase.class.getName());

    private Report report;

    /**
     * Constructor for ReportBase.
     *
     * @param report The Report object to be used by this class.
     */
    public ReportBase(Report report) {
        this.report = report;
    }

    /**
     * Method to generate a report.
     * Logs an informational message indicating that a report has been created.
     */
    public void generateReport() {
        logger.info("A Report has been created");
    }
}
