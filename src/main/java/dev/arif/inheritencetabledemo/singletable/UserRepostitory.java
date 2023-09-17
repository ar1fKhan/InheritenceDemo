package dev.arif.inheritencetabledemo.singletable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepostitory extends JpaRepository<User, Long> {
    @Override
    <S extends User> S save(S entity);
}
