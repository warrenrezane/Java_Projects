package Connection;

import Classes.Contact;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.commons.dbutils.DbUtils;

public class UserDB {
    
    private Statement st;
    private ResultSet rs;
    private Connection con;
    private DatabaseConnection DBCon;
    
    private String error;
    
    public UserDB() {
        DBCon = new DatabaseConnection();
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
        boolean result;
        try {
            st = con.createStatement();
            st.executeUpdate(query);
            result = true;
        } catch (Exception e){
            setError(e.getMessage());
            result = false;
        }
        finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(st);
            DbUtils.closeQuietly(con);
        }
        return result;
    }

    public String getError() {
        return this.error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
