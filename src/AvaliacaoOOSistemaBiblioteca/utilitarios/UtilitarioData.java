package src.AvaliacaoOOSistemaBiblioteca.utilitarios;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilitarioData {
    public static Date stringParaDate(String dataString) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date parsedDate = null;
        try {
            parsedDate = dateFormat.parse(dataString);
        } catch (ParseException e) {

        }
        return parsedDate;
    }



}
