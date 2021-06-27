package by.minsk.epam.radkevich;

import by.minsk.epam.radkevich.practice.DemoEnum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;


    public class Demo {
        private static final String DELIMETER = "_";


        private static final String AVAILABLE_COMMANDS = new StringBuilder()
                .append("Available commands list: ")
                .append("\n\tExit: 0")
                .append("\n\tAdd key value pair: 1_key_value")
                .append("\n\tGet value by key: 2_key")
                .append("\n\tGet all key values set: 3")
                .toString();


        public static void main(String[] args) {

            Map<String, String> map = new HashMap<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println(AVAILABLE_COMMANDS);
            while (true) {
                System.out.println("Type next command please.");

                String line = null;
                try {
                    line = reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException("Cannot read line from console");
                }
                if (!line.matches("(0)" +
                        "|(1_[a-zA-Z0-9]{1,10}_[a-zA-Z0-9]{1,10})" +
                        "|(2_[a-zA-Z0-9]{1,10})" +
                        "|(3)")) {
                    System.out.println("Command is invalid!");
                    System.out.println(AVAILABLE_COMMANDS);
                    continue;
                }
                if (line.isBlank()) {
                    System.out.println("Command must be not empty!");
                    continue;
                }

                DemoEnum command = DemoEnum.values()[Character.getNumericValue(line.charAt(0))];

                switch (command) {

                    case EXIT_COMMAND: {
                        System.out.println("Goodbye.");
                        return;
                    }
                    case ADD_COMMAND: {
                        String[] splittedLine = line.split(DELIMETER);
                        String key = splittedLine[1];
                        String value = splittedLine[2];
                        map.put(key, value);
                        break;
                    }
                    case GET_BY_KEY_COMMAND: {
                        String[] splittedLine = line.split(DELIMETER);
                        String key = splittedLine[1];
                        System.out.println(map.get(key));
                        break;
                    }
                    case GET_ALL_COMMAND: {
                        System.out.println(map);
                        break;
                    }
                    default: {
                        System.out.println("No such command!");
                    }
                }
            }
        }

    }