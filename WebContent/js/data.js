/**
 * 
 */
var data = [];
var record = {
	'华北大类' : '聚乙烯交联管料',
	'仓库' : 'ZC1',
	'牌号+等级' : 'DY-H4855XL（合格）',
	'生产企业' : '独山子石化',
	'客户' : '客户1',
	'申报量' : '10'
}
var record2 = {
	'华北大类' : '聚乙烯交联管料',
	'仓库' : 'ZC1',
	'牌号+等级' : 'DY-H4855XL（合格）',
	'生产企业' : '独山子石化',
	'客户' : '客户3',
	'申报量' : '10'
}
var record3 = {
	'华北大类' : '聚乙烯交联管料',
	'仓库' : 'ZC1',
	'牌号+等级' : 'DY-H4855XL',
	'生产企业' : '独山子石化',
	'客户' : '客户2',
	'申报量' : '20'
}
var record4 = {
	'华北大类' : '聚乙烯交联管料',
	'仓库' : 'ZC1',
	'牌号+等级' : 'HD4811XL',
	'生产企业' : '独山子石化',
	'客户' : '客户2',
	'申报量' : '30'
}
data.push(record);



var treeData = [];
var dl1 = {
	'华北大类' : '聚乙烯交联管料',
	'仓库' : [ {
		'仓库' : 'ZC1',
		'牌号+等级' : [ {
			'牌号+等级' : 'DY-H4855XL（合格）',
			'生产企业' : '独山子石化',
			'客户' : [ {
				'客户' : '客户1',
				'申报量' : '10'
			}, {
				'客户' : '客户3',
				'申报量' : '10'
			} ]
		} ]
	},{
		'仓库' : 'ZC2',
		'牌号+等级' : [ {
			'牌号+等级' : 'DY-H4855XL（合格）',
			'生产企业' : '独山子石化',
			'客户' : [ {
				'客户' : '客户1',
				'申报量' : '10'
			}, {
				'客户' : '客户3',
				'申报量' : '10'
			} ]
		} ]
	}  ]
};
dl1['仓库'][0]['牌号+等级'].push({
	'牌号+等级' : 'DY-H4855XL',
	'生产企业' : '独山子石化',
	'客户' : [ {
		'客户' : '客户2',
		'申报量' : '10'
	} ]
});
dl1['仓库'][0]['牌号+等级'].push({
	'牌号+等级' : 'HD4811XL',
	'生产企业' : '独山子石化',
	'客户' : [ {
		'客户' : '客户2',
		'申报量' : '10'
	} ]
});

treeData.push(dl1);
treeData.push(dl1);
treeData.push(dl1);
