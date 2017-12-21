$().ready(function(){
	role_privilege.init.initEvent();
});

var role_privilege={
	/**
	 * 存放数据
	 */
	data:{
		rolename:'',
		rid:''
	},
	/**
	 * 存放操作
	 */
	opt:{
		divOpt:{
			showDiv:function(){
				$("div:hidden").show();
			}
		},
		
		roleOpt:{
			showRoleName:function(){
				$("#roleImage").text(role_privilege.data.rolename);
			}
			
		},
		
		
		privligeTree:{
			zTreePlugin:"",
			loadPTree:function(){
				$.post("privilegeAction_showPrivilegeTreeAction.action",{rid:role_privilege.data.rid},function(data){
//					alert("加载树的data"+data);
					role_privilege.opt.privligeTree.zTreePlugin=$("#privilegeTree").zTree(role_privilege.opt.privligeTree.setting,data);
					$("#loading").hide();   //加载完权限树之后将loading图片设置为隐藏
					role_privilege.opt.privligeTree.setAllCheckedOnTree();
//					role_privilege.opt.privligeTree.allChecked(); !!!加上这行，回显失效!!!
				});
			},
			
			/**
			 * 全选的功能
			 */
			allChecked:function(){
//				alert($("#allchecked").attr("checked")); 
				if($("#allchecked").attr("checked")){
					role_privilege.opt.privligeTree.zTreePlugin.checkAllNodes(true);
				}else{
					role_privilege.opt.privligeTree.zTreePlugin.checkAllNodes(false);
				}
			},
			/**
			 * 判断zTree是否全部被选中
			 */
			setAllCheckedOnTree:function(){
				//得到未被选中的节点
				var uncheckedNodes =role_privilege.opt.privligeTree.zTreePlugin.getCheckedNodes(false);
//				alert("未被选中的节点长度为："+uncheckedNodes.length);
				if(uncheckedNodes.length==0){
					$("#allchecked").attr("checked",true);
				}else{
					$("#allchecked").attr("checked",false);
				}
			},
			
			/**
			 * 建立角色(role)和权限(privilege)之间的关系 
			 */
			buildRoleAndPrivilege:function(){
				//被选中权限的id的字符串数组形式:"[1,2,3]"
				var checkedStr='';
				//获取权限树上当前被选中的节点
				var checkenNodes = role_privilege.opt.privligeTree.zTreePlugin.getCheckedNodes(true);
				//拼接checkedStr数组 [id1,id2,id3] (数组内元素全为privilege的id)
				for(var i=0 ; i<checkenNodes.length ; i++){
					if(i==checkenNodes.length-1){//最后一个节点
						checkedStr = checkedStr+checkenNodes[i].id;
					}else{
						checkedStr = checkedStr+checkenNodes[i].id+",";
					}
				}
				var parameter ={
					rid:role_privilege.data.rid,
					checkedStr: checkedStr
				};
				$.post('roleAction_buildRoleAndPrivilege.action',parameter,function(){
					alert("保存成功");
				});
			},
			
			setting:{
				isSimpleData: true,
				treeNodeKey: "id",
				treeNodeParentKey: "pid",
				showLine: true,
				root:{ 
					isRoot:true,
					nodes:[]
				},
				checkable:true,
				callback:{
					//每次 （全选框） 发生（改变）的时候回调 判断zTree上的节点是否全部选中
					change:function(event, treeId, treeNode){
						role_privilege.opt.privligeTree.setAllCheckedOnTree();
					}
				}
				
			}
			
		}
	},
	/**
	 * 初始化
	 */
	init:{
		/**
		 * 初始化数据
		 */
		initData:function(){
			role_privilege.data.rolename=$(this).parent().siblings("td[item='name']").text();
			role_privilege.data.rid = $(this).parent().siblings("#rid").val();
			

//			role_privilege.data.rolename=$(this).parent().siblings("td:first").text();
//			alert("rolename="+role_privilege.data.rolename);
		},
		/**
		 * 初始化操作
		 */
		initEvent:function(){
			
			/**
			 * 给“设置权限”a标签 绑定一个click事件
			 */
			$("a").each(function(){
				if($(this).text()=="设置权限"){
					$(this).unbind("click");
					$(this).bind("click",function(){
						/**
						 * 1、显示被隐藏的div模块
						 * 2、动态显示用户名
						 * 3、加载权限树
						 * 4、建立角色和权限之间的关系
						 */
						//1显示被隐藏的div模块
						role_privilege.opt.divOpt.showDiv();
						//2、调用initData 方法中的代码，将当前点击的节点利用call方法传过去；注意！(innitDat后不要加括号)！
						role_privilege.init.initData.call(this);
						//2、动态显示rolename
						role_privilege.opt.roleOpt.showRoleName();
						//3、加载权限树
						role_privilege.opt.privligeTree.loadPTree();
						//4、建立角色和权限之间的关系
						
					})
				}
			});
			/**
			 * 给全选按钮绑定一个change事件
			 */
			$("#allchecked").change(function(){
				role_privilege.opt.privligeTree.allChecked();
			});
			/**
			 * 给保存按钮绑定一个click事件
			 */
			$("#savePrivilege").click(function(){
				role_privilege.opt.privligeTree.buildRoleAndPrivilege();
			});
		}
		
	}
	
	
}