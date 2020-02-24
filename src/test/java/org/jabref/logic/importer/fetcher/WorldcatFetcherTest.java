package org.jabref.logic.importer.fetcher;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.jabref.logic.importer.FetcherException;
import org.jabref.model.entry.BibEntry;
import org.jabref.model.entry.field.StandardField;
import org.jabref.testutils.category.FetcherTest;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

@FetcherTest
public class WorldcatFetcherTest{

	private WorldcatFetcher fetcher;

	@BeforeEach
	public void setUp() {
		fetcher = new WorldcatFetcher();
	}

	@Test
	public void testPerformSearch() throws FetcherException{
		BibEntry entry = new BibEntry();
		//Mashing keyboard
		entry.setField(StandardField.TITLE, "ASDhbsd fnm");
		List<BibEntry> list = fetcher.performSearch(entry);
		assertFalse(list.isEmpty());
	}

}