package com.dosw.TallerEvaluativo2.decorator;

/**
 * Interface that defines the contract for generating reports.
 * Classes implementing this interface must provide an implementation
 * for the `generateReport` method.
 */
public interface ReportInterface {
    /**
     * Method to generate a report.
     * This method should be implemented by classes to define the specific
     * behavior for report generation.
     */
    void generateReport();
}
