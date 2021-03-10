package ua.com.owu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.entity.Client;

public interface ClientDAO extends JpaRepository<Client, Integer> {
}
