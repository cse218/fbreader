package org.geometerplus.fbreader.book;

import java.util.LinkedList;

import org.geometerplus.android.fbreader.covers.Requires;
import org.xml.sax.Attributes;

public class FilterFactory {
	@Ensures({
		if(filter == null){
			filter = new Filter.Empty();
		}			
	})
	public Filter createFilter(String type, Attributes attributes){
		Filter filter = null;
		
		if (type == "empty"){
			filter = new Filter.Empty();
		} else if (type == "author"){
			filter = new Filter.ByAuthor(new Author(
					attributes.getValue("displayName"),
					attributes.getValue("sorkKey")
				));
		} else if (type == "tag"){
			final LinkedList<String> names = new LinkedList<String>();
			int num = 0;
			String n;
			while ((n = attributes.getValue("name" + num++)) != null) {
				names.add(n);
			}
			filter = new Filter.ByTag(Tag.getTag(names.toArray(new String[names.size()])));
		} else if (type == "label"){
			filter = new Filter.ByLabel(attributes.getValue("name"));
		} else if (type == "series"){
			filter = new Filter.BySeries(new Series(
					attributes.getValue("title")
				));
		} else if(type == "pattern"){
			filter = new Filter.ByPattern(attributes.getValue("pattern"));
		} else if(type == "title-prefix"){
			filter = new Filter.ByTitlePrefix(attributes.getValue("prefix"));
		} else if(type == "has-bookmark"){
			filter = new Filter.HasBookmark();
		} 	
		return filter;
	}
}
