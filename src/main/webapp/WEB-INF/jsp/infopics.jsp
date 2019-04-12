<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!doctype html>
<html>
<head>
<title>澈骨</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script src="${pageContext.request.contextPath}/webjars/jquery/3.1.1/jquery.min.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/3.3.5/css/bootstrap.min.css"/>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-table.css"/>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-table.min.css"/>
  <script src="${pageContext.request.contextPath}/js/bootstrap-table.js"></script>
  <script src="${pageContext.request.contextPath}/js/test.js"></script>
  <script src="${pageContext.request.contextPath}/js/bootstrap-table-zh-CN.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/messenger.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/bootstrapValidator.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/moment.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/messenger.css"/>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/messenger-theme-future.css"/>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrapValidator.min.css"/>
  <script src="${pageContext.request.contextPath}/webjars/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/3.3.5/css/bootstrap.min.css"/>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="${pageContext.request.contextPath}/css/base.css" rel="stylesheet">

  <script src="${pageContext.request.contextPath}/js/jquery.mincc.js" type="text/javascript"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/commss.js"></script>
<script src="${pageContext.request.contextPath}/js/piccontent.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/modernizr.js" type="text/javascript"></script>
  <style>
    .ping{

      width: 100%;
      background-color: #D9f2f5;
    }
    .ccc  {
      width: 228px;
      height: 160px;
      overflow: hidden;
      display: table-cell;
      vertical-align: middle;
      text-align: center;
       max-width: 100%;
    }
  </style>
  <script type="text/javascript">

      $(function(){


          $('#btn_submit').click(function () {
              var a=$("#albumText").val();
              if(a==null||a==""){
                  alert("留言不能输入空的哦");
              }else {
                  //获取验证结果，如果成功，执行下面代码
                  var formData = $("#MyForm").serialize();
                  $.ajax({
                      type: "post",//请求方式
                      processData: true,//序列化
                      data: formData,//参数
                      dataType: 'json', //接受数据格式
                      url: basePath + "/liuyanalbum.json", //地址
                      success: function (data) {
                          if(data==1){
                              alert("请登录");
                              window.location.href=basePath+"/denglu";
                          }else{
                              $("#albumText").val("");
                              alert("留言成功");
                              /*   window.location.href=basePath+"/info.html?id=&add=0";*/
                              /*  window.scrollTo(0,document.body.scrollHeight);*/
                     /*         location.reload(false);*/
                              location.reload(false);
                          }

                      },
                      error: function () {
                          alert("错误");
                      }
                  });
                  $("#worksText").val("");

              }
          });


      });

    function dianzan() {
          var albumid=${album.id};
          var usersid=${sessionScope.userslogin.id}
              $.ajax({
                  type: "post",//请求方式
                  processData: true,//序列化
                  data: {albumid:albumid,usersid:usersid},//参数
                  dataType: 'json', //接受数据格式
                  url: basePath + "/dianzanalbum.json", //地址
                  success: function (data) {
                      if(data==1){
                          alert("你已经点过赞了哦！")
                      }else{
                          alert("点赞成功");
                          location.reload(false);
                      }

                  },
                  error: function () {
                      alert("错误");
                  }
              });
      }
  </script>
</head>
<body>
<header>
  <div class="profile">
    <div class="avatar fl"><img src="${pageContext.request.contextPath}/images/zhuyetouxiang.jpeg"></div>
    <div class="guanzhu fl">
      <ul>
        <li><img src="images/nianling.png"><span>生日：1919-9-20</span></li>
        <li><img src="images/weizhi.png"><span>来自火星</span></li>
        <li><img src="images/qq.png"><span>QQ：1981752950</span></li>
        <li><img src="images/weixin.png"><span><img src="${pageContext.request.contextPath}/images/mmqrcode1553129238917.png"></span></li>
      </ul>
    </div>
    <div class="username">Baby的小家</div>
  </div>
  <nav>
    <ul id="starlist">
      <li><a onclick="window.history.back(-1); " style="background-color:#63a1b4" >返回上级</a></li>

    </ul>
  </nav>
</header>

<article>
  <div class="picsbox">
    <div class="bodymodal"></div>
    <!--播放到第一张图的提示-->
    <div class="firsttop" style="width: 100px;height: 100px;">
      <div class="firsttop_right">
        <div class="close2"> <a class="closebtn1" title="关闭" href="javascript:void(0)">X</a> </div>
        <div class="replay" style="width: 60px;height: 60px;">
          <h4 id="div-end-h2">第一张 </h4>
        </div>
      </div>
    </div>
    <!--播放到最后一张图的提示-->
    <div class="endtop">
      <div class="firsttop_right">
        <div class="close2"> <a class="closebtn2" title="关闭" href="javascript:void(0)">X</a> </div>
        <div class="replay" style="width: 60px;height: 60px;">
          <h4 id="H1">没有了 </h4>
        </div>
      </div>
    </div>
    <!--弹出层结束-->
    <!--图片特效内容开始-->
    <div class="piccontext">
      <h2> ${album.albumTitle}</h2>
      <div class="source">
        <div class="source_left"><span>相册</span><span><fmt:formatDate value="${album.albumTime}" pattern="yyyy-MM-dd" /></span><span><script src=/tuseday/e/public/ViewClick/?classid=2&id=7&addclick=1></script> ${album.liulan}人已阅读</span></div>
        <div class="source_right"> <a href="javascript:;" class="list">列表查看</a> </div>
        <div class="source_right1"> <a href="javascript:;" class="gaoqing">高清查看</a> </div>
      </div>
      <!--大图展示-->
      <div class="picshow">
        <div class="picshowtop"> <a href="#"><img src="" alt="" id="pic1" curindex="0" /></a> <a id="preArrow" href="javascript:void(0)" class="contextDiv" title="上一张"><span id="preArrow_A"></span></a> <a id="nextArrow" href="javascript:void(0)" class="contextDiv" title="下一张"><span id="nextArrow_A"></span></a> </div>
        <div class="picshowtxt">
          <div class="picshowtxt_left"><span>1</span>/<i>${size}</i></div>
        </div>
        <div class="picshowlist">
          <div class="picshowlist_mid"  >
            <div class="picmidleft"> <a href="javascript:void(0)" id="preArrow_B"><span class="sleft"></span></a> </div>
            <div class="picmidmid">
              <ul id="cc" >
               <c:forEach var="t" items="${imglist}">
                <li> <a href="javascript:void(0);"><img src="${pageContext.request.contextPath}${t}"  alt="" bigimg="${pageContext.request.contextPath}${t}"  text=""  /></a></li>
               </c:forEach>
              </ul>
            </div>
            <div class="picmidright"> <a href="javascript:void(0)" id="nextArrow_B"><span class="sright"></span></a> </div>
          </div>
        </div>
      </div>

      <!--列表展示-->
      <div class="piclistshow">
        <ul>
     <%--     <li>
            <div class="picimg"><img src="images/1.jpg"  class="ccc"/></div>
          </li>--%>
  <c:forEach var="t" items="${imglist}">
          <li>
            <div class="picimg"><img src="${pageContext.request.contextPath}${t}" class="ccc"/></div>
          </li>
</c:forEach>
        </ul>
      </div>
    </div>
    <div class="picjianjie">${album.albumText} </div>
    <p class="diggit" onclick="dianzan()"><a > 很赞哦！ </a>(<b id="diggnum">${album.dianzan}</b>)</p>
    <div class="news_pl">
      <h2>文章评论</h2>
      <form id="MyForm">
        <div class="modal-body">
          <input type="hidden" name="userid" value="${sessionScope.userslogin.id}">
          <input type="hidden" name="albumid" value="${album.id}">
          <div class="form-group">
            <input type="text" name="albumText"  id="albumText" class="form-control" placeholder="请输入留言" >
          </div>
        </div>
        <div class="modal-footer">
          <button type="button" id="btn_submit" class="btn btn-primary"><span
                  class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>发表
          </button>
        </div>
      </form>



      <c:forEach items="${wordsList}" var="a">
        <div class="ping">
          <br/>
          <div style="float:left;">
            <span class="comment_name">${a.userName}评论： </span>&nbsp; &nbsp;<span ><fmt:formatDate value="${a.albumTime}" pattern="yyyy-MM-dd hh:mm:ss" /></span>
          </div>
          <div class="del">
            &nbsp; &nbsp;  <a style="color:red" onclick="alert('还在开发中')" id="chakan${a.id}">查看回复</a>
            <c:if test="${sessionScope.userslogin.id==1}">
              <a href="" style="color: #b3d135">删除</a>
            </c:if>
          </div>
          <div class="comment_content" >${a.albumText}</div>


        </div>
      </c:forEach>
    </div>
  </div>
  <div class="blank"></div>
</article>


<footer>
  <p>Design by <a href="http://www.yangqq.com" target="_blank">个人博客</a> <a href="/">蜀ICP备11002373号-1</a></p>
</footer>
<a href="#" class="cd-top">Top</a>
</body>
</html>
