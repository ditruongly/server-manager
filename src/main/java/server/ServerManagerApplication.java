package server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import server.model.Server;
import server.repository.ServerRepo;

import static server.enumeration.Status.SERVER_UP;

@SpringBootApplication
public class ServerManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerManagerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo) {
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16 GB",
					"Personal PC", "http://localhost:8080/server/image/server1.png", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.161", "Ubuntu Linux", "16 GB",
					"Personal PC", "http://localhost:8080/server/image/server2.png", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.162", "Ubuntu Linux", "16 GB",
					"Personal PC", "http://localhost:8080/server/image/server3.png", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.163", "Ubuntu Linux", "16 GB",
					"Personal PC", "http://localhost:8080/server/image/server4.png", SERVER_UP));
		};
	}
}
