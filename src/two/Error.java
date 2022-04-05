package two;

public class Error {
    
    public void  error() throws Exception
    {
        SuperError superError = new SuperError();
        
        try{
            superError.superError();
        }
        catch(Exception ex){
            throw new Exception("class error " + ex.getMessage());
        }
    }
}
