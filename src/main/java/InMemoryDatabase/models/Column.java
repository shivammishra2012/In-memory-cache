package InMemoryDatabase;

public class Column {

    public Column(String columnName, Type columnType) {
        this.columnName = columnName;
        ColumnType = columnType;
    }

    private String columnName;
    private Type ColumnType;

    private enum Type{
        INT,
        STRING
    };


}
