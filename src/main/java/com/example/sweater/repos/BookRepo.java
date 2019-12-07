package com.example.sweater.repos;

import com.example.sweater.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Collection;

public interface BookRepo extends JpaRepository<Book, Long> {
    @Query("select b from Book b where " +
            "activity_id = :activityId and department_id = :departmentId and " +
            "format_id = :formatId and genre_id = :genreId  and " +
            " state_id = :stateId and type_id = :type_id")
    Collection<Book> getBooks(@Param("activityId") Integer activityId,  @Param("departmentId") Integer departmentId,
                        @Param("formatId") Integer formatId, @Param("genreId") Integer genreId,
                         @Param("stateId") Integer stateId, @Param("type_id") Integer type_id);
}
