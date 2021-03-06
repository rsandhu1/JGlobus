/*
 * Copyright 1999-2006 University of Chicago
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.globus.ftp.dc;

import java.io.InputStream;
import java.io.IOException;

import org.globus.ftp.Buffer;

public interface DataChannelReader {

    public void setDataStream(InputStream in);

    // looks like DataSource interface

    /**
       @return Buffer of read data or null if end of data
     **/
    public Buffer read()
	throws IOException;
    
    public void close()
	throws IOException;

}
