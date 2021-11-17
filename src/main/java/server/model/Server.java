package server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import server.enumeration.Status;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;

/**
 * @author ditruong.ly
 * @version 1.0
 * @since 2021/11/16
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {

    @Id @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(unique = true)
    @NotEmpty(message = "IP Address cannot be empty or null")
    private String ipAddress;

    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;
}
