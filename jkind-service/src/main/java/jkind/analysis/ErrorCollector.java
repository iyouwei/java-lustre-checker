package jkind.analysis;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 错误收集
 */
@Getter
public class ErrorCollector {
    private final List<String> errors = new ArrayList<>();
    private final List<String> warnings = new ArrayList<>();

    public void error(String msg) {
        errors.add(msg);
    }

    public void error(Object location, String msg) {
        errors.add(location + ": " + msg);
    }

    public void warning(String msg) {
        warnings.add(msg);
    }

    public void warning(Object location, String msg) {
        warnings.add(location + ": " + msg);
    }

}