package org.geometerplus.zlibrary.core.filetypes;

import org.geometerplus.zlibrary.core.filesystem.ZLFile;

public class FileTypeMobipocketAcceptFile implements FileTypeChecker {

	@Override
	public boolean acceptsFile(ZLFile zfile) {
		// TODO Auto-generated method stub

		final String extension = zfile.getExtension();
		return
			("mobi".equalsIgnoreCase(extension) || "azw3".equalsIgnoreCase(extension)) && 
			"BOOKMOBI".equals(FileTypePalm.palmFileType(zfile));
	}

}
