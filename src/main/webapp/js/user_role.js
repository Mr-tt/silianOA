$().ready(function(){
	user_role.init.initEvent();
});

var user_role = {
	/**
	 * 存放数据
	 */
	data:{
		user:{
			username:'',
			uid:''
		}
	},
	/**
	 * 存放操作
	 */
	option:{
		divOpt:{
			//显示被隐藏的div
			showDiv:function(){
				$("div:hidden").show();
			}
		},
		
		userOpt:{
			showUsername:function(){
				$("#userImage").text(user_role.data.user.username);
			}
		},
		
		roleTreeOpt:{
			zTreePlugin:'',
			
			loadRoleTree:function(){
				$.post("roleAction_showRoleTree.action",
						{uid:user_role.data.user.uid},
						function(data){
//					alert(data);
					user_role.option.roleTreeOpt.zTreePlugin=$("#roleTree").zTree(user_role.option.roleTreeOpt.setting,data);
					//加载完角色树判断一下，复选框是否全部选中（不加这行，会导致角色全部选中了，但是全选复选框没选中）
					user_role.option.roleTreeOpt.setAllCheckedOnTree();
					//					$("#allchecked").attr("disabled",false);
//					user_role.option.roleTreeOpt.setAllCheckedOnTree();
				});
			},
			
			setting:{
				isSimpleData: true,
				treeNodeKey: "rid",
				treeNodeParentKey: "pid",
				showLine: true,
				root:{ 
					isRoot:true,
					nodes:[]
				},
				checkable:true,
				callback:{
					change:function(event,treeId,treeNode){
						user_role.option.roleTreeOpt.setAllCheckedOnTree();
					}
				}
			
			},
			/**
			 * 完成全选框功能
			 */
			allChecked:function(){
				if($("#allchecked").attr("checked")){ //判断全选框是否被选中
					user_role.option.roleTreeOpt.zTreePlugin.checkAllNodes(true);
				}else{
					user_role.option.roleTreeOpt.zTreePlugin.checkAllNodes(false);
				}
			},
			/**
			 * 判断树上的复选框是否全部被选中
			 */
			setAllCheckedOnTree:function(){
				//得到没有被选中的节点
				var uncheckedNodes = user_role.option.roleTreeOpt.zTreePlugin.getCheckedNodes(false);
				if(uncheckedNodes.length==0){ //当没有未被选中的节点时
					$("#allchecked").attr("checked",true); //设置全选框的状态为true
				}else{
					$("#allchecked").attr("checked",false);
				}
			},
			
			/**
			 * 建立用户和角色之间的关系
			 */
			buildUserAndRole:function(){
				//被选中角色id的字符串形式
				var checkedStr='';
				//被选中的节点
				var checkedNodes =user_role.option.roleTreeOpt.zTreePlugin.getCheckedNodes(true);
				//用被选中的节点，得到其id赋值给checkedStr
				for(var i=0;i<checkedNodes.length;i++){
					if(i==checkedNodes.length-1){
						checkedStr = checkedStr + checkedNodes[i].rid;
					}else{
						checkedStr = checkedStr + checkedNodes[i].rid + ",";
					}
				}
				
				var parameter = {
					uid:user_role.data.user.uid,
					checkedStr:checkedStr
				};
				
				$.post("userAction_buildUserAndRole.action",parameter,function(data){
					alert("操作成功");
				});
				
				/**
				 * 回显岗位到---->表格
				 */
				//找到隐藏域的兄弟节点的item属性为role的td节点
				var $td = $("input[value='"+user_role.data.user.uid+"']").siblings("td[item='role']");
				var temp = []; 
				for(var i = 0;i<checkedNodes.length;i++){
					temp.push(checkedNodes[i].name);
				}
				alert(temp);
				$td.text(temp.join(" "));
			}
			
		}
	},
	
	/**
	 * 初始化的操作
	 */
	init:{
		/**
		 * 初始化数据
		 */
		initData:function(){
			//给两个属性赋值
//			alert("initData="+$(this).parent().siblings("td:first").text());
			user_role.data.user.username = $(this).parent().siblings("td:first").text();
			user_role.data.user.uid = $(this).parent().siblings("input").val();
//			alert($(this).parent().siblings("input[type='hidden']").val());

		},
		/**
		 * 初始化事件
		 */
		initEvent:function(){
			/**
			 * 给设置角色 的a标签设置 点击事件
			 */
			$("a").each(function(){
				if($(this).text()=="设置角色"){
					$(this).unbind("click");
					$(this).bind("click",function(){
						/**
						 * 1、显示所有被隐藏的div
						 * 2、动态的显示用户名
						 * 3、加载角色树
						 * 4、建立用户和被选中角色之间的关系
						 */
						user_role.option.divOpt.showDiv();
						
						user_role.init.initData.call(this);
						//调用showUsername()方法，动态显示username
						user_role.option.userOpt.showUsername();
						//加载角色树
						user_role.option.roleTreeOpt.loadRoleTree();
					});
				}
			});
			/**
			 * 给全选复选框添加change事件
			 */
			$("#allchecked").change(function(){
				user_role.option.roleTreeOpt.allChecked();
				
			});
			/**
			 * 给保存按钮添加click事件
			 */
			$("#saveRole").click(function(){
				user_role.option.roleTreeOpt.buildUserAndRole();
			});
			
		}
		
	}
	
}
