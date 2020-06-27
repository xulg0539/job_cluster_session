# job_cluster_session
job for cluster session control by springsession,redis 

作业一：

1）基于SpringBoot整合SSS框架（即整合第一阶段模块三作业第二题内容，含有登录拦截验证）

2）在 1 的基础上开发SpringSession进行Session一致性控制

3）将工程打成war包

4）将war包部署到分布式集群架构中，要求一个Nginx节点，两个Tomcat节点

     —> Nginx（轮询策略） —> Tomcat1—> Tomcat2
        

5）完成测试

注意：作业提交时提交可运行的工程代码（源代码和war包）以及sql脚本，nginx配置及tomcat配置，redis配置统一修改为：

redis.host=localhost

redis.port=6379

redis.connectionTimeout=5000

redis.password=

redis.database=0





实现思路：
1：将之前的sss作业整合为springboot版本，数据源放到配置文件中
2：在启动类上增加注解--@EnableRedisHttpSession，拦截器
3：springboot打包war包

环境搭建：

tomcat，nginx，redis,都是在本地搭建的，没有在虚拟机搭建。



问题：

1：项目部署到tomcat下，war包自动解压后，不改其他配置的话访问项目肯定是http://项目名称/..

这种带项目名称的情况下，首页查看没有问题，但是首页登录提交等其他页面提交都报错，找不到资源

现状是提交会项目名称丢了，导致找不到后台对应的资源，所以需要导师给解答一下，谢谢。



作业二：

请描述你对分布式调度的理解（结合Elastic-Job-lite图文并茂描述）

作业资料说明：

1、提供资料：工程代码和代码war包，sql脚本、nginx配置文件、tomcat配置文件、redis配置文件，功能演示和原理讲解视频，简答题资料。  

2、讲解内容包含：题目分析、实现思路、代码讲解                  

3、效果视频验证：实现Nginx轮询Tomcat1、Tomcat2，对代码工程进行Session一致性控制。
