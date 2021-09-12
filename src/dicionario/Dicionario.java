
package dicionario;

import java.time.LocalDate;
import java.time.LocalTime;
//import java.time.Month;
import java.util.HashMap;
import java.util.Map;
//import org.json.simple.JSONObject;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
//import java.io.File;
//import java.io.FileWriter;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;
//import javax.json.Json;
//import javax.json.stream.JsonGenerator;
/**
 *
 * @author pokemub
 */
public class Dicionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      Map<String, String> pessoa = new HashMap<>();

         pessoa.put("autor","coord. Disciplina");
         pessoa.put("alias",pessoa.get("autor"));
         pessoa.put("data-atual",String.valueOf(LocalDate.now()));
         pessoa.put("hora-atual",String.valueOf(LocalTime.now()));
         pessoa.put("disciplina","POO");
         LocalDate data_ad1 = LocalDate.of(2021,8,16);
         pessoa.put(String.valueOf(data_ad1),"Lançar AD1 na plataforma");
         pessoa.remove("alias");
         System.out.println(pessoa);
         System.out.println();
         
         Gson gson = new Gson();
         
         JsonObject json = gson.toJsonTree(pessoa).getAsJsonObject();
         System.out.printf( "JSON: %s", json);
         
         String jjson = gson.toJson(json);
         
         FileWriter writer = new FileWriter("d:\\teste\\tes.json");
         writer.write(jjson);
         writer.close();
         
         //writer.write(json);
         
         
         
         
         /*
         FileWriter writer = null;
         try {
         writer = new FileWriter("d:\\teste\\tes.txt");
         
         
          } catch (IOException e) {
              
          }
         
         
          
          // quase certo
          JsonGenerator gen = Json.createGenerator(writer);
          gen.writeStartObject().write(json.toString()).writeEnd();
          gen.close();
          */
         
         
         
         
         //fileWriter.write(json.toString());
         //fileWriter.close();
         /*
         String lu = null ;
         //lu = "lucas";
         Path file = Paths.get("arquivo");
         
         Files.write(file,lu.getBytes(), StandardOpenOption.APPEND);
           */
      
         
    }
    
}
       

      