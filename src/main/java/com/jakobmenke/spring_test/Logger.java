package com.jakobmenke.spring_test;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

@Component
public class Logger {
    private ConsoleWriter consoleWriter;
    private FileWriter fileWriter ;

    public Logger() {
    }

    @Inject
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    @Inject
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text){
        fileWriter.write(text);
    }
    public void writeConsole(String text){
        consoleWriter.write(text);
    }

    public ConsoleWriter getConsoleWriter() {
        return consoleWriter;
    }

    public FileWriter getFileWriter() {
        return fileWriter;
    }

    @PostConstruct
    public void init(){
        System.out.println("start");
    }

    @PreDestroy
   public void destroy(){
        System.out.println("before death");
    }

}

