package InMemoryDatabase.models;

public class Column {
    private String columnName;
    private Type columnType;

    public Column(String columnName, Type columnType) {
        this.columnName = columnName;
        columnType = columnType;
    }

    public String getColumnName() {
        return columnName;
    }

    public enum Type{
        INT,
        STRING
    };


}
