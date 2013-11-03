package org.geometerplus.zlibrary.core.filetypes;

import org.geometerplus.zlibrary.core.filesystem.ZLFile;

public class FileTypePalmAcceptFile implements FileTypeChecker {

	@Override
	public boolean acceptsFile(ZLFile zfile) {
		// TODO Auto-generated method stub
		final String extension = zfile.getExtension();
		return
			("pdb".equalsIgnoreCase(extension) || "prc".equalsIgnoreCase(extension)) &&
			myPalmId.equals(palmFileType(file));
	}

}
