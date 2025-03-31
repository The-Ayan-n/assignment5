package config;
public class DatabaseConfig {
    private String jdbcURL = "jdbc:mysql://localhost:3306/mydb";
    private String jdbcUsername = "root";
    private String jdbcPassword = "password";
    public String getJdbcURL() {
        return jdbcURL;
    }
    public String getJdbcUsername() {
        return jdbcUsername;
    }
    public String getJdbcPassword() {
        return jdbcPassword;
    }
}
