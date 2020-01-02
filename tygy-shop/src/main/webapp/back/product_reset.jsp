<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"
	isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>修改商品信息</title>
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.css" />
<link rel="stylesheet" href="css/styles.css" />
<link rel="stylesheet" href="css/toastr.css" />
<link rel="stylesheet" href="css/fullcalendar.css" />
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/jquery.knob.js"></script>
<script src="js/jquery.sparkline.min.js"></script>
<script src="js/toastr.js"></script>
<script src="js/jquery.tablesorter.min.js"></script>
<script src="js/jquery.peity.min.js"></script>
<script src="js/fullcalendar.min.js"></script>
<script src="js/gcal.js"></script>
<script src="js/setup.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
<script type="text/javascript">
	function price(){
		var np=$("#np");
		if(/\D/.test(np.val())){
			alert("请您输入正确的数值！");
		}
		else
		$("#mp").val(Math.round(np.val()*0.8*100.0)/100.0);
	}
</script>
<script>
	$(function(){
		$.ajax({
			url:"findGrade.category",
			dataType:"json",
		//	data:"grade="+${p.category.grade},
			success:function(categories){
				for(let i in categories){
					let c=categories[i];
					
					$("<option value='"+c.id+"'> "+c.name+"</option>").appendTo("#findGrade");
					
				}
			}
		});
	});
</script>
</head>
<body>
<%@include file="header.jsp" %>
	<div class="page">
		<div class="page-container">
			<div class="container">
				<div class="row">
					<div class="span12">
						<h4 class="header">添加新品</h4>
						<form action="reset.product" method="post">
							<table class="table table-striped sortable">
								<thead>
								</thead>
								<tbody>
									<tr>
										<th>商品名称</th>
										<td>
										<input type="text" name="name" value="${p.name }"/>
										<input
											type="hidden" name="id" value="${p.id }" /></td>
									</tr>
									<tr>
										<th>商品描述</th>
										
										<td>
										<textarea cols="20" rows="5" name="descr">${p.descr }</textarea>
										</td>
									</tr>
									<tr>
										<th>普通价格</th>
										<td>&yen;<input id="np" name="np" onchange="price()" value="${p.normalprice }"/>
										</td>
									</tr>
										<tr>
										<th>会员价格</th>
										<td>&yen;<input id="mp" name="mp" onchange="mpp()" value="${p.memberprice }" readonly="readonly"/>					
										</td>
									</tr>
 
									<tr>
										<th>商品类别</th>
										<td>  <select id="findGrade" name="cid">
											
												
											
											</select> </td>
									</tr>

									<tr>
										<td></td>
										<td><input class="btn btn-success" type="submit"
											value="修改" /></td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
								</tbody>
							</table>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
<%@include file="footer.jsp" %>
</body>
<script src="js/d3-setup.js"></script>
<script>
	protocol = window.location.protocol === 'http:' ? 'ws://' : 'wss://';
	address = protocol + window.location.host + window.location.pathname
			+ '/ws';
	socket = new WebSocket(address);
	socket.onmessage = function(msg) {
		msg.data == 'reload' && window.location.reload()
	}
</script>
</html>