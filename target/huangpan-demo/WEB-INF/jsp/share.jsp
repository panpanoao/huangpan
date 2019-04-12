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
  <link href="${pageContext.request.contextPath}/css/base.css" rel="stylesheet">

  <script src="${pageContext.request.contextPath}/js/jquery.mincc.js" type="text/javascript"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/commss.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/modernizr.js"></script>
<script src="${pageContext.request.contextPath}/js/scrollReveal.js"></script>
</head>
<body>
<header>
  <div class="profile">
    <div class="avatar fl"><img src="${pageContext.request.contextPath}/images/zhuyetouxiang.jpeg"></div>
    <div class="guanzhu fl">
      <ul>
        <li><img src="images/nianling.png"><span>生日：1919-9-20</span></li>
        <li><img src="images/weizhi.png"><span>来自火星</span></li>
        <li><img src="images/qq.png"><span>QQ：1262059315</span></li>
        <li><img src="images/weixin.png"><span><img src="${pageContext.request.contextPath}/images/mmqrcode1553129238917.png"></span></li>
      </ul>
    </div>
    <div class="username">Baby的小家</div>
  </div>
  <nav>
    <ul id="starlist">
      <li><a href="${pageContext.request.contextPath}/indexfirst.html">我的小家</a></li>
      <li><a href="${pageContext.request.contextPath}/time.html">新鲜事儿</a></li>
      <li><a href="${pageContext.request.contextPath}/list.html">我的日记</a></li>
      <li><a  href="${pageContext.request.contextPath}/share.html">我的相册</a></li>
      <li><a href="${pageContext.request.contextPath}/info.html?code=aa">微记录</a></li>
      <li><a href="${pageContext.request.contextPath}/infopic.html?type=bb">视频</a></li>
      <li><a href="${pageContext.request.contextPath}/about.html">关于我</a></li>
    </ul>
  </nav>
</header>
<article>
  <div class="picbox">
    <ul>
      <c:forEach items="${pageInfo.list}" var="a">
      <li data-scroll-reveal="enter bottom over 1s" ><a href="${pageContext.request.contextPath}/infopic.html?id=${a.id}"><i><img src="${pageContext.request.contextPath}${a.coverMap}"></i>
        <p class="picinfo">${a.albumMintitle}</p>
        </a> </li>
      </c:forEach>
    </ul>
  </div>
  <div class="pagelist pagebg">
    <a href="${pageContext.request.contextPath}/share.html?page=1&rows=${pageInfo.pageSize}">首页</a>
    <a href="${pageContext.request.contextPath}/share.html?page=${pageInfo.prePage}&rows=${pageInfo.pageSize}">&nbsp;<b>上一页</b> </a>
    <c:forEach items="${pageInfo.navigatepageNums}" var="nav">
      <c:if test="${nav == pageInfo.pageNum}">
        <a href="${pageContext.request.contextPath}/list.html?page=${nav}&rows=${pageInfo.pageSize}" style="background-color: #a9d0dc;color: #176c86">${nav}</a>&nbsp;
      </c:if>
      <c:if test="${nav != pageInfo.pageNum}">
        <a href="${pageContext.request.contextPath}/share.html?page=${nav}&rows=${pageInfo.pageSize}">${nav}</a>&nbsp;
      </c:if>
    </c:forEach>


    <a href="${pageContext.request.contextPath}/share.html?page=${pageInfo.nextPage}&rows=${pageInfo.pageSize}">下一页</a>&nbsp;
    <a href="${pageContext.request.contextPath}/share.html?page=${pageInfo.pages }&rows=${pageInfo.pageSize}">尾页</a>
  </div>

</article>
<div class="blank"></div>
<footer>
  <p>Design by <a href="http://www.yangqq.com" target="_blank">澈骨个人博客</a> <a href="/">没有备案</a></p>
</footer>
</body>
</html>
