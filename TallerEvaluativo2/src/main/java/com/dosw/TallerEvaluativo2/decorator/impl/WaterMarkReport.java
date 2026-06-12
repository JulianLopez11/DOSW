package com.dosw.TallerEvaluativo2.decorator.impl;

import com.dosw.TallerEvaluativo2.decorator.ReportDecorator;
import com.dosw.TallerEvaluativo2.decorator.ReportInterface;

import java.util.logging.Logger;

/**
 * Concrete decorator that adds a watermark to a report.
 */
public class WaterMarkReport extends ReportDecorator {

    private static final Logger logger = Logger.getLogger(WaterMarkReport.class.getName());

    /**
     * Constructor for WaterMarkReport.
     *
     * @param decoratedReport The ReportInterface instance to be decorated.
     */
    public WaterMarkReport(ReportInterface decoratedReport) {
        super(decoratedReport);
    }

    /**
     * Generates a report by delegating the call to the decorated report
     * and logs an informational message about the inclusion of a watermark.
     */
    @Override
    public void generateReport() {
        decoratedReport.generateReport();
        logger.info("A watermark has been added to the report.");
    }

}