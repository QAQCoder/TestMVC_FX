package main;

public class SystemProperty {

    public static void main(String args[]) {
        System.out.println("Java 运行时环境供应商:" + System.getProperty("java.vendor"));//Java 运行时环境供应商
        System.out.println("Java 供应商的 URL:"
                + System.getProperty("java.vendor.url"));//Java 供应商的 URL
        System.out.println("java 安装目录:" + System.getProperty("java.home"));//java 安装目录
        System.out.println("Java 类格式版本号:"
                + System.getProperty("java.class.version"));//Java 类格式版本号
        System.out.println("Java 类路径:"
                + System.getProperty("java.class.path"));//Java 类路径
        System.out.println("操作系统的名称:" + System.getProperty("os.name"));
        System.out.println("操作系统的架构:" + System.getProperty("os.arch"));
        System.out.println("操作系统的版本:" + System.getProperty("os.version"));
        System.out.println("用户的账户名称:" + System.getProperty("user.name"));
        System.out.println("用户的主目录:" + System.getProperty("user.home"));
        System.out.println("用户的当前工作目录:" + System.getProperty("user.dir"));
        System.out.println("Java 虚拟机规范版本:"
                + System.getProperty("java.vm.specification.version"));
        System.out.println("Java 虚拟机规范供应商:"
                + System.getProperty("java.vm.specification.vendor"));
        System.out.println("Java 虚拟机规范名称:"
                + System.getProperty("java.vm.specification.name"));
        System.out.println("Java 虚拟机实现版本:"
                + System.getProperty("java.vm.version"));
        System.out.println("Java 虚拟机实现供应商:"
                + System.getProperty("java.vm.vendor"));
        System.out
                .println("Java 虚拟机实现名称:" + System.getProperty("java.vm.name"));
        System.out.println("一个或多个扩展目录的路径:"
                + System.getProperty("java.ext.dirs"));
        System.out.println("文件分隔符:"
                + System.getProperty("file.separator"));
        System.out.println("路径分隔符:"
                + System.getProperty("path.separator"));
        System.out.println("行分隔符:"
                + System.getProperty("line.separator"));
    }
}