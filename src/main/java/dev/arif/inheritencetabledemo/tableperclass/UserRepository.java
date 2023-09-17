package dev.arif.inheritencetabledemo.tableperclass;

import dev.arif.inheritencetabledemo.tableperclass.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tpc_ur")
public interface UserRepository extends JpaRepository<dev.arif.inheritencetabledemo.tableperclass.User, Long> {
    @Override
    <S extends User> S save(S entity);
}
