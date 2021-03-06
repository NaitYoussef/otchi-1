package com.otchi.domain.users.models;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * Spring Data  repository for the User entity.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findOneByUsername(String username);

    List<User> findAllByIdNotLike(Long id);

    List<User> findAllByIdNotIn(Collection<Long> ids);

    Optional<User> findOneById(Long id);
}