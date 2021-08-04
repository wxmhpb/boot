

$().ready(function() {
	validateRule();
});

$.validator.setDefaults({
	submitHandler : function() {
		save();
	}
});

$("#gangzhongzu").change(function () {
	var id = $("#gangzhongzu").val();
	if (id == null) {
		return;
	}
	$.ajax({
		cache: true,
		type: "get",
		url: "/system/chanpinxinxi/queryList2",
		data: {"id": id},
		success: function (data) {
			console.log(data);
			var luci = $("#luci").empty();
			for (var i = 0; i < data.length; i++) {
				luci.append("<option value = '"+ data[i].name + "'>" + data[i].name + "</option>");
			}
		}
	})
})


function save() {
	$.ajax({
		cache : true,
		type : "POST",
		url : "/wuliao/gongyidan/save",
		data : $('#signupForm').serialize(),// 你的formid
		async : false,
		error : function(request) {
			parent.layer.alert("Connection error");
		},
		success : function(data) {
			if (data.code == 0) {
				parent.layer.msg("操作成功");
				parent.reLoad();
				var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
				parent.layer.close(index);

			} else {
				parent.layer.alert(data.msg)
			}

		}
	});

}
function validateRule() {
	var icon = "<i class='fa fa-times-circle'></i> ";
	$("#signupForm").validate({
		rules : {
			name : {
				required : true
			}
		},
		messages : {
			name : {
				required : icon + "请输入姓名"
			}
		}
	})
}


// $(function(){
// 	var oldVal="";
// 	$('.form-group select').each(function() {
// 		if ($(this).find("option:selected")) {
// 			var _thisVal = $(this).find('option:selected').val();
// 			oldVal=$(this).attr("old",_thisVal)
// 			$('.form-group select').parent().siblings("div").find("option[value="+_thisVal+"]").not("option[value=0]").hide()
// 		}
// 	})
//
// 	$(".form-group select").change(function(){
// 		oldVal=$(this).attr("old");
// 		var _thisVal=$(this).find('option:selected').val();
// 		var id=$(this).attr("id");
// 		$(this).parent().siblings("div").find("option[value="+_thisVal+"]").not("option[value=0]").hide();
// 		$(this).parent().siblings("div").find("option[value="+oldVal+"]").show();
// 		$(this).find("option[value="+oldVal+"]").show();
// 		$(this).attr("old",_thisVal)
// 	})
// })

$("#gangzhongzu").change(function () {
	var id = $("#gangzhongzu").val();

	if (id == null) {
		return;
	}
	$.ajax({
		cache: true,
		type: "get",
		url: "/system/chanpinxinxi/queryList2",
		data: {"id": id},
		success: function (data) {
			var luci = $("#luci").empty();
			for (var i = 0; i < data.length; i++) {
				luci.append("<option value = '"+ data[i].id + "'>" + data[i].name + "</option>");
			}
		}
	})
})

$("#luci").change(function () {
	var id = $("#luci").val();

	if (id == null) {
		return;
	}
	$.ajax({
		cache: true,
		type: "get",
		url: "/system/chanpinxinxi/queryList3",
		data: {"id": id},
		success: function (data) {
			console.log(data)
			var jihao = $("#jihao").empty();
			for (var i = 0; i < data.length; i++) {
				jihao.append("<option value = '"+ data[i].name + "'>" + data[i].name + "</option>");
			}
		}
	})
})
