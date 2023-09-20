package TestingProject.tst.repositories;

import TestingProject.tst.models.Human;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HumanRepository extends JpaRepository<Human, Integer> {
}
