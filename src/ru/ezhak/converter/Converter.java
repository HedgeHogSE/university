package ru.ezhak.converter;

public abstract class Converter {

    public final void transformDocument (String inputFile, String outputFile) {
        String data = openDocument(inputFile);
        String transformedData = convert(data);
        record(transformedData, outputFile);
    }
    protected abstract String openDocument (String name);
    protected abstract String convert (String text);
    protected abstract void record (String text, String name);
}
