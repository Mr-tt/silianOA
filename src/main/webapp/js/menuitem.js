var menuitem = {
		
	zTreePlugin:'',
	/**
	 * 加载树
	 */
	loadTree:function(){
		/**
		 * 第三个参数是回调函数，是在服务器端成功响应完毕以后才要执行该函数
		 * 如果js端的代码要用到回调函数的数据，这段代码必须写在回调函数中
		 * @param {Object} data
		 */
		$.post("menuitemAction_showMenuitems.action",null,function(data){
			 $("#tree").zTree(menuitem.setting,data);
		});
	},
	
	/**
	 * 加载树的根节点
	 */
	loadRoot:function(){
		$.post("menuitemAction_showMtreeByPid.action",{pid:0},function(data){
			menuitem.zTreePlugin = $("#tree").zTree(menuitem.setting, data);
		});
	},
	 /**
     * 根据父节点加载子节点
     */
	loadSubNodeByPid:function(treeNode){
		/**
         * 发出ajax请求，加载指定节点的子节点
         */
		if(!menuitem.zTreePlugin.getNodeByParam("pid", treeNode.mid)){
			
			$.post("menuitemAction_showMtreeByPid.action",
					{pid:treeNode.mid},
					function(data){
						//往指定的父节点上追加子节点
						menuitem.zTreePlugin.addNodes(treeNode,data,true);
			});
		}
	},
	
	
	setting:{
		isSimpleData: true,
		treeNodeKey: "mid",
		treeNodeParentKey: "pid",
		showLine: true,
		root:{ 
			isRoot:true,
			nodes:[]
		},
		callback:{
			
			expand:function(event, treeId, treeNode){
				menuitem.loadSubNodeByPid(treeNode);
			}
		}
	
	}
};
$().ready(function(){
	/**
	 * 加载树
	 */
//	menuitem.loadTree();
	menuitem.loadRoot();
});
