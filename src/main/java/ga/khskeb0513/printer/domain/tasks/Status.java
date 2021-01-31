package ga.khskeb0513.printer.domain.tasks;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Status {

    PENDING("STATUS_PENDING", "승인 대기 중"),
    CANCEL("STATUS_CANCEL", "사용자 취소 건"),
    PAUSE("STATUS_PAUSE", "인쇄 보류 중"),
    PRINTING("STATUS_PRINTING", "인쇄 중"),
    ERROR("STATUS_ERROR", "오류 발생"),
    KEEPING("STATUS_KEEPING", "보관 중"),
    DONE("STATUS_DONE", "해당 건 완료");

    private final String key;
    private final String title;
}
