package com.dosw.TallerEvaluativo2.decorator.impl;

import com.dosw.TallerEvaluativo2.decorator.ReportDecorator;
import com.dosw.TallerEvaluativo2.decorator.ReportInterface;
import java.util.logging.Logger;

/**
 * Concrete decorator that adds stadistics to a report.
 */
public class StadisticReport extends ReportDecorator {

    private static final Logger logger = Logger.getLogger(StadisticReport.class.getName());

    /**
     * Constructor for StadisticReport.
     *
     * @param decoratedReport The ReportInterface instance to be decorated.
     */
    public StadisticReport(ReportInterface decoratedReport) {
        super(decoratedReport);
    }

    /**
     * Generates a report by delegating the call to the decorated report
     * and logs an informational message about the inclusion of statistics.
     */
    @Override
    public void generateReport() {
        decoratedReport.generateReport();
        logger.info("Statitics has been added to the report.");
    }
}