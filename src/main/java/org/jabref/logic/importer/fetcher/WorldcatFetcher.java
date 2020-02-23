package org.jabref.logic.importer.fetcher;

import org.jabref.model.entry.BibEntry;

/**
 * Fetcher for Worldcat.org
 */
public class WorldcatFetcher implements EntryBasedFetcher {

	final public static String NAME = "Worldcat_Fetcher" 

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return NAME;
	}

	@Override
	public List<BibEntry> performSearch(BibEntry entry) {
		// TODO Auto-generated method stub
		return null;
	}
}