package me.tematre.consoleArgs;

import com.google.devtools.common.options.OptionsParser;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        OptionsParser parser = OptionsParser.newOptionsParser(ConsoleArgumentsData.class);
        parser.parseAndExitUponError(args);


        ConsoleArguments options = new ConsoleArguments(parser.getOptions(ConsoleArgumentsData.class));

        if (options.getHost().isEmpty() || options.getPort() < 0) {
            printUsage(parser);
            return;
        }

        System.out.format("Starting server at %s:%d...\n", options.getHost(), options.getPort());

    }

    private static void printUsage(OptionsParser parser) {
        System.out.println("Usage: java -jar server.jar OPTIONS");
        System.out.println(parser.describeOptions(Collections.<String, String>emptyMap(),
                OptionsParser.HelpVerbosity.LONG));
    }

}
