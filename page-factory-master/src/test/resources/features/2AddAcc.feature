# language:ru
Функционал: Добавление аккаунта

  @banktest
  Сценарий: Добавление аккаунта
    Когда пользователь переходит на страницу "http://localhost:8080" по ссылке
    Тогда открывается страница "Bank"
    Если пользователь (нажимает кнопку) "AddAccount"
    Тогда открывается страница "Добавление аккаунта"
    Если пользователь (добавляет аккаунт) "One"
    Тогда (текст появляется на странице) "Account 'One' added!"


  @banktestrepeate
  Сценарий: Добавление существующего аккаунта
    Когда пользователь переходит на страницу "http://localhost:8080/addAccount" по ссылке
    Тогда открывается страница "Добавление аккаунта"
    Если пользователь (добавляет аккаунт) "One"
    Тогда (появляется сообщение) "Account 'One' is already exist!"