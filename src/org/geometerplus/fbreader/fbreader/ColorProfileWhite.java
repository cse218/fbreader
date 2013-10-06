package org.geometerplus.fbreader.fbreader;

import org.geometerplus.zlibrary.core.options.ZLStringOption;

public class ColorProfileWhite extends ColorProfileConfig{
	public ColorProfileWhite(){}
	
	protected void setConfig(){
		String name = "defaultLight";
		WallpaperOption =
			new ZLStringOption("Colors", name + ":Wallpaper", "wallpapers/sepia.jpg");
		BackgroundOption =
				ColorProfile.createOption(name, "Background", 255, 255, 255);
		SelectionBackgroundOption =
				ColorProfile.createOption(name, "SelectionBackground", 82, 131, 194);
		SelectionForegroundOption =
				ColorProfile.createOption(name, "SelectionForeground", 255, 255, 220);
		HighlightingOption =
				ColorProfile.createOption(name, "Highlighting", 255, 192, 128);
		RegularTextOption =
				ColorProfile.createOption(name, "Text", 0, 0, 0);
		HyperlinkTextOption =
				ColorProfile.createOption(name, "Hyperlink", 60, 139, 255);
		VisitedHyperlinkTextOption =
				ColorProfile.createOption(name, "VisitedHyperlink", 200, 139, 255);
		FooterFillOption =
				ColorProfile.createOption(name, "FooterFillOption", 170, 170, 170);
	}
}
