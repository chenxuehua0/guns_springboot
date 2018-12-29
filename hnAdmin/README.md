**项目说明** 
- renren-security是一个轻量级权限管理系统，其核心设计目标是开发迅速、学习简单、轻量级、易扩展
- 使用renren-security搭建项目，只需编写30%左右代码，其余的代码交给系统自动生成


**具有如下特点** 
- 轻量级的权限系统，只涉及Spring、Shiro、Mybatis后端框架，降低学习使用成本
- 友好的代码结构及注释，便于阅读及二次开发
- 支持HTML、JSP、Velocity、Freemarker等视图，零技术门槛
- 灵活的权限控制，可控制到页面或按钮，满足绝大部分的权限需求
- 页面交互使用Vue2.x，极大的提高了开发效率
- 完善的代码生成机制，可在线生成entity、xml、dao、service、html、js、sql代码，减少70%以上的开发任务
- 引入quartz定时任务，可动态完成任务的添加、修改、删除、暂停、恢复及日志查看等功能
- 引入API模板，根据token作为登录令牌，极大的方便了APP接口开发
- 引入Hibernate Validator校验框架，轻松实现后端校验
- 引入云存储服务，已支持：七牛云、阿里云、腾讯云等
- 引入路由机制，刷新页面会停留在当前页

**项目结构** 
hnAdmin
├─doc  项目SQL语句
├─src/main/java
│  ├─io.looyoo.aop 日志切面
│  ├─io.looyoo.api 接口开发
│  ├─io.looyoo.common 通用公共(mybatis配置,任务调度配置,日期工具类等)
│  ├─io.looyoo.shiro 权限模块
│  └─io.looyoo.sys	系统管理模块
│ 
├─src/main/resource
│  ├─io.looyoo	mybatis mapper文件目录
│  ├─mybatisplus mybatisplus配置文件目录
│  ├─template 代码生成模板
│  ├─db.properties 数据看配置文件
│  ├─generator.properties	代码生成配置文件
│  ├─log4j.properties		日志配置文件
│  ├─looyoo-api.xml			 api配置文件
│  ├─looyoo-scheduler.xml	任务调度配置文件
│  ├─looyoo-shiro.xml		shiro权限配置文件
│  ├─mybatis.xml			mybatis配置文件
│  ├─spring-jdbc.xml		spring配置文件
│  ├─spring-mvc.xml		spring配置文件
│ 
├─src/main/webapp
│  ├─js 系统业务js代码
│  ├─statics 第三方库、插件等静态资源
│  ├─index.html AdminLTE主题风格（默认主题）
│  └─index1.html Layui主题风格



 **技术选型：** 
- 核心框架：Spring Framework 4.3
- 安全框架：Apache Shiro 1.3
- 视图框架：Spring MVC 4.3
- 持久层框架：MyBatis 3.3
- 持久层插件：MyBatis-Plus 2.1.8
- 定时器：Quartz 2.2
- 数据库连接池：Druid 1.0
- 日志管理：SLF4J 1.7、Log4j
- 页面交互：Vue2.x


 **软件需求** 
- JDK1.7+
- MySQL5.5+
- Tomcat7.0+
- Maven3.0+

功能列表如下:
1、用户管理
2、角色管理
3、菜单管理
4、SQL监控
5、定时任务
6、参数管理
7、文件上传
8、系统日志
9、代码生成。


 **本地部署**
- 创建数据库renren-security，数据库编码为UTF-8
- 执行doc/db.sql文件，初始化数据【按需导入表结构及数据】
- 修改db.properties文件，更新MySQL账号和密码
- Eclipse、IDEA执行【clean package tomcat7:run】命令，即可运行项目
- 项目访问路径：http://localhost:8080/alooyoo
- 账号密码：admin/111111
