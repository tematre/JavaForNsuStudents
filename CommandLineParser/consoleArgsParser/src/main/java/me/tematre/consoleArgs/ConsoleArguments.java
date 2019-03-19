package me.tematre.consoleArgs;

class ConsoleArguments {

    private ConsoleArgumentsData inner;

    public ConsoleArguments(ConsoleArgumentsData innerValues)
    {
        this.inner = innerValues;
    }

    public String getHost(){
        return this.inner.host;
    }

    public int getPort(){
        return this.inner.port;
    }
}
