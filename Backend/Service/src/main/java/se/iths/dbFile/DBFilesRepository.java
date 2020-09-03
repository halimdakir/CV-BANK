package se.iths.dbFile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBFilesRepository extends JpaRepository<DBFiles, String> {

}
