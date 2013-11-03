package org.geometerplus.zlibrary.core.filetypes;

import org.geometerplus.zlibrary.core.filesystem.ZLFile;

public class FileTypeHtmlAcceptFile implements FileTypeChecker {

	@Override
	public boolean acceptsFile(ZLFile zfile) {
		// TODO Auto-generated method stub
		final String extension = zfile.getExtension().toLowerCase();
		return extension.endsWith("html") || "htm".equals(extension);
	}

}
