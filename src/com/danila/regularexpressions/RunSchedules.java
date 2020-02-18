package com.danila.regularexpressions;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunSchedules {
    public static void main(String[] args) {
        Path path = Paths.get("resources", "schedule.txt");
        File file = path.toFile();

        Path pathToWrite = Paths.get("resources", "result_schedule.txt");
        File fileToWrite = pathToWrite.toFile();

        Path pathToWriteSecond = Paths.get("resources", "percent_schedule.txt");
        File fileToWriteSecond = pathToWriteSecond.toFile();

        try (Scanner scanner = new Scanner(file, StandardCharsets.UTF_8.name());) {
            String data = scanner.useDelimiter("\\A").next();
            StringBuffer stringBufferActivities = RegexUtil.getResultSchedule(data);
            String resultString = RegexUtil.getString(stringBufferActivities);

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileToWrite, false));
            bufferedWriter.append(stringBufferActivities).flush();

            BufferedWriter bufferedWriterSecond = new BufferedWriter(new FileWriter(fileToWriteSecond, false));
            bufferedWriterSecond.append(resultString).flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
