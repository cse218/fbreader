package org.geometerplus.zlibrary.core.filetypes;

import org.geometerplus.zlibrary.core.filesystem.ZLFile;

public class FileTypeFB2AcceptFile implements FileTypeChecker {

	@Override
	public boolean acceptsFile(ZLFile zfile) {
		// TODO Auto-generated method stub
		final String lName = zfile.getShortName().toLowerCase();
		return lName.endsWith(".fb2") || lName.endsWith(".fb2.zip");
	}

}
