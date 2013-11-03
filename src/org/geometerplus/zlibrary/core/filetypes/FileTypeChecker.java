package org.geometerplus.zlibrary.core.filetypes;

import org.geometerplus.zlibrary.core.filesystem.ZLFile;

public interface FileTypeChecker {
	public boolean acceptsFile(ZLFile zfile);
}
