package com.dosw.TallerEvaluativo2.decorator;


/**
 * Abstract class that serves as a base for report decorators.
 * Implements the ReportInterface and allows extending the functionality
 * of report generation by decorating an existing ReportInterface instance.
 */
public abstract class ReportDecorator implements ReportInterface {

    protected ReportInterface decoratedReport;


    /**
     * Constructor for the 'ReportDecorator' class.
     *
     * @param decoratedReport The 'ReportInterface' instance to be decorated.
     */
    public ReportDecorator(ReportInterface decoratedReport) {
        this.decoratedReport = decoratedReport;

    }

    /**
     * Generates a report by delegating the call to the decorated report.
     * This method can be overridden by subclasses to add additional behavior.
     */
    @Override
    public void generateReport() {
        decoratedReport.generateReport();
    }

}
