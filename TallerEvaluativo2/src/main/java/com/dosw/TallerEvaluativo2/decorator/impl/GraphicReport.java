package com.dosw.TallerEvaluativo2.decorator.impl;

import com.dosw.TallerEvaluativo2.decorator.ReportDecorator;
import com.dosw.TallerEvaluativo2.decorator.ReportInterface;

import java.util.logging.Logger;

/**
 * Concrete decorator that adds graphics to a report.
 */
public class GraphicReport extends ReportDecorator {

    private static final Logger logger = Logger.getLogger(GraphicReport.class.getName());

    /**
     * Constructor for GraphicReport.
     *
     * @param decoratedReport The ReportInterface instance to be decorated.
     */
    public GraphicReport(ReportInterface decoratedReport) {
        super(decoratedReport);
    }

    /**
     * Generates a report by delegating the call to the decorated report
     * and logs an informational message about the inclusion of graphics.
     */
    @Override
    public void generateReport() {
        decoratedReport.generateReport();
        logger.info("Graphics has been added to the report.");

    }

}