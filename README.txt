将html文件夹复制到使用的项目的根目录下！！！  
log默认目录"./src/main/resources/main.log"，可通过LogBoot构造函数更改   
application.yml(yaml)文件设置: 如果是properties文件请将后缀该为yml  读取报错请更改编码为UTF-8或去除下面中文  
  
logging:  
  pattern:  
    file: "%d{yyyy年MM月dd日HH:MM:SS}    %level    %class.%thread:%line    %m%n"  
    console: "%d{yyyy年MM月dd日HH:MM:SS}    %level    %class.%thread:%line    %m%n"  
  file:  
    name: src/main/resources/main.log
