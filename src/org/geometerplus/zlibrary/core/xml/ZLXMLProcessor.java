/*
 * Copyright (C) 2007-2013 Geometer Plus <contact@geometerplus.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.zlibrary.core.xml;

import java.util.*;
import java.io.*;

import org.geometerplus.zlibrary.core.filesystem.ZLFile;

public abstract class ZLXMLProcessor {
	public static Map<String,char[]> getEntityMap(List<String> dtdList) {
		try {
			return ZLXMLParser.getDTDMap(dtdList);
		} catch (IOException e) {
			return Collections.emptyMap();
		}
	}
	
	public static void read(ZLXMLReader xmlReader, Object inputSource, int bufferSize) throws IOException{
		ZLXMLParser parser = null;
		try {
			if(inputSource instanceof InputStream ){
				parser = new ZLXMLParser(xmlReader, (InputStream)inputSource, bufferSize);
			}
			else if(inputSource instanceof Reader){
				parser = new ZLXMLParser(xmlReader, (Reader)inputSource, bufferSize);
			}
			else if(inputSource instanceof ZLFile){
				InputStream stream = ((ZLFile)inputSource).getInputStream();
				try{
					read(xmlReader, stream, bufferSize);
				} finally {
					try {
						stream.close();
					} catch (IOException e) {
					}
				}
			}
			
			xmlReader.startDocumentHandler();
			parser.doIt();
			xmlReader.endDocumentHandler();
		} finally {
			if (parser != null) {
				parser.finish();
			}
		}
	}
	
}
