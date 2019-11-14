<html>
<head>
  <title>测试报告</title>
</head>
<body>
  <h1>测试报告</h1>
  <p>生成测试报告的时间：${.now?string["yyyy-MM-dd  hh:mm:ss"]}</p>
  <p>共运行了${casesize}条测试用例</p>
  <p>失败了${failedList}条测试用例,成功了${passedList}条测试用例</p>

<p>执行失败的测试用例</p>
<table border='1'>
 <tr bgcolor='orange'>
 <td>名字</td><td>method</td><td>状态</td>
 </tr>
<#list failed as being>
    <tr bgcolor='red'>
        <td>${being.name}</td><td>${being.method}</td><td>${being.status}</td>
    </tr>
</#list>
</table>

<p>执行成功的测试用例</p>
<table border='1'>
 <tr bgcolor='orange'>
 <td>名字</td><td>method</td><td>状态</td>
 </tr>
<#list pass as being>
    <tr bgcolor='green'>
        <td>${being.name}</td><td>${being.method}</td><td>${being.status}</td>
    </tr>
</#list>
</table>
  
</body>
</html>