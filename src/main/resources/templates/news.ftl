<#ftl encoding='UTF-8'>
<!doctype html>
<html>
<head>
    <title>News</title>
    <meta charset="UTF-8">
    <meta name="author_en" content="Iskander Valiev">
    <meta name="author_ru" content="Искандер Валиев">
    <link rel="stylesheet" href="/css/news.css">
</head>
<body>
<div class="main">
    <div class="header">
        <h2>News</h2>
    </div>
    <hr>
    <div class="addnews">
        <form action="/addnews" method="post">
            <tr><input type="text" placeholder="news header" name="header"></tr>
            <tr><input type="text" placeholder="news annotation" name="annotation"></tr>
            <tr><input type="text" placeholder="news content" name="content"></tr>
            <tr><input type="text" placeholder="news image" name="image"></tr>
            <input type="submit" value="add news">
        </form>
    </div>
    <div class="content">
        <div class="news-block">
            <#list model.news as news>
                <div class="news">
                    <#--<div class="news-date"></div>-->
                    <img src="${news.image}">
                    <div class="news-text">
                        <div class="news-header">${news.header}</div>
                        <div class="news-annotation">${news.annotation}</div>
                    </div>
                </div>
            </#list>
        </div>
        <div class="main-news">

        </div>
    </div>

</div>
</body>
</html>