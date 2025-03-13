package sample.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sample.project.demo.entity.Role;

import java.util.Optional;
@Repository
public interface RoleRepository extends JpaRepository<Role , Integer> {


    Optional<Role> findByName(String role);
}
