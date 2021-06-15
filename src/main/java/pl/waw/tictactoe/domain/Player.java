package pl.waw.tictactoe.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "player")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(name = "username", nullable = false)
    private String username;

    @NonNull
    @Column(name = "password", nullable = false)
    private String password;

    @NonNull
    @Column(name = "email", nullable = false)
    private String email;
}
