<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!doctype html>
<html>
<head>
<meta charset="gbk">
<title>澈骨个人网站</title>
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
    <div class="newsview">
      <h3 class="news_title">个人博客，属于我的小世界！</h3>

      <div class="news_con">
        <p>本文很长，记录了我博客建站初到现在的过程，还有我从毕业到现在的一个状态，感谢您的阅读，如果你还是学生，也许你能从此文中，找到我们曾经相似的地方。如果你已经工作，有自己的博客，我想，你并没有忘记当初建立个人博客的初衷吧！</p>
        <p> 我的写作水平终于获得了语文老师的认可。三年前，他对我的评语是“无病呻吟”。 三年后，我又把新写的作品拿给他，看完后他关切地对我说：“你有病吧。” </p>
        <p>
        <img alt="" src="${pageContext.request.contextPath}/images/330803-1P40322420023.jpg"></p>
      <p>
        街头遇到一个乞丐，竟是大学同学，他一开始有点尴尬，但当他发现自己碗里的钱比我碗里的多时，他又显得优越起来。 </p>
</div>
    
      <div class="news_pl">
        <h2>留言</h2>
        <div class="gbko"> </div>
      </div>
    </div>
  </main>
  <aside class="l_box">
    <div class="wdxc">
      <h2>我的相册</h2>
      <ul>
        <li><a href="/tuseday/photo/21.html" title="古典个人博客模板《青砖屋檐》"><img src="http://www.yangqq.com/skin/850/images/text02.jpg"></a></li>
        <li><a href="/tuseday/photo/20.html" title="个人博客模板《早安》"><img src="http://www.yangqq.com/skin/850/images/b02.jpg"></a></li>
        <li><a href="/tuseday/photo/7.html" title="简单手工纸玫瑰"><img src="http://www.yangqq.com/d/file/news/s/2014-01-29/15e613795b6fe3ad00e917556b6b76c6.jpg"></a></li>
        <li><a href="/tuseday/photo/6.html" title="房前种菜，屋后栽花"><img src="http://www.yangqq.com/d/file/news/read/2014-05-28/f805e33f1266f2504739c740084faac7.jpg"></a></li>
        <li><a href="/tuseday/photo/5.html" title="陌上花开，可缓缓归矣"><img src="http://www.yangqq.com/d/file/news/s/2013-07-09/d353fb4c75965aef35182a7875186b79.jpg"></a></li>
        <li><a href="/tuseday/photo/4.html" title="云南之行——丽江古镇玉龙雪山"><img src="http://www.yangqq.com/d/file/news/s/2014-01-04/6bccfe64820d609bcd0ab7ca7a7fa5dd.jpg"></a></li>
      </ul>
    </div>
    <div class="search">
      <form action="/e/search/index.php" method="post" name="searchform" id="searchform">
        <input name="keyboard" id="keyboard" class="input_text" value="请输入关键字词" style="color: rgb(153, 153, 153);" onfocus="if(value=='请输入关键字词'){this.style.color='#000';value=''}" onblur="if(value==''){this.style.color='#999';value='请输入关键字词'}" type="text">
        <input name="show" value="title" type="hidden">
        <input name="tempid" value="1" type="hidden">
        <input name="tbname" value="news" type="hidden">
        <input name="Submit" class="input_submit" value="搜索" type="submit">
      </form>
    </div>
    <div class="fenlei">
      <h2>文章分类</h2>
      <ul>
        <li><a href="/">学无止境（33）</a></li>
        <li><a href="/">日记（19）</a></li>
        <li><a href="/">慢生活（520）</a></li>
        <li><a href="/">美文欣赏（40）</a></li>
      </ul>
    </div>
    <div class="tuijian">
      <h2>站长推荐</h2>
      <ul>
        <li><a href="/">你是什么人便会遇上什么人</a></li>
        <li><a href="/">帝国cms 列表页调用子栏目，没有则不显示栏目名称</a></li>
        <li><a href="/">第二届 优秀个人博客模板比赛参选活动</a></li>
        <li><a href="/">个人博客模板《绅士》后台管理</a></li>
        <li><a href="/">你是什么人便会遇上什么人</a></li>
        <li><a href="/">帝国cms 列表页调用子栏目，没有则不显示栏目名称</a></li>
        <li><a href="/">第二届 优秀个人博客模板比赛参选活动</a></li>
        <li><a href="/">个人博客模板《绅士》后台管理</a></li>
      </ul>
    </div>
    <div class="tuijian">
      <h2>点击排行</h2>
      <ul>
        <li><a href="/">你是什么人便会遇上什么人</a></li>
        <li><a href="/">帝国cms 列表页调用子栏目，没有则不显示栏目名称</a></li>
        <li><a href="/">第二届 优秀个人博客模板比赛参选活动</a></li>
        <li><a href="/">个人博客模板《绅士》后台管理</a></li>
        <li><a href="/">你是什么人便会遇上什么人</a></li>
        <li><a href="/">帝国cms 列表页调用子栏目，没有则不显示栏目名称</a></li>
        <li><a href="/">第二届 优秀个人博客模板比赛参选活动</a></li>
        <li><a href="/">个人博客模板《绅士》后台管理</a></li>
      </ul>
    </div>
  </aside>
</article>
<footer>
  <p>Design by <a href="http://www.yangqq.com" target="_blank">澈骨线条</a> <a href="/">没有备案</a></p>
</footer>
<a href="#" class="cd-top">Top</a>
</body>
</html>
