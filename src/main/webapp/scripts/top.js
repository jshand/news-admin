/**退出系统**/
function logout(){
    //alert(11);
    //art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'由于360浏览器功能限制，加入收藏夹功能失效', ok:true,});


    if(confirm("您确定要退出本系统吗？")){
        window.location.href = "login.html";
    }
}

/**获得当前日期**/
function  getDate01(){
    var time = new Date();
    var myYear = time.getFullYear();
    var myMonth = time.getMonth()+1;
    var myDay = time.getDate();
    if(myMonth < 10){
        myMonth = "0" + myMonth;
    }
    document.getElementById("yue_fen").innerHTML =  myYear + "." + myMonth;
    document.getElementById("day_day").innerHTML =  myYear + "." + myMonth + "." + myDay;
}

/**加入收藏夹**/
function addfavorite(){
    var ua = navigator.userAgent.toLowerCase();
    if (ua.indexOf("360se") > -1){
        art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'由于360浏览器功能限制，加入收藏夹功能失效', ok:true,});
    }else if (ua.indexOf("msie 8") > -1){
        window.external.AddToFavoritesBar('${dynamicURL}/authority/loginInit.action','西宁市公共租赁住房信息管理系统管理');//IE8
    }else if (document.all){
        window.external.addFavorite('${dynamicURL}/authority/loginInit.action','西宁市公共租赁住房信息管理系统管理');
    }else{
        art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'添加失败，请用ctrl+D进行添加', ok:true,});
    }
}