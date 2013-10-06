package org.geometerplus.fbreader.fbreader;

import org.geometerplus.zlibrary.core.options.ZLStringOption;

public class ColorProfileDark extends ColorProfileConfig{
	public ColorProfileDark(){}
	protected void setConfig(){
		String name = "defaultDark";
		WallpaperOption =
			new ZLStringOption("Colors", name + ":Wallpaper", "");
		BackgroundOption =
			ColorProfile.createOption(name, "Background", 0, 0, 0);
		SelectionBackgroundOption =
			ColorProfile.createOption(name, "SelectionBackground", 82, 131, 194);
		SelectionForegroundOption =
			ColorProfile.createOption(name, "SelectionForeground", 255, 255, 220);
		HighlightingOption =
			ColorProfile.createOption(name, "Highlighting", 96, 96, 128);
		RegularTextOption =
			ColorProfile.createOption(name, "Text", 192, 192, 192);
		HyperlinkTextOption =
			ColorProfile.createOption(name, "Hyperlink", 60, 142, 224);
		VisitedHyperlinkTextOption =
			ColorProfile.createOption(name, "VisitedHyperlink", 200, 139, 255);
		FooterFillOption =
			ColorProfile.createOption(name, "FooterFillOption", 85, 85, 85);
	}
}
