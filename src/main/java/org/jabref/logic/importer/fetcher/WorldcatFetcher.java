package org.jabref.logic.importer.fetcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.jabref.logic.importer.EntryBasedFetcher;
import org.jabref.model.entry.BibEntry;
import org.jabref.model.entry.field.StandardField;

/**
 * Fetcher for Worldcat.org
*/
public class WorldcatFetcher implements EntryBasedFetcher {

	final static private String NAME = "Worldcat_Fetcher";
	final static private String BASE_URL = "http://www.worldcat.org/webservices/catalog/search/worldcat/opensearch";

	@Override
	public String getName() {
		return NAME;
	}

	/**
	 * Make a search based on the title of the BibEntry.
	 * 
	 * {@inheritDoc}
	*/
	 @Override
	public List<BibEntry> performSearch(BibEntry entry) {
		Optional<String> title = entry.getLatexFreeField(StandardField.TITLE);
		if (title.isPresent()) {
			//Example query: http://www.worldcat.org/webservices/catalog/search/worldcat/opensearch?q=srw.ti+all+%22kth%22&wskey={built-in-api-key}

		} else {
			return new ArrayList<>(0);
		}
		return null;
	}
}