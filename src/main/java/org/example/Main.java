package org.example;

import jflex.exceptions.SilentExit;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SilentExit {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String rootPath = Paths.get("").toAbsolutePath(). toString();
        String subPath = "/src/main/java/fool";

        String file = rootPath + "/src/language.lex";
        String[] list = new String[1];
        list[0] = file;
        File sourceCode = new File(file);


        jflex.Main.generate(list);
    }
}