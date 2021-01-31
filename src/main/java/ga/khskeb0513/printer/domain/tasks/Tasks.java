package ga.khskeb0513.printer.domain.tasks;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_id", nullable = false)
    private Long accountId;

    @Nationalized
    @Column(name = "file_name", nullable = false)
    private String fileName;

    @Nationalized
    @Column(name = "pdf_name")
    private String pdfName;

    @Column(name = "page_count")
    private int pageCount;

    @Column(name = "start_page_count")
    private int startPageCount;

    @Column(name = "end_page_count")
    private int endPageCount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Column(columnDefinition = "TEXT")
    private String name;

    @Builder
    public Tasks(
            Long accountId, String fileName, String pdfName, Status status
    ) {
        this.accountId = accountId;
        this.fileName = fileName;
        this.pdfName = pdfName;
        this.status = status;
    }

    public void update(Status status) {
        this.status = status;
    }

    public String getStatusKey() {
        return this.status.getKey();
    }

    public String getStatusTitle() {
        return this.status.getTitle();
    }
}
