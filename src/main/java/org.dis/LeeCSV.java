// lectura del fichero csv mediante el objeto plano y su carga en una lista de objetos de este tipo
package org.dis;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;


public class LeerCSV {

    public List<golfPlayer> parseaCSV(String path) {
        BufferedReader fileReader = new BufferedReader(new FileReader("best-golf-players.csv"));
        CsvToBean csvToBean = new CsvToBeanBuilder(fileReader).withType(golfPlayer.class).withIgnoreLeadingWhiteSpace(true).build();
        List<golfPlayer> players;
        players = CsvToBean.parse();
        return players;
    }
}
