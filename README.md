实验五 学生选课系统
====
实验目的
----
分析学生选课系统<br>
使用GUI窗体及其组件设计窗体界面<br>
完成学生选课过程业务逻辑编程<br>
基于文件保存并读取数据<br>
处理异常<br>

实验要求
----
### 一、系统角色分析及类设计

例如：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择课程。<br>
定义每种角色人员的属性，及其操作方法。<br>
属性示例：	人员（编号、姓名、性别……）<br>
教师（编号、姓名、性别、所授课程、……）<br>
			学生（编号、姓名、性别、所选课程、……）<br>
			课程（编号、课程名称、上课地点、时间、授课教师、……）<br>
以上属性仅为示例，同学们可以自行扩展。<br>

### 二、要求:

1、	设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。<br>
2、	基于事件模型对业务逻辑编程，实现在界面上支持上述操作。<br>
3、	针对操作过程中可能会出现的各种异常，做异常处理<br>
4、	基于输入/输出编程，支持学生、课程、教师等数据的读写操作。<br>
5、	基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。<br>
6、	本次实验是综合性实验，在40%的实验成绩中占比最大，望同学们认真对待。<br>
7、	提交截止时间：12月8日。<br>

流程图
----
![](https://github.com/Liuone/-5-/blob/master/%E6%B5%81%E7%A8%8B%E5%9B%BE.jpg)

核心代码
----

### 登陆界面

#### 这一部分实现登录验证,账号admin,密码为1234,如果尝试次数太多,将无法登录

```if(e.getSource()==jB1)
	        {
			  if(jF1.getText().equals("admin")&&jP1.getText().equals("1234")) {
				  jL3.setText("输入正确,登录成功");<br>
				  this.dispose();//点击按钮时登录界面销毁,打开选课界面
				  new CourseSelectionFrame();
				  }
				else{
					if(i==0) {//当是0时，我们就无法再次输入了
						jL3.setText("请速与管理员联系");
						System.exit(0);
					}else{
						jL3.setText("输入错误,登录失败,你还剩"+(i)+"次");//提示还有几次机会
					}
	        }
				}
 ```       

![](https://github.com/Liuone/-5-/blob/master/%E7%99%BB%E9%99%86%E5%A4%B1%E8%B4%A5.jpg)

### 选课界面

#### 异常处理

```try{
                    CourseSelectionFrame frame=new CourseSelectionFrame();     // 创建一个窗口
                    frame.setVisible(true);                                    // 让该窗口实例可见
                }catch (Exception e) {
                    e.printStackTrace();
                }
```

#### 以确定按钮为例,添加事件处理

```jbOk.addActionListener(new ActionListener() {           
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder info=new StringBuilder();
                String name=tfName.getText();
                String num=tfNum.getText();
                String sex;
                if(rb1.isSelected()){
                    sex="男";
                }else {
                    sex="女";
                }
                info.append(name+num+sex);
                if(cb1.isSelected()){
                    String c=cb1.getText();
                    String t=t1.getSelectedItem().toString();
                    info.append(":"+c+t);
                }
                if(cb2.isSelected()){
                    String c=cb2.getText();
                    String t=t2.getSelectedItem().toString();
                    info.append(","+c+t);
                }
                if(cb3.isSelected()){
                    String c=cb3.getText();
                    String t=t3.getSelectedItem().toString();
                    info.append(","+c+t);
                }
                allInfo.setText(info.toString());                     // 把学生信息和选课信息放到文本框中               
            }
        });
```

#### 点击退课跳转到退课界面

#### dispose销毁当前页面,new跳转到Quit页面

```dispose();
				new Quit();
```

截图
----

### 登录界面

![](https://github.com/Liuone/-5-/blob/master/%E7%99%BB%E9%99%86%E7%95%8C%E9%9D%A2.jpg)

### 账号密码

![](https://github.com/Liuone/-5-/blob/master/%E8%B4%A6%E5%8F%B7admin%E5%AF%86%E7%A0%811234.jpg)

### 选课系统

![](https://github.com/Liuone/-5-/blob/master/%E9%80%89%E8%AF%BE%E7%B3%BB%E7%BB%9F.jpg)

### 打印结果

![](https://github.com/Liuone/-5-/blob/master/%E6%89%93%E5%8D%B0%E7%BB%93%E6%9E%9C.jpg)

### 退课界面

![](https://github.com/Liuone/-5-/blob/master/%E9%80%80%E8%AF%BE%E7%95%8C%E9%9D%A2.jpg)

实验心得
----

这次实验收获真的太多了,我承认以前的实验,基本每个实验都问同学,这次一丁点都没问,100%自己做的,遇到不会的地方我就上网查,去找各种实验案例,分析别人的代码,我就发现很多代码别人可以用到了我这里就用不了,不是报错就是不显示,比如super.还有一个问题也解决了,就是以前我跳转页面的时候习惯用setVisible(faluse),结果发现这样做只是隐藏,还是会占内存,应该用dispose(),来销毁当前页面.经过多次研究,实现了基本功能,登录,选课,退课,打印选课结果.但是注册界面我还是不会弄,我查阅资料发现基本上注册都需要数据库的支持,希望后续可以学到这些支持来补充上这个页面.

![](https://github.com/Liuone/-5-/blob/master/%E5%AE%9E%E9%AA%8C%E5%BF%83%E5%BE%97.jpg)
