# Java-Spring-MVC

I. Cấu hình:
1. web.xml
 ```
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee 
		 http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
         version="3.1">
</web-app>
```
2. Commons Fileupload:
```
<!-- https://mvnrepository.com/artifact/commons-fileupload/commons-fileupload -->
<dependency>
    <groupId>commons-fileupload</groupId>
    <artifactId>commons-fileupload</artifactId>
    <version>1.3.3</version>
</dependency>
```
II. Code
1. Code upload ảnh từ Android lên Server sử dụng mvc:
```
@RequestMapping(value = "/uploadanh", method = RequestMethod.POST)
	@ResponseBody
	public String uploadFile(@RequestParam("imageFile") MultipartFile imageFile) {
	    System.out.println("Chay duoc");
	    try {
	      String fileName = imageFile.getOriginalFilename();
	      File file = new File("D:\\Acount", fileName);
	      imageFile.transferTo(file);
	    } catch (Exception e) {
	    	System.out.println("Uploadddd Errrorrrr");
	      //e.printStackTrace();
	    }
	    System.out.println("Uploadddd");
	    return "result_ok";
	  }
```

III. Cấu Hình Kết nối CSDL:
1. Thư viện cần:
```
		<!-- Kết nối csdl mysql -->
		<!-- https://mvnrepository.com/artifact/commons-dbcp/commons-dbcp -->
		<dependency>
			<groupId>org.apache.commons</groupId>
			<artifactId>commons-dbcp2</artifactId>
			<version>2.1.1</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.13</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>6.0.6</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
		<dependency>
		    <groupId>org.springframework</groupId>
		    <artifactId>spring-jdbc</artifactId>
		    <version>5.1.5.RELEASE</version>
		</dependency>

```
2. Cấu hình ở bean:
```
	<bean id="corporateEventDao" class="com.example.JdbcCorporateEventDao">
        	<property name="dataSource" ref="dataSource"/>
    	</bean>
	<bean id="dataSource"
		class="org.apache.commons.dbcp.BasicDataSource" destroy-method="close">
		<property name="driverClassName" value="com.mysql.jdbc.Driver" />
		<property name="url" value="jdbc:mysql://localhost:3306/databaseName?serverTimezone=Asia/Ho_Chi_Minh" />
		<property name="username" value="root" />
		<property name="password" value="" />
	</bean>
```
3. Code tạo một class kết nối
```
@Repository
public class DatabaseOrderCoffee{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataOrderCoffee) {
		this.jdbcTemplate = new JdbcTemplate(dataOrderCoffee);
	}
	
	//Các phương thức truy vấn,...
	
}
```
