package org.campus02.persondemo;

import java.io.FileNotFoundException;

public class PersonLoadException extends Exception {
    public PersonLoadException(String message) {
        super(message);
    }

    public PersonLoadException(String message, Throwable cause) {
        super(message, cause);
    }
}
