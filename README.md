# nacos-nginx-service-found
-------

## 简介

本项目以Agent的形式让Nginx实现对Nacos的服务发现.
原来的项目地址 https://github.com/YeautyYE/nacos-nginx-template
## 快速启动
#### 配置config.toml

   配置文件使用[TOML](<https://github.com/toml-lang/toml>)进行配置

   demo : {nacos-nginx-service-found.home}/conf/config.toml.example

| 参数               | 描述                                           | 例子                                                    |
| ------------------ | ---------------------------------------------- | ------------------------------------------------------- |
| nginx_cmd          | nginx命令的全路径                              | "/usr/sbin/nginx"                                       |
| nacos_addr         | nacos的地址                                    | "172.16.0.100:8848,172.16.0.101:8848,172.16.0.102:8848" |
| namespace          | nacos的namespace                              | "038a263f-bf7d-4b18-a11e-db8d7021b234" |
| reload_interval    | nginx reload命令执行间隔时间（ms  默认值1000） | 1000                                                    |
| nacos_service_name | nacos服务名                                    | "com.nacos.service.impl.NacosService"                   |
| nginx_config       | 需要修改nginx配置的路径                        | "/etc/nginx/nginx.conf"                                 |
| nginx_upstream     | nginx中upstream的名字                          | "nacos-service"                                         |

 #### 启动

```shell
sh bin/startup.sh
```

# nacos-nginx-service-found
修改点为：增加namespace参数