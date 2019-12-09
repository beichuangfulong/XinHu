<html>
<head>
  <title>测试报告</title>
</head>
<body>
  <h1>测试报告</h1>
  <p>生成测试报告的时间：${.now?string["yyyy-MM-dd  hh:mm:ss"]}</p>
  <p>共运行了${casesize}条测试用例</p>
  <p>失败了${failedList}条测试用例,成功了${passedList}条测试用例</p>

<table border='1'>
<tr bgcolor='red'>
 <td>以下case执行失败</td><td></td><td></td><td></td>
</tr>
 <tr bgcolor='orange'>
  <td>序号</td><td>名字</td><td>method</td><td>测试结论</td>
 </tr>
<#list failed as case>
    <tr bgcolor='white'>
        <td>${case_index+1}</td><td>${case.name}</td><td>${case.method}</td><td>fail</td>
    </tr>
</#list>
<tr bgcolor='green'>
<td>以下case执行成功</td><td></td><td></td><td></td>
</tr>
 <tr bgcolor='SkyBlue'>
 <td>序号</td><td>名字</td><td>method</td><td>测试结论</td>
 </tr>
<#list pass as case>
    <tr bgcolor='white'>
        <td>${case_index+1}</td><td>${case.name}</td><td>${case.method}</td><td>pass</td>
    </tr>
</#list>
</table>
  
</body>
</html>