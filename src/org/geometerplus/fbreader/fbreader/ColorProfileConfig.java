package org.geometerplus.fbreader.fbreader;

import org.geometerplus.zlibrary.core.options.ZLColorOption;
import org.geometerplus.zlibrary.core.options.ZLStringOption;

public abstract class ColorProfileConfig {
	
	protected ZLStringOption WallpaperOption;
	protected ZLColorOption BackgroundOption;
	protected ZLColorOption SelectionBackgroundOption;
	protected ZLColorOption SelectionForegroundOption;
	protected ZLColorOption HighlightingOption;
	protected ZLColorOption RegularTextOption;
	protected ZLColorOption HyperlinkTextOption;
	protected ZLColorOption VisitedHyperlinkTextOption;
	protected ZLColorOption FooterFillOption;
	
	protected void setConfig(){}

	public ZLStringOption getWallpaperOption() {
		return WallpaperOption;
	}

	public void setWallpaperOption(ZLStringOption wallpaperOption) {
		WallpaperOption = wallpaperOption;
	}

	public ZLColorOption getBackgroundOption() {
		return BackgroundOption;
	}

	public void setBackgroundOption(ZLColorOption backgroundOption) {
		BackgroundOption = backgroundOption;
	}

	public ZLColorOption getSelectionBackgroundOption() {
		return SelectionBackgroundOption;
	}

	public void setSelectionBackgroundOption(ZLColorOption selectionBackgroundOption) {
		SelectionBackgroundOption = selectionBackgroundOption;
	}

	public ZLColorOption getSelectionForegroundOption() {
		return SelectionForegroundOption;
	}

	public void setSelectionForegroundOption(ZLColorOption selectionForegroundOption) {
		SelectionForegroundOption = selectionForegroundOption;
	}

	public ZLColorOption getHighlightingOption() {
		return HighlightingOption;
	}

	public void setHighlightingOption(ZLColorOption highlightingOption) {
		HighlightingOption = highlightingOption;
	}

	public ZLColorOption getRegularTextOption() {
		return RegularTextOption;
	}

	public void setRegularTextOption(ZLColorOption regularTextOption) {
		RegularTextOption = regularTextOption;
	}

	public ZLColorOption getHyperlinkTextOption() {
		return HyperlinkTextOption;
	}

	public void setHyperlinkTextOption(ZLColorOption hyperlinkTextOption) {
		HyperlinkTextOption = hyperlinkTextOption;
	}

	public ZLColorOption getVisitedHyperlinkTextOption() {
		return VisitedHyperlinkTextOption;
	}

	public void setVisitedHyperlinkTextOption(
			ZLColorOption visitedHyperlinkTextOption) {
		VisitedHyperlinkTextOption = visitedHyperlinkTextOption;
	}

	public ZLColorOption getFooterFillOption() {
		return FooterFillOption;
	}

	public void setFooterFillOption(ZLColorOption footerFillOption) {
		FooterFillOption = footerFillOption;
	}
	
	
}
