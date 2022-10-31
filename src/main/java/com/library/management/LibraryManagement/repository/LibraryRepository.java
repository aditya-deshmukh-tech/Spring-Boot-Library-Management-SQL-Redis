package com.library.management.LibraryManagement.repository;

import com.library.management.LibraryManagement.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Book, String> {

//    @Query("SELECT b FROM Book b WHERE b.bookName LIKE %?1%")
//    List<Book> findAllMatchingBooks(String book);

      List<Book> findByBookNameContainingIgnoreCase(String bookName);
}
