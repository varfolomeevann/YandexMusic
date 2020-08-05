# YandexMusic
Проект, на языке java, предназначенный для автоматизации тестирования авторизации 
на странице Яндекс.Музыка в браузере Google Chrome.

Для корректоной работы проекта необходимо:

1. В файл по пути: "src\\main\\resources\\user.properties",

 необходимо указать валидные логин и пароль пользователя в виде:

  login = userlogin

  passwd = userpasswd

2. Для логирования иметь файл по пути C:\\tmp\\log_test.log либо в файле  "src\\main\\resources\\log4j.properties" изменить путь на свой

3. Запуск тестов командой в каталоге с проектом: mvn test 

4. Получить allure отчет: mvn allure:serve
