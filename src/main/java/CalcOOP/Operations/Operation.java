package CalcOOP.Operations;

public class Operation {

    public boolean equals;
    public String operation;

/// Конструктор для ввода типа операции (+,-,*,/)

    public Operation(String operation) {
        this.operation = operation;
    }

/// Геттеры, сеттеры

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}