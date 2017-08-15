package com.example.demo.Repository;

import com.example.demo.Domain.DatabaseTest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Adeebo on 2017/08/15.
 */
@Repository
public interface DatabaseTestRepo extends CrudRepository<DatabaseTest, Long>{
}
