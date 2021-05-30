
var prefix = "/wuliao/wuliaoshangliaoshunxubiao"
$(function() {
	load();
});

function load() {
	$('#exampleTable')
			.bootstrapTable(
					{
						method : 'get', // 服务器数据的请求方式 get or post
						url : prefix + "/list2", // 服务器数据的加载地址
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
						//日期格式转换
						// responseHandler:function(res){
						// 	console.log(res);
						// 	var data = res.rows;
						// 	for(var i=0;i<data.length;i++){
						// 		//var oldNianyueri = data[i]['nianyueri'];
						// 		//data[i]['nianyueri'] =/\d{4}-\d{1,2}-\d{1,2}/g.exec(oldNianyueri);
						// 		var oldRiqi = data[i]['riqi'];
						// 		data[i]['riqi'] =/\d{4}-\d{1,2}-\d{1,2}/g.exec(oldRiqi);
						// 	}
						// 	return res;
						// },
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
								// 								{
								// 	field : 'id',
								// 	title : 'ID'
								// },
																{
									field : 'luci',
									title : '炉次'
								},
							{
								field : 'liaocanghao1',
								title : '料仓号'
							},

							{
								field : 'cl1mingcheng',
								title : '材料1名称'
							},
							{
								field : 'cl1shengyuliang',
								title : '材料1剩余量'
							},
							{
								field : 'liaocanghao2',
								title : '料仓号'
							},

							{
								field : 'cl2mingcheng',
								title : '材料2名称'
							},
							{
								field : 'cl2shengyuliang',
								title : '材料2剩余量'
							},
							{
								field : 'liaocanghao3',
								title : '料仓号'
							},

							{
								field : 'cl3mingcheng',
								title : '材料3名称'
							},
							{
								field : 'cl3shengyuliang',
								title : '材料3剩余量'
							},
							{
								field : 'liaocanghao4',
								title : '料仓号'
							},

							{
								field : 'cl4mingcheng',
								title : '材料4名称'
							},
							{
								field : 'cl4shengyuliang',
								title : '材料4剩余量'
							},
							{
								field : 'liaocanghao5',
								title : '料仓号'
							},

							{
								field : 'cl5mingcheng',
								title : '材料5名称'
							},
							{
								field : 'cl5shengyuliang',
								title : '材料5剩余量'
							},
							{
								field : 'liaocanghao6',
								title : '料仓号'
							},

							{
								field : 'cl6mingcheng',
								title : '材料6名称'
							},
							{
								field : 'cl6shengyuliang',
								title : '材料6剩余量'
							},
							{
								field : 'liaocanghao7',
								title : '料仓号'
							},

							{
								field : 'cl7mingcheng',
								title : '材料7名称'
							},
							{
								field : 'cl7shengyuliang',
								title : '材料7剩余量'
							},
							{
								field : 'liaocanghao8',
								title : '料仓号'
							},

							{
								field : 'cl8mingcheng',
								title : '材料8名称'
							},
							{
								field : 'cl8shengyuliang',
								title : '材料8剩余量'
							},
							{
								field : 'liaocanghao9',
								title : '料仓号'
							},

							{
								field : 'cl9mingcheng',
								title : '材料9名称'
							},
							{
								field : 'cl9shengyuliang',
								title : '材料9剩余量'
							},
							{
								field : 'liaocanghao10',
								title : '料仓号'
							},

							{
								field : 'cl10mingcheng',
								title : '材料10名称'
							},
							{
								field : 'cl10shengyuliang',
								title : '材料10剩余量'
							},
							{
								field : 'liaocanghao11',
								title : '料仓号'
							},

							{
								field : 'cl11mingcheng',
								title : '材料11名称'
							},
							{
								field : 'cl11shengyuliang',
								title : '材料11剩余量'
							},
							{
								field : 'liaocanghao12',
								title : '料仓号'
							},

							{
								field : 'cl12mingcheng',
								title : '材料12名称'
							},
							{
								field : 'cl12shengyuliang',
								title : '材料12剩余量'
							},
							{
								field : 'liaocanghao13',
								title : '料仓号'
							},

							{
								field : 'cl13mingcheng',
								title : '材料13名称'
							},
							{
								field : 'cl13shengyuliang',
								title : '材料13剩余量'
							},
							{
								field : 'liaocanghao14',
								title : '料仓号'
							},

							{
								field : 'cl14mingcheng',
								title : '材料14名称'
							},
							{
								field : 'cl14shengyuliang',
								title : '材料14剩余量'
							},
							{
								field : 'liaocanghao15',
								title : '料仓号'
							},

							{
								field : 'cl15mingcheng',
								title : '材料15名称'
							},
							{
								field : 'cl15shengyuliang',
								title : '材料15剩余量'
							},
							{
								field : 'liaocanghao16',
								title : '料仓号'
							},

							{
								field : 'cl16mingcheng',
								title : '材料16名称'
							},
							{
								field : 'cl16shengyuliang',
								title : '材料16剩余量'
							},
							{
								field : 'liaocanghao17',
								title : '料仓号'
							},

							{
								field : 'cl17mingcheng',
								title : '材料17名称'
							},
							{
								field : 'cl17shengyuliang',
								title : '材料17剩余量'
							},
							{
								field : 'liaocanghao18',
								title : '料仓号'
							},

							{
								field : 'cl18mingcheng',
								title : '材料18名称'
							},
							{
								field : 'cl18shengyuliang',
								title : '材料18剩余量'
							},
							{
								field : 'liaocanghao19',
								title : '料仓号'
							},

							{
								field : 'cl19mingcheng',
								title : '材料19名称'
							},
							{
								field : 'cl19shengyuliang',
								title : '材料19剩余量'
							},
							{
								field : 'liaocanghao20',
								title : '料仓号'
							},

							{
								field : 'cl20mingcheng',
								title : '材料20名称'
							},
							{
								field : 'cl20shengyuliang',
								title : '材料20剩余量'
							}

								]
					});
}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');
}
