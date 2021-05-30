

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

// select_a=document.getElementById('cailiao1');
// select_b=document.getElementById('cailiao2');
// select_c=document.getElementById('cailiao3');
// select_d=document.getElementById('cailiao4');
// select_e=document.getElementById('cailiao5');
// select_f=document.getElementById('cailiao6');
// select_g=document.getElementById('cailiao7');
// select_h=document.getElementById('cailiao8');
// select_i=document.getElementById('cailiao9');
// select_j=document.getElementById('cailiao10');
// select_k=document.getElementById('cailiao11');
// select_l=document.getElementById('cailiao12');
// select_m=document.getElementById('cailiao13');
// select_n=document.getElementById('cailiao14');
// select_o=document.getElementById('cailiao15');
// select_p=document.getElementById('cailiao16');
// select_q=document.getElementById('cailiao17');
// select_r=document.getElementById('cailiao18');
// select_s=document.getElementById('cailiao19');
// select_t=document.getElementById('cailiao20');
//
// s_a_child=select_a.children;
// s_b_child=select_b.children;
// s_c_child=select_c.children;
// s_d_child=select_d.children;
// s_e_child=select_e.children;
// s_f_child=select_f.children;
// s_g_child=select_g.children;
// s_h_child=select_h.children;
// s_i_child=select_i.children;
// s_j_child=select_j.children;
// s_k_child=select_k.children;
// s_l_child=select_l.children;
// s_m_child=select_m.children;
// s_n_child=select_n.children;
// s_o_child=select_o.children;
// s_p_child=select_p.children;
// s_q_child=select_q.children;
// s_r_child=select_r.children;
// s_t_child=select_t.children;
//
// //创建三个变量，用来分别接收被选中的option的索引值
// var a= 0,b= 0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0;
// //当selection标签发生状态改变时
// select_a.onchange=function(){
// 	//循环遍历selection标签
// 	for (var i=0;i<s_a_child.length;i++) {
// 		//当检测到有标签处于选中状态时
// 		if (s_a_child[i].selected) {
// 			//先把上一个被选中的option标签的disabled变为false
// 			s_b_child[a].disabled=false;
// 			s_c_child[a].disabled=false;
// 			//再存储这次选中的option标签的索引值
// 			a=i;
// 			//再把这次选中的标签的索引值得option的disabled变为true
// 			s_b_child[i].disabled=true;
// 			s_c_child[i].disabled=true;
// 		}
// 	};
// };
//
// select_b.onchange=function(){
// 	for (var i=0;i<s_b_child.length;i++) {
// 		if (s_b_child[i].selected) {
// 			s_a_child[b].disabled=false;
// 			s_c_child[b].disabled=false;
// 			b=i;
// 			s_a_child[i].disabled=true;
// 			s_c_child[i].disabled=true;
// 		}
// 	}
// }
// select_c.onchange=function(){
// 	for (var i=0;i<s_c_child.length;i++) {
// 		if (s_c_child[i].selected) {
// 			s_b_child[c].disabled=false;
// 			s_a_child[c].disabled=false;
// 			c=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 		}
// 	};
// };
// select_d.onchange=function(){
// 	for (var i=0;i<s_d_child.length;i++) {
// 		if (s_d_child[i].selected) {
// 			s_b_child[d].disabled=false;
// 			s_a_child[d].disabled=false;
// 			s_c_child[d].disabled=false;
// 			d=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 			s_c_child[i].disabled=true;
// 		}
// 	};
// };
// select_c.onchange=function(){
// 	for (var i=0;i<s_c_child.length;i++) {
// 		if (s_c_child[i].selected) {
// 			s_b_child[c].disabled=false;
// 			s_a_child[c].disabled=false;
// 			c=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 		}
// 	};
// };
// select_c.onchange=function(){
// 	for (var i=0;i<s_c_child.length;i++) {
// 		if (s_c_child[i].selected) {
// 			s_b_child[c].disabled=false;
// 			s_a_child[c].disabled=false;
// 			c=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 		}
// 	};
// };
// select_c.onchange=function(){
// 	for (var i=0;i<s_c_child.length;i++) {
// 		if (s_c_child[i].selected) {
// 			s_b_child[c].disabled=false;
// 			s_a_child[c].disabled=false;
// 			c=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 		}
// 	};
// };
// select_c.onchange=function(){
// 	for (var i=0;i<s_c_child.length;i++) {
// 		if (s_c_child[i].selected) {
// 			s_b_child[c].disabled=false;
// 			s_a_child[c].disabled=false;
// 			c=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 		}
// 	};
// };
// select_c.onchange=function(){
// 	for (var i=0;i<s_c_child.length;i++) {
// 		if (s_c_child[i].selected) {
// 			s_b_child[c].disabled=false;
// 			s_a_child[c].disabled=false;
// 			c=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 		}
// 	};
// };
// select_c.onchange=function(){
// 	for (var i=0;i<s_c_child.length;i++) {
// 		if (s_c_child[i].selected) {
// 			s_b_child[c].disabled=false;
// 			s_a_child[c].disabled=false;
// 			c=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 		}
// 	};
// };
// select_c.onchange=function(){
// 	for (var i=0;i<s_c_child.length;i++) {
// 		if (s_c_child[i].selected) {
// 			s_b_child[c].disabled=false;
// 			s_a_child[c].disabled=false;
// 			c=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 		}
// 	};
// };
// select_c.onchange=function(){
// 	for (var i=0;i<s_c_child.length;i++) {
// 		if (s_c_child[i].selected) {
// 			s_b_child[c].disabled=false;
// 			s_a_child[c].disabled=false;
// 			c=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 		}
// 	};
// };
// select_c.onchange=function(){
// 	for (var i=0;i<s_c_child.length;i++) {
// 		if (s_c_child[i].selected) {
// 			s_b_child[c].disabled=false;
// 			s_a_child[c].disabled=false;
// 			c=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 		}
// 	};
// };
// select_c.onchange=function(){
// 	for (var i=0;i<s_c_child.length;i++) {
// 		if (s_c_child[i].selected) {
// 			s_b_child[c].disabled=false;
// 			s_a_child[c].disabled=false;
// 			c=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 		}
// 	};
// };
// select_c.onchange=function(){
// 	for (var i=0;i<s_c_child.length;i++) {
// 		if (s_c_child[i].selected) {
// 			s_b_child[c].disabled=false;
// 			s_a_child[c].disabled=false;
// 			c=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 		}
// 	};
// };
// select_c.onchange=function(){
// 	for (var i=0;i<s_c_child.length;i++) {
// 		if (s_c_child[i].selected) {
// 			s_b_child[c].disabled=false;
// 			s_a_child[c].disabled=false;
// 			c=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 		}
// 	};
// };
// select_c.onchange=function(){
// 	for (var i=0;i<s_c_child.length;i++) {
// 		if (s_c_child[i].selected) {
// 			s_b_child[c].disabled=false;
// 			s_a_child[c].disabled=false;
// 			c=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 		}
// 	};
// };
// select_c.onchange=function(){
// 	for (var i=0;i<s_c_child.length;i++) {
// 		if (s_c_child[i].selected) {
// 			s_b_child[c].disabled=false;
// 			s_a_child[c].disabled=false;
// 			c=i;
// 			s_b_child[i].disabled=true;
// 			s_a_child[i].disabled=true;
// 		}
// 	};
// };
//
$(function(){
	var oldVal="";
	$('.form-group select').each(function() {
		if ($(this).find("option:selected")) {
			var _thisVal = $(this).find('option:selected').val();
			oldVal=$(this).attr("old",_thisVal)
			$('.form-group select').parent().siblings("div").find("option[value="+_thisVal+"]").not("option[value=0]").hide()
		}
	})

	$(".form-group select").change(function(){
		oldVal=$(this).attr("old");
		var _thisVal=$(this).find('option:selected').val();
		var id=$(this).attr("id");
		$(this).parent().siblings("div").find("option[value="+_thisVal+"]").not("option[value=0]").hide();
		$(this).parent().siblings("div").find("option[value="+oldVal+"]").show();
		$(this).find("option[value="+oldVal+"]").show();
		$(this).attr("old",_thisVal)
	})
})
