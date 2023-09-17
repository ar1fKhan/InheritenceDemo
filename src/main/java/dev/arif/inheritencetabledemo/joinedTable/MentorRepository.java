package dev.arif.inheritencetabledemo.joinedTable;

import dev.arif.inheritencetabledemo.joinedTable.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jt_mr")
public interface MentorRepository extends JpaRepository<dev.arif.inheritencetabledemo.joinedTable.Mentor, Long> {
    @Override
    <S extends Mentor> S save(S entity);
}

