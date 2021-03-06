// Deviator - Interface for Generation of Mean and Standard Deviation
package com.simularity.sax;

interface Deviator {
	double getMean();
	double getStdDev();
	void reset();
	void apply(double d);
	double normalize(double d);
};

