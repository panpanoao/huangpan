<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!doctype html>
<html>
<head>
<meta charset="gbk">
<title>澈骨个人博客</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="${pageContext.request.contextPath}/css/base.css" rel="stylesheet">

  <script src="${pageContext.request.contextPath}/js/jquery.mincc.js" type="text/javascript"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/commss.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/modernizr.js"></script>
<![endif]-->
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
  <main class="r_box">
    <div class="bloglist">

      <c:forEach items="${pageInfo.list}" var="a">
        <li><i><a href="${pageContext.request.contextPath}/info.html?id=${a.id}&add=1" title="${a.bowenMintitle}"><img src="${pageContext.request.contextPath}${a.bowenMap}" alt="${a.bowenMintitle}"></a></i>
          <h3><a href="${pageContext.request.contextPath}/info.html?id=${a.id}&add=1" target="_blank">${a.bowenMintitle}</a></h3>
          <p>${a.bowenText}</p>
          <p class="feed-date"><span class="fd01">[个人日记]</span><span class="fd01"><a ><fmt:formatDate value="${a.createTime }" pattern="yyyy-MM-dd" /></a></span><span class="fd01">阅读（${a.liulan}）</span><span class="fd01">喜欢（${a.dianzan}）</span></p>
        </li>
      </c:forEach>


        <div class="pagelist pagebg">
              <a href="${pageContext.request.contextPath}/list.html?page=1&rows=${pageInfo.pageSize}">首页</a>
            <a href="${pageContext.request.contextPath}/list.html?page=${pageInfo.prePage}&rows=${pageInfo.pageSize}">&nbsp;<b>上一页</b> </a>
             <c:forEach items="${pageInfo.navigatepageNums}" var="nav">
                 <c:if test="${nav == pageInfo.pageNum}">
                 <a href="${pageContext.request.contextPath}/list.html?page=${nav}&rows=${pageInfo.pageSize}" style="background-color: #a9d0dc;color: #176c86">${nav}</a>&nbsp;
                 </c:if>
                 <c:if test="${nav != pageInfo.pageNum}">
                 <a href="${pageContext.request.contextPath}/list.html?page=${nav}&rows=${pageInfo.pageSize}">${nav}</a>&nbsp;
                 </c:if>
             </c:forEach>


                 <a href="${pageContext.request.contextPath}/list.html?page=${pageInfo.nextPage}&rows=${pageInfo.pageSize}">下一页</a>&nbsp;
            <a href="${pageContext.request.contextPath}/list.html?page=${pageInfo.pages }&rows=${pageInfo.pageSize}">尾页</a>
        </div>


    </div>
  </main>
  <aside class="l_box">
    <div class="wdxc">
      <h2>我的相册</h2>
      <ul>
        <li><a href="${pageContext.request.contextPath}/images/4C31C20B52A047A37A41BB7DB1E2FE72.jpg" ><img src="${pageContext.request.contextPath}/images/4C31C20B52A047A37A41BB7DB1E2FE72.jpg"></a></li>
        <li><a href="${pageContext.request.contextPath}/images/6F19E9D9C34CEABDF8BE6548A226473A.jpg" ><img src="${pageContext.request.contextPath}/images/6F19E9D9C34CEABDF8BE6548A226473A.jpg"></a></li>
        <li><a href="${pageContext.request.contextPath}/images/49CF9C415BEF6EA084305494F849C60E.jpg" ><img src="${pageContext.request.contextPath}/images/49CF9C415BEF6EA084305494F849C60E.jpg"></a></li>
        <li><a href="${pageContext.request.contextPath}/images/14E4E6F209C2D91106F82BEF66C010CD.jpg" ><img src="${pageContext.request.contextPath}/images/14E4E6F209C2D91106F82BEF66C010CD.jpg"></a></li>
        <li><a href="${pageContext.request.contextPath}/images/3DF6A87B4A1A960F2DB9F593C183C8C2.jpg" ><img src="${pageContext.request.contextPath}/images/3DF6A87B4A1A960F2DB9F593C183C8C2.jpg"></a></li>
        <li><a href="${pageContext.request.contextPath}/images/8FF3F5ECC68421DC56BD1FEB0A3DAFA7.jpg" ><img src="${pageContext.request.contextPath}/images/8FF3F5ECC68421DC56BD1FEB0A3DAFA7.jpg"></a></li>
      </ul>
    </div>
    <div class="search">
      <form action="/tuseday/e/search/index.php" method="post" name="searchform" id="searchform">
        <input name="keyboard" id="keyboard" class="input_text" value="请输入关键字词" style="color: rgb(153, 153, 153);" onfocus="if(value=='请输入关键字词'){this.style.color='#000';value=''}" onblur="if(value==''){this.style.color='#999';value='请输入关键字词'}" type="text">
        <input name="show" value="title" type="hidden">
        <input name="tempid" value="1" type="hidden">
        <input name="tbname" value="news" type="hidden">
        <input name="Submit" class="input_submit" value="搜索" type="submit">
      </form>
    </div>
    <div class="tuijian">
      <h2>最近更新</h2>
      <ul>
        <li><a href="/tuseday/diary/8.html" title="个人博客，属于我的小世界！">个人博客，属于我的小世界！</a></li>
        <li><a href="/tuseday/diary/19.html" title="一个三十而立的男程序员真实讲述：代码搅乱我的生活">一个三十而立的男程序员真实讲述：代码搅乱我的生活</a></li>
        <li><a href="/tuseday/diary/1.html" title="《寻之旅》一个关于旅游，游记的个人博客">《寻之旅》一个关于旅游，游记的个人博客</a></li>
        <li><a href="/tuseday/diary/16.html" title="个人博客从简不繁">个人博客从简不繁</a></li>
        <li><a href="/tuseday/diary/17.html" title="抄袭门过后——丢掉心结，重拾自己">抄袭门过后——丢掉心结，重拾自己</a></li>
        <li><a href="/tuseday/diary/12.html" title="个人博客，我为什么要用帝国cms？">个人博客，我为什么要用帝国cms？</a></li>
        <li><a href="/tuseday/photo/21.html" title="古典个人博客模板《青砖屋檐》">古典个人博客模板《青砖屋檐》</a></li>
        <li><a href="/tuseday/photo/7.html" title="简单手工纸玫瑰">简单手工纸玫瑰</a></li>
      </ul>
    </div>
    <div class="tuijian">
      <h2>点击排行</h2>
      <ul>
        <li><a href="/tuseday/diary/8.html" title="个人博客，属于我的小世界！">个人博客，属于我的小世界！</a></li>
        <li><a href="/tuseday/diary/19.html" title="一个三十而立的男程序员真实讲述：代码搅乱我的生活">一个三十而立的男程序员真实讲述：代码搅乱我的生活</a></li>
        <li><a href="/tuseday/diary/1.html" title="《寻之旅》一个关于旅游，游记的个人博客">《寻之旅》一个关于旅游，游记的个人博客</a></li>
        <li><a href="/tuseday/diary/16.html" title="个人博客从简不繁">个人博客从简不繁</a></li>
        <li><a href="/tuseday/diary/17.html" title="抄袭门过后——丢掉心结，重拾自己">抄袭门过后——丢掉心结，重拾自己</a></li>
        <li><a href="/tuseday/diary/12.html" title="个人博客，我为什么要用帝国cms？">个人博客，我为什么要用帝国cms？</a></li>
        <li><a href="/tuseday/photo/21.html" title="古典个人博客模板《青砖屋檐》">古典个人博客模板《青砖屋檐》</a></li>
        <li><a href="/tuseday/photo/7.html" title="简单手工纸玫瑰">简单手工纸玫瑰</a></li>
      </ul>
    </div>
    <div class="fenlei">
      <h2>分类</h2>
      <ul>
        <li><a href="/">新鲜事儿（13）</a></li>
        <li><a href="/">我的日记（8）</a></li>
        <li><a href="/">我的相册（8）</a></li>
        <li><a href="/">微记录（8）</a></li>
        <li><a href="/">视频（8）</a></li>
      </ul>
    </div>
    <div class="links">
      <h2>友情链接</h2>
      <ul>
        <li><a href="http://www.yangqq.com" title="杨青个人博客">杨青个人博客</a></li>
      </ul>
    </div>
  </aside>
</article>
<div class="blank"></div>
<footer>
  <p>Design by <a href="http://www.yangqq.com" target="_blank">杨青个人博客</a> <a href="/">蜀ICP备11002373号-1</a></p>
</footer>
<a href="#" class="cd-top">Top</a>
</body>
</html>
