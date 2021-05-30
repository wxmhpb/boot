
var prefix = "/wuliao/gongyidan"
$(function() {
	load();
});

function load() {
	$('#exampleTable')
			.bootstrapTable(
					{
						method : 'get', // 服务器数据的请求方式 get or post
						url : prefix + "/list", // 服务器数据的加载地址
					//	showRefresh : true,
					//	showToggle : true,
					//	showColumns : true,
						iconSize : 'outline',
						toolbar : '#exampleToolbar',
						striped : true, // 设置为true会有隔行变色效果
						dataType : "json", // 服务器返回的数据类型
						pagination : true, // 设置为true会在底部显示分页条
						// queryParamsType : "limit",
						// //设置为limit则会发送符合RESTFull格式的参数
						singleSelect : false, // 设置为true将禁止多选
						// contentType : "application/x-www-form-urlencoded",
						// //发送到服务器的数据编码类型
						pageSize : 10, // 如果设置了分页，每页数据条数
						pageNumber : 1, // 如果设置了分布，首页页码
						//search : true, // 是否显示搜索框
						showColumns : false, // 是否显示内容下拉框（选择显示的列）
						sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
						queryParams : function(params) {
							return {
								//说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
								limit: params.limit,
								offset:params.offset
					           // name:$('#searchName').val(),
					           // username:$('#searchName').val()
							};
						},
						// //请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
						// queryParamsType = 'limit' ,返回参数必须包含
						// limit, offset, search, sort, order 否则, 需要包含:
						// pageSize, pageNumber, searchText, sortName,
						// sortOrder.
						// 返回false将会终止请求
						columns : [
								{
									checkbox : true
								},
																{
									field : 'id', 
									title : 'ID' 
								},

							{
								field : 'gangzhongzu',
								title : '钢种组'
							},
							{
								field : 'luci',
								title : '炉次'
							},

							{
								field : 'jihao',
								title : '出钢记号'
							},
																{
									field : 'cl1mingcheng', 
									title : '材料1名称' 
								},
																{
									field : 'cl1shuliang', 
									title : '材料1数量' 
								},
																{
									field : 'cl2mingcheng', 
									title : '材料2名称' 
								},
																{
									field : 'cl2shuliang', 
									title : '材料2数量' 
								},
																{
									field : 'cl3mingcheng', 
									title : '材料3名称' 
								},
																{
									field : 'cl3shuliang', 
									title : '材料3数量' 
								},
																{
									field : 'cl4mingcheng', 
									title : '材料4名称' 
								},
																{
									field : 'cl4shuliang', 
									title : '材料4数量' 
								},
																{
									field : 'cl5mingcheng', 
									title : '材料5名称' 
								},
																{
									field : 'cl5shuliang', 
									title : '材料5数量' 
								},
																{
									field : 'cl6mingcheng', 
									title : '材料6名称' 
								},
																{
									field : 'cl6shuliang', 
									title : '材料6数量' 
								},
																{
									field : 'cl7mingcheng', 
									title : '材料7名称' 
								},
																{
									field : 'cl7shuliang', 
									title : '材料7数量' 
								},
																{
									field : 'cl8mingcheng', 
									title : '材料8名称' 
								},
																{
									field : 'cl8shuliang', 
									title : '材料8数量' 
								},
																{
									field : 'cl9mingcheng', 
									title : '材料9名称' 
								},
																{
									field : 'cl9shuliang', 
									title : '材料9数量' 
								},
																{
									field : 'cl10mingcheng', 
									title : '材料10名称' 
								},
																{
									field : 'cl10shuliang', 
									title : '材料10数量' 
								},
																{
									field : 'cl11mingcheng', 
									title : '材料11名称' 
								},
																{
									field : 'cl11shuliang', 
									title : '材料11数量' 
								},
																{
									field : 'cl12mingcheng', 
									title : '材料12名称' 
								},
																{
									field : 'cl12shuliang', 
									title : '材料12数量' 
								},
																{
									field : 'cl13mingcheng', 
									title : '材料13名称' 
								},
																{
									field : 'cl13shuliang', 
									title : '材料13数量' 
								},
																{
									field : 'cl14mingcheng', 
									title : '材料14名称' 
								},
																{
									field : 'cl14shuliang', 
									title : '材料14数量' 
								},
																{
									field : 'cl15mingcheng', 
									title : '材料15名称' 
								},
																{
									field : 'cl15shuliang', 
									title : '材料15数量' 
								},
																{
									field : 'cl16mingcheng', 
									title : '材料16名称' 
								},
																{
									field : 'cl16shuliang', 
									title : '材料16数量' 
								},
																{
									field : 'cl17mingcheng', 
									title : '材料17名称' 
								},
																{
									field : 'cl17shuliang', 
									title : '材料17数量' 
								},
																{
									field : 'cl18mingcheng',
									title : '材料18名称'
								},
																{
									field : 'cl18shuliang',
									title : '材料18数量'
								},
																{
									field : 'cl19mingcheng',
									title : '材料19名称'
								},
																{
									field : 'cl19shuliang',
									title : '材料19数量'
								},
																{
									field : 'cl20mingcheng',
									title : '材料20名称'
								},
																{
									field : 'cl20shuliang',
									title : '材料20数量'
								},
																{
									field : 'zhuangtai', 
									title : '状态' 
								},
																{
									field : 'beizhu', 
									title : '备注' 
								},
																{
									title : '操作',
									field : 'id',
									align : 'center',
									formatter : function(value, row, index) {
										var e = '<a class="btn btn-primary btn-sm '+s_edit_h+'" href="#" mce_href="#" title="编辑" onclick="edit(\''
												+ row.id
												+ '\')"><i class="fa fa-edit"></i></a> ';
										var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
												+ row.id
												+ '\')"><i class="fa fa-remove"></i></a> ';
										var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
												+ row.id
												+ '\')"><i class="fa fa-key"></i></a> ';
										return e + d ;
									}
								} ]
					});
}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');
}
function add() {
	layer.open({
		type : 2,
		title : '增加',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/add' // iframe的url
	});
}
function edit(id) {
	layer.open({
		type : 2,
		title : '编辑',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/edit/' + id // iframe的url
	});
}
function remove(id) {
	layer.confirm('确定要删除选中的记录？', {
		btn : [ '确定', '取消' ]
	}, function() {
		$.ajax({
			url : prefix+"/remove",
			type : "post",
			data : {
				'id' : id
			},
			success : function(r) {
				if (r.code==0) {
					layer.msg(r.msg);
					reLoad();
				}else{
					layer.msg(r.msg);
				}
			}
		});
	})
}

function resetPwd(id) {
}
function batchRemove() {
	var rows = $('#exampleTable').bootstrapTable('getSelections'); // 返回所有选择的行，当没有选择的记录时，返回一个空数组
	if (rows.length == 0) {
		layer.msg("请选择要删除的数据");
		return;
	}
	layer.confirm("确认要删除选中的'" + rows.length + "'条数据吗?", {
		btn : [ '确定', '取消' ]
	// 按钮
	}, function() {
		var ids = new Array();
		// 遍历所有选择的行数据，取每条数据对应的ID
		$.each(rows, function(i, row) {
			ids[i] = row['id'];
		});
		$.ajax({
			type : 'POST',
			data : {
				"ids" : ids
			},
			url : prefix + '/batchRemove',
			success : function(r) {
				if (r.code == 0) {
					layer.msg(r.msg);
					reLoad();
				} else {
					layer.msg(r.msg);
				}
			}
		});
	}, function() {

	});
}