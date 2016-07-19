/**
 * 



 */
window.onload=function(){
	
	$.each(treeData,function(index,d){
		
		var dl=d['华北大类'];
		
		$('#tbRxqBody').append("<tr><td class='tddl' >"+dl+"</td><td colspan='8' id='"+dl+index+"' ></td></tr>")
	  
		$("#"+dl+index).append("<table id='tb"+dl+index+"' height='100%' width='100%' ></table>")
		
		$.each(d['仓库'],function(index2,ck){
			
		
			var ckName=ck['仓库'];
			
			$("#tb"+dl+index).append("<tr><td class='ck'>"+ckName+"</td><td id='"+dl+index+ckName+index2+"'></td></tr>")
			
			
			$("#"+dl+index+ckName+index2).append("<table id='tb"+dl+index+ckName+index2+"'  class='ckTable'  height='100%' width='100%'></table>")
			
			$.each(ck['牌号+等级'],function(index3,ph){
				var phdj=ph['牌号+等级'];
				console.log(phdj+ "  " +ph['客户'].length);
				var scqy=ph['生产企业'];
				
				$("#tb"+dl+index+ckName+index2).append("<tr><td class='phdj'>"+phdj+"</td><td class='scqy' >"+scqy+"</td><td class='kcl' ></td><td id='"+dl+index+ckName+index2+phdj+index3+"'></td><td class='syl'></td></tr>");
				
				$("#"+dl+index+ckName+index2+phdj+index3).append("<table id='tb"+dl+index+ckName+index2+phdj+index3+"' class='phTable'  height='100%' width='100%'></table>");
								
				$.each(ph['客户'],function(index4,kh){
					
					var count=ph['客户'].length;
					var khmc=kh['客户'];
					var sbl=kh['申报量'];
					if((index4+1)==ph['客户'].count){
						$("#tb"+dl+index+ckName+index2+phdj+index3).append("<tr class='lastKh'><td class='kh'>"+khmc+"</td><td  class='sbl' >"+sbl+"</td><td id='"+dl+index+ckName+index2+phdj+index3+khmc+index4+"'  class='xdl'></td></tr>");
						
					}else{
						$("#tb"+dl+index+ckName+index2+phdj+index3).append("<tr><td class='kh'>"+khmc+"</td><td  class='sbl' >"+sbl+"</td><td id='"+dl+index+ckName+index2+phdj+index3+khmc+index4+"'  class='xdl'></td></tr>");
						
					}
					
				})
				
				
			
			});
			
			
		})
		
	})
	
	$.each(['.ck','.phdj','.scqy','.syl','.kcl','.kh','.sbl','.xdl'],function(index,d){
		
		$(d).last().css('border-bottom','0px solid white');
	})
	
	
	
}


