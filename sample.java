//JDBC Boiler Plate
import java.sql.*;
public class sample 
{
    private static final String url = "jdbc:mysql://localhost:3306/adlab";
    private static final String username = "root";
    private static final String password = "Arpita@01";
    public static void main(String[] args) throws SQLException
    {
        try
        { 
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver Loading

        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println("ClassNotFound");
        }
        try
        { 
            Connection conn = DriverManager.getConnection(url, username, password);  //Instance of Connection interface which holds the connection created with database 
            String query="INSERT INTO Students(name,age,marks) VALUES(?,?,?)";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,"Ankita");
            ps.setInt(2, 25);
            ps.setDouble(3, 78.9);
            int rows=ps.executeUpdate();
            if(rows>0)
            System.out.println("Data Inserted Successfully");
            else
            System.out.println("Error in query");

            //DELETE
            /*String q3= "Delete from Students WHERE id=2;"; 
            int row1=st.executeUpdate(q3);
            if(row1>0)
            System.out.println("Deleted Successfully");
            else
            System.out.println("Error in query");
            */

            //UPDATE
            /*String q2=String.format("Update Students SET marks=%f WHERE id=%d",90.5,2);
            int row2=st.executeUpdate(q2);
            if(row2>0)
            System.out.println("Query updated Successfully");
            else
            System.out.println("Error in query");
            */

            //INSERT
            /*String q1=String.format("Insert into Students(name,age,marks) values('%s',%o,%f)","Vishal",25,78.5,"Rina",30,78);
            int rows=st.executeUpdate(q1);
            if(rows>0)
            System.out.println("Query executed Successfully");
            else
            System.out.println("Error in query");
            */
             
            //RETRIEVE
            /*Statement st=conn.createStatement(); //Used to execute query and retrieve results from database
            String q= "select * from Students;";  //Creating query
            ResultSet rs=st.executeQuery(q); // Passing the query, ResultSet interface instance holds the query to give output in tabular format
            while(rs.next())  //to print all rows in the table, after that loop terminates
            {
                int id=rs.getInt("id");
                String name=rs.getString("name");
                int age=rs.getInt("age");
                double marks=rs.getDouble("marks");
                System.out.println("ID:"+id);
                System.out.println("NAME:"+name);
                System.out.println("AGE:"+age);
                System.out.println("MARKS:"+marks);
                
            } */
        } 
        catch (SQLException e) 
        {
            System.out.println("Connection Failed");
        }
    }
}
