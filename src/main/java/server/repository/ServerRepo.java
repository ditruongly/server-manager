package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.model.Server;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
