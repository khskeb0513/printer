package ga.khskeb0513.printer.domain.settings;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Settings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "setting_id")
    @Enumerated(EnumType.STRING)
    private Long settingId;


}
