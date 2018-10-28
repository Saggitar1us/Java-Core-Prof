package ru.stepanov.se.io.logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Logger {

    private final String file = ("log.txt");
    private final Path path = Paths.get(file);

    private List<String> lines = new LinkedList<>();

    public final List<String> getLogs() {

        try (Stream<String> lineStream = Files.lines(path)) {

            lines = lineStream.collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println("ERROR: input...");
        }
        return lines;
    }

    public final void addLogsToFile(final String log) {
        lines.add(log);
        try {
            Files.write(path, lines);
        } catch (IOException fileProcessingException) {
            System.out.println("ERROR: write to file");
            fileProcessingException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.getLogs();
        logger.addLogsToFile("Крис Белл");
    }
}
