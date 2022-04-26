package two;

import java.io.BufferedReader;
import java.io.FileReader;

public class Error {
    
    public void  error() throws Exception
    {
        SuperError superError = new SuperError();
        
        try(BufferedReader br = new BufferedReader(new FileReader("newjson.json"))) {
            superError.superError();
        } catch(Exception ex) {
            throw new Exception("class error " + ex.getMessage());
        }
    }
}
