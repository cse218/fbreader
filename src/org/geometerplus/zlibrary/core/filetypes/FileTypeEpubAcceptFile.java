package org.geometerplus.zlibrary.core.filetypes;

import org.geometerplus.zlibrary.core.filesystem.ZLFile;

public class FileTypeEpubAcceptFile implements FileTypeChecker {

	@Override
	public boolean acceptsFile(ZLFile zfile) {
		// TODO Auto-generated method stub
		final String extension = zfile.getExtension();
		return
			"epub".equalsIgnoreCase(extension) ||
			"oebzip".equalsIgnoreCase(extension) ||
			"opf".equalsIgnoreCase(extension);
	}

}
