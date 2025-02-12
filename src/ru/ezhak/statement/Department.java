package ru.ezhak.statement;

public abstract class Department {
    //protected Statement statement;
    protected Department nextDepartment;

    public void setNextDepartment (Department nextDepartment) {
        this.nextDepartment = nextDepartment;
    }

    public void handle(Statement statement) {
        if (process(statement) && nextDepartment != null) {
            nextDepartment.handle(statement);
        }
    }

    abstract boolean process (Statement statement);


}
