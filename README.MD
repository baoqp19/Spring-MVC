# THÔNG TIN LIÊN HỆ 
 Quốc Bảo: https://facebook.com/pqbao.05

# XEM TẤT CẢ CÁC BEAN 
 -- BỎ TRONG FILE MAIN XÓA MANI ĐI 
ApplicationContext abc = SpringApplication.run(Demo1Application.class, args);
for(String s: abc.getBeanDefinitionNames())
{
printf(s)
}

# bean 
bean là đối tượng mà spring container quản lý, nó có thể là bất kỳ lớp nào mà spring muốn quản lý. spring container chịu trách nhiệm tạo cấu hình, quản lý, vòng đời của bean
@bean là  trong file cấu hình để định nghĩa một phương thức cấu hình 
ComponentScan nó sẽ quét và đăng kí các bean trong container @Service @Repositoty @Controller là 

# Inversion of Control (IoC) and Dependency injection (tiêm) 
-- là 1 cách thức viết code giúp quản lý phụ thuộc từ các đối tượng. giúp linh hoạt, dễ bảo trì và mở rộng 
---“tightly coupled” và “loosely coupled”---

# ** là css/baodeptrai/baohay/demo.css thì đều dc