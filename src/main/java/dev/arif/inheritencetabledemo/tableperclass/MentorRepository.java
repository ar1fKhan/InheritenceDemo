package dev.arif.inheritencetabledemo.tableperclass;

import dev.arif.inheritencetabledemo.tableperclass.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tpc_mr")
public interface MentorRepository extends JpaRepository<dev.arif.inheritencetabledemo.tableperclass.Mentor, Long> {
    @Override
    <S extends Mentor> S save(S entity);
}

