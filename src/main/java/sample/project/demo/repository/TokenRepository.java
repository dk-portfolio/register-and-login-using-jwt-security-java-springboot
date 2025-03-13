package sample.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sample.project.demo.entity.Token;

import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<Token,Integer> {


    Optional<Token> findByToken(String token);
}
