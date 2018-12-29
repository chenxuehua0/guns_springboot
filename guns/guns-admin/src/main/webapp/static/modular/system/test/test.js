/**
 * 测试管理管理初始化
 */
var Test = {
    id: "TestTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
Test.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: '测试项编号', field: 'roleId', visible: true, align: 'center', valign: 'middle'},
            {title: '测试项名称', field: 'roleName', visible: true, align: 'center', valign: 'middle'},
            {title: '测试项类型', field: 'roleTypeId', visible: true, align: 'center', valign: 'middle'},
            {title: '测试项状态', field: 'roleState', visible: true, align: 'center', valign: 'middle'},
            {title: '创建时间', field: 'creTime', visible: true, align: 'center', valign: 'middle'},
            {title: '更新时间', field: 'updTime', visible: true, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
Test.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        Test.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加测试管理
 */
Test.openAddTest = function () {
    var index = layer.open({
        type: 2,
        title: '添加测试管理',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/test/test_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看测试管理详情
 */
Test.openTestDetail = function () {
    if (this.check()) {
    	alert("---"+Test.seItem.roleId)
        var index = layer.open({
            type: 2,
            title: '测试管理详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/test/test_update/' + Test.seItem.roleId
        });
        this.layerIndex = index;
    }
};

/**
 * 删除测试管理
 */
Test.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/test/delete", function (data) {
            Feng.success("删除成功!");
            Test.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("testId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询测试管理列表
 */
Test.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    Test.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = Test.initColumn();
    var table = new BSTable(Test.id, "/test/list", defaultColunms);
    table.setPaginationType("client");
    Test.table = table.init();
});
