package com.hms.adapter;

import com.hms.services.Service;

/**
 * This interface is the Target in the Adapter design model
 */

public interface Printer {
    public void print(Service s);
}
