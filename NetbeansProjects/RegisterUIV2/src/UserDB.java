import java.sql.*;

public class UserDB {
    
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    private Connection con;
    private DatabaseConnection DBCon;
    
    public UserDB(String ip) throws ClassNotFoundException {
        DBCon = new DatabaseConnection(ip);
        con = DBCon.getConnection();  
    }
    
    
    public boolean validate(Contact contact){
        String query = "INSERT INTO contactinformation (date_registered,name,age,gender,churchname,churchpos,churchaddress,district,emailaddress,contactnumber,pastorname,pastorcontact,campsattended,allergies) VALUES(CURRENT_TIMESTAMP,'" 
                + contact.getName() + "','"
                + contact.getAge() + "','"
                + contact.getGender()+ "','"
                + contact.getChurchName()+ "','"
                + contact.getChurchPos()+ "','"
                + contact.getChurchAdd()+ "','"
                + contact.getDistrict()+ "','"
                + contact.getEmail()+ "','"
                + contact.getContact()+ "','"
                + contact.getPastorName()+ "','"
                + contact.getPastorContact()+ "','"
                + contact.getCampsAttended()+ "','"
                + contact.getAllergy()+ "')";
        boolean result = false;
        try{
            st = con.createStatement();
            st.executeUpdate(query);
            result = true;
        }catch(Exception e){
            System.out.println("A database error occured! \n" + e);
            System.out.println(query);
            result = false;
        }
        return result;
    }
}
