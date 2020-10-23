package osipov.evgeny.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "freelancer")
public class Freelancer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;
    @Getter @Setter
    private String fio;
    @Getter @Setter
    private String username;
    @Getter @Setter
    private String password;
    @Getter @Setter
    private Long count_deals;
    @Getter @Setter
    private String description;
    @Getter @Setter
    private String phone_number;
    @Getter @Setter
    private String email;

    public Freelancer(String fio, String username, String password,
                      Long count_deals, String description,
                      String phone_number, String email) {
        this.fio = fio;
        this.username = username;
        this.password = password;
        this.count_deals = count_deals;
        this.description = description;
        this.phone_number = phone_number;
        this.email = email;
    }

    public String toJSON () {
        return "{\"fio\":\"" + this.getFio()
                + "\",\"username\":\"" + this.getUsername() + "\",\"count deals\":\""
                + this.getCount_deals().toString() + "\",\"description\":\""
                + this.getDescription() + "\",\"phone number\":\"" + this.getPhone_number()
                + "\",\"email\":\"" + this.getEmail() + "\"}";
    }
}
