package org.launchcode.codingevents.data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.launchcode.codingevents.models.EventCategory;

@Repository
public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {
}
