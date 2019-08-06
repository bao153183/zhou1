/*$("form").serialize()*/

/*
	<tr>
		<td colspan="8">
			<button onclick="getPage(1)">首页</button>
			<button onclick="getPage(${pageUtil.prevPage })">上一页</button>
			当前页：${pageUtil.currentPage }/${pageUtil.totalPage }&nbsp;&nbsp;&nbsp;
			总记录数：${pageUtil.totalCount }
			<button onclick="getPage(${pageUtil.nextPage })">下一页</button>
			<button onclick="getPage(${pageUtil.totalPage })">尾页</button>
		</td>
	</tr>
*/

/*
$.post("",
	$("form").serialize()
,function(){

},"text")
*/
$(function() {
	/*$("#ck").click(function(){
		var flag = $(this).is(":checked");
		$(":checkbox[name='cm']").prop("checked",flag);
	});*/

	/*$(":checkbox[name='cm']").click(function(){
	var len=0;
	$("[name='cm']").map(function(i,dom){
		if($(dom).is(":checked"))
			len++;
	$("#ck").prop("checked",len===$("[name='cm']").length);
	});
});*/
	//全选
	$("th").find(":checkbox").click(function() {
		var flag = $(this).is(":checked");
		$("td").find(":checkbox").prop("checked", flag);
	});

	//反选
	$("#fx").click(function() {
		var len = 0;
		$("td").find(":checkbox").map(function(i, dom) {
			dom.checked = !dom.checked;
			if ($(dom).is(":checked"))
				len++;
		})
		$("th").find(":checkbox").prop("checked", len === $("td").find(":checkbox").length);
	});

	//单个选择
	$("td").find(":checkbox").click(function() {
		var len = 0;
		$("td").find(":checkbox").map(function(i, dom) {
			if ($(dom).is(":checked"))
				len++;
		});
		$("th").find(":checkbox").prop("checked", len === $("td").find(":checkbox").length);
	});
});
	//批量删除 获取ids   var ids=getids()
	function getIds(){
		var ids = "";
		$("td").find(":checkbox").map(function(i, dom) {
			if ($(dom).is(":checked")){
				ids+=","+$(this).val()
			}
		});
		ids = ids.substring(1)
		return ids;
	}
