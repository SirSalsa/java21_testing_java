package org.example.services;

import org.example.Book;

import java.util.ArrayList;

public class LibraryService {

    private BorrowService borrowService;
    private SearchService searchService;

    //Stores books that are used for borrowing and searching
    private ArrayList<Book> storedBooks;
    private static final int borrowPrice = 75;

    public LibraryService(BorrowService borrowService, SearchService searchService, ArrayList<Book> storedBooks) {
        this.borrowService = borrowService;
        this.searchService = searchService;
        this.storedBooks = storedBooks;
    }

    public BorrowService getBorrowService() {
        return borrowService;
    }

    public SearchService getSearchService() {
        return searchService;
    }
}
