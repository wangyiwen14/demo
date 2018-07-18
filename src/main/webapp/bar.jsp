<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>My JSP 'bar.jsp' starting page</title>   
	<script type="text/javascript" src="js/echarts.min.js"></script>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	

  </head>
  
  <body>
  <div id="main" style="width:600px;height:400px;"></div>
  
  <script type="text/javascript">
   var myecharts=echarts.init(document.getElementById("main"));
   
   var option={
        title:{
          text:"Echarts柱状图演示"
        },
        xAxis:{
           data:[]
        },
        yAxis:{},
        series:[{
          name:"成绩",
          type:'bar',
          data:[]
        }]
   
   };
     myecharts.setOption(option);
   //显示加载动画
   myecharts.showLoading();
   //定义2个数组，存储学生姓名、成绩
   var names=[];
   var scores=[];
   //发出ajax请求
   $.ajax({
     type:'post',
     async:true,
     url:"getallstu",
     data:{},
     dataType:'json',
     success:function(result){
        if(result){
           for(var i=0;i<result.length;i++){
              //alert(result[i].name);
             // alert(result[i].score);
             names.push(result[i].name);
             scores.push(result[i].score);
           }
            //隐藏加载动画
           myecharts.hideLoading();
           //设置echarts的配置项
           myecharts.setOption({
             xAxis:{
                data:names
            },
            series:[{               
                data:scores
             }]
            
           });
          
        }
     },
     error:function(errorMsg){
       alert("图表数据请求失败");
     }
   })
   
 
  
  </script>
  </body>
</html>
