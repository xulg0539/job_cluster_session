# job_cluster_session
job for cluster session control by springsession,redis 

��ҵһ��

1������SpringBoot����SSS��ܣ������ϵ�һ�׶�ģ������ҵ�ڶ������ݣ����е�¼������֤��

2���� 1 �Ļ����Ͽ���SpringSession����Sessionһ���Կ���

3�������̴��war��

4����war�����𵽷ֲ�ʽ��Ⱥ�ܹ��У�Ҫ��һ��Nginx�ڵ㣬����Tomcat�ڵ�

     ��> Nginx����ѯ���ԣ� ��> Tomcat1��> Tomcat2
        

5����ɲ���

ע�⣺��ҵ�ύʱ�ύ�����еĹ��̴��루Դ�����war�����Լ�sql�ű���nginx���ü�tomcat���ã�redis����ͳһ�޸�Ϊ��

redis.host=localhost

redis.port=6379

redis.connectionTimeout=5000

redis.password=

redis.database=0





ʵ��˼·��
1����֮ǰ��sss��ҵ����Ϊspringboot�汾������Դ�ŵ������ļ���
2����������������ע��--@EnableRedisHttpSession��������
3��springboot���war��

�������

tomcat��nginx��redis,�����ڱ��ش�ģ�û������������



���⣺

1����Ŀ����tomcat�£�war���Զ���ѹ�󣬲����������õĻ�������Ŀ�϶���http://��Ŀ����/..

���ִ���Ŀ���Ƶ�����£���ҳ�鿴û�����⣬������ҳ��¼�ύ������ҳ���ύ�������Ҳ�����Դ

��״���ύ����Ŀ���ƶ��ˣ������Ҳ�����̨��Ӧ����Դ��������Ҫ��ʦ�����һ�£�лл��



��ҵ����

��������Էֲ�ʽ���ȵ���⣨���Elastic-Job-liteͼ�Ĳ�ï������

��ҵ����˵����

1���ṩ���ϣ����̴���ʹ���war����sql�ű���nginx�����ļ���tomcat�����ļ���redis�����ļ���������ʾ��ԭ������Ƶ����������ϡ�  

2���������ݰ�������Ŀ������ʵ��˼·�����뽲��                  

3��Ч����Ƶ��֤��ʵ��Nginx��ѯTomcat1��Tomcat2���Դ��빤�̽���Sessionһ���Կ��ơ�
