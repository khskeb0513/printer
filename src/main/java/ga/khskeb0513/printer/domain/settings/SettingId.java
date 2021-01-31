package ga.khskeb0513.printer.domain.settings;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SettingId {

    PRINTER_NAME("STATUS_PRINTER_NAME", "인쇄할 프린터 선택");

    private final String key;
    private final String title;
}
