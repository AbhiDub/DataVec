package io.skymind.echidna.spark.analysis.histogram;

import org.canova.api.writable.Writable;

import java.io.Serializable;

/**
 * HistogramCounter: used to calculate histogram values for one column
 *
 * @author Alex Black
 */
public interface HistogramCounter extends Serializable {

    HistogramCounter add(Writable w);

    HistogramCounter merge(HistogramCounter other);

    double[] getBins();

    long[] getCounts();

}