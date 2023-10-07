将html文件夹复制到使用的项目的根目录下！！！\n
log默认目录"./src/main/resources/main.log"，可通过LogBoot构造函数更改\n
application.yml(yaml)文件设置:   读取报错请更改编码为UTF-8或去除下面中文\<br>
\<br>
logging:\<br>
  pattern:\<br>
    file: "%d{yyyy年MM月dd日HH:MM:SS}    %level    %class.%thread:%line    %m%n"\<br>
    console: "%d{yyyy年MM月dd日HH:MM:SS}    %level    %class.%thread:%line    %m%n"\<br>
  file:\<br>
    path: src/main/resources\<br>
    name: main.log\<br>
