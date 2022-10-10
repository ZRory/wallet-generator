# wallet-generator

ETH/BSC 钱包生成器，可自由定义前缀，包含，后缀 (当前版本为CPU版本，配置长度过长会造成生成难度指数级增加)

 使用方式：需安装java环境

1.记事本打开application.yml进行期望钱包配置

2.命令行执行java -jar WalletGenerator.jar



如何在您的windows电脑上运行WalletGenerator?

1.如果您的电脑上没有Java环境则需要先安装Java环境：https://www.java.com/zh-CN/

2.下载WalletGenerator.zip

3.将WalletGenerator.zip解压

4.使用记事本打开application.yml文件

    - perfix 后配置你喜欢的前缀 如 0000
    - include 配置你期望的中间值
    - suffix 配置你期望的后缀值

5.打开WalletGenerator.jar所在的文件夹

6.在地址栏输出cmd并按回车

7.在弹出的cmd窗口内键入以下命令：java -jar WalletGenerator.jar

8.在输出中可以看到执行情况，如遇到符合规则钱包将会记录在本文件夹内