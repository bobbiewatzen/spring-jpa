package com.jsun.site;

import org.springframework.stereotype.Repository;
import com.jsun.site.entities.Author;

@Repository
public class DefaultAuthorRepository extends GenericJpaRepository<Long, Author> implements AuthorRepository {

}
