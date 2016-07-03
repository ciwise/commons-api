/**
 * Copyright (c) CI Wise Inc.  All rights reserved.  http://www.ciwise.com
 * The software in this package is published under the terms of the Apache
 * version 2.0 license, a copy of which has been included with this distribution 
 * in the LICENSE.md file.
 * 
 */ 

package org.ciwise.commons.api;

import java.io.Serializable;
import java.util.Date;

/**
 * This class is used to parent any API Client module that is created at CI Wise.
 * 
 * It also provides the Java Object overriden methods recommended by Joshua
 * J. Bloch, author of Effective Java, Second Edition
 * 
 *  @author <a href="mailto:david@ciwise.com">David L. Whitehurst</a>
 *
 */
public abstract class BaseAPIClient implements Serializable {

    /**
     * A unique serial identifier
     */
    private static final long serialVersionUID = 7914598560949137619L;

    /**
     * The service host e.g. Google.
     * @return a String service host
     */
    public abstract String getServiceHostEntity();
    
    /**
     * The url where the API resides. The url could also be just a reference to
     * the documentation for a Java library.
     * 
     * @return a String url e.g. https://acme.com/api/v2
     */
    public abstract String getServiceBaseURL();
    
    /**
     * The API version being used where this abstract class is being extended
     * and this method is implemented ( -- DO NOT FORGET THIS -- )
     * 
     * @return a String version of the API used e.g. v2
     */
    public abstract String getAPIVersion();
    
    /**
     * The last time (datetime) the final static constant data here (hint,hint)
     * was added or revised.
     * 
     * Here's an example of what we need:
     * <pre>
     * TimeZone local = TimeZone.getTimeZone("Asia/Tokyo");
     * Calendar now = Calendar.getInstance(local); // time in current timezone
     * SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
     * formatter.setTimeZone(local)
     * String dateString = formatter.format(now.getTime());
     * </pre>
     * @return
     */
    public abstract String getLastMetadataUpdate();
    
    /**
     * Returns an informative multi-line string
     *
     * @return a String representation of this class.
     */
    @Override
    public abstract String toString();

    /**
     * Compares object equality.
     *
     * @param o
     *            object to compare to
     * @return true/false based on equality tests
     */
    @Override
    public abstract boolean equals(Object o);

    /**
     * When you override equals, you should override hashCode. See "Why are
     * equals() and hashCode() importatant?" at the url:
     * http://www.hibernate.org/109.html
     *
     * @return hashCode
     */
    @Override
    public abstract int hashCode();
    
}
