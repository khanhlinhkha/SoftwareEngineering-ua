package be.uantwerp;

public interface OrderFileReaderIf {
    public OrderList readCsvFile(String aName);
}