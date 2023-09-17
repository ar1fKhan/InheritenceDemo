package dev.arif.inheritencetabledemo.joinedTable;

import dev.arif.inheritencetabledemo.joinedTable.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jt_ur")
public interface UserRepository extends JpaRepository<dev.arif.inheritencetabledemo.joinedTable.User, Long> {
    @Override
    <S extends User> S save(S entity);
}
