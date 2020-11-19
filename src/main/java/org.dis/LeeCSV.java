// lectura del fichero csv mediante el objeto plano y su carga en una lista de objetos de este tipo
package org.dis;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;


public class LeerCSV {

    public List<golfPlayer> parseaCSV(String path) throws FileNotFoundException {
        BufferedReader fileReader = new BufferedReader(new FileReader(path));
        CsvToBean csvToBean = new CsvToBeanBuilder(fileReader).withType(golfPlayer.class).withIgnoreLeadingWhiteSpace(true).build();
        List<golfPlayer> players = CsvToBean.parse();
        return players;
    }
}
