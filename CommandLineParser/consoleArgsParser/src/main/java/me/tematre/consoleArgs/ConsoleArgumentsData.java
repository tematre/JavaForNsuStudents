package me.tematre.consoleArgs;

import com.google.devtools.common.options.Option;
import com.google.devtools.common.options.OptionsBase;

import java.util.List;

public class ConsoleArgumentsData extends OptionsBase {

    public ConsoleArgumentsData()
    {
    }

    @Option(
            name = "help",
            abbrev = 'h',
            help = "Prints usage info.",
            defaultValue = "true"
    )
    public boolean help;

    @Option(
            name = "host",
            abbrev = 'o',
            help = "The server host.",
            category = "startup",
            defaultValue = "localhost"
    )
    public String host;

    @Option(
            name = "port",
            abbrev = 'p',
            help = "The server port.",
            category = "startup",
            defaultValue = "8080"
    )
    public int port;


}