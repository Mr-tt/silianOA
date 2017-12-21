$().ready(function(){
	oa_left.opt.zTree.loadTree();
});


var oa_left={
	data:{
		
	},
	opt:{
		
		zTree:{
			setting:{
				isSimpleData: true,
				treeNodeKey: "id",
				treeNodeParentKey: "pid",
				showLine: true,
				root:{ 
					isRoot:true,
					nodes:[]
				}
			},
			loadTree:function(){
				$.post("privilegeAction_showPrivilegeTreeByUid.action",null,function(data){
					$("#menuTree").zTree(oa_left.opt.zTree.setting,data);
				});
				
			}
		}
	},
	init:{
		initData:function(){
			
		},
		initEvent:function(){
			
		}
		
	}
	
	
}