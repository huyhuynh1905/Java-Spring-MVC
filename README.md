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
