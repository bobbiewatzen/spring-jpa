package com.jsun.site;

import org.springframework.stereotype.Repository;
import com.jsun.site.entities.Publisher;

@Repository
public class DefaultPublisherRepository extends GenericJpaRepository<Long, Publisher> implements PublisherRepository {
}
