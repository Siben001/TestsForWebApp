# language:ru
Функционал: Проверка списка аккаунтов

  @listAccNotExist
  Сценарий: Существующий аккаунт
    Когда пользователь переходит на страницу "http://localhost:8080" по ссылке
    Тогда открывается страница "Bank"
    Если пользователь (нажимает кнопку) "ListAccount"
    Тогда открывается страница "Список аккаунтов"
    И пользователь (появляется сообщение) "There is no accounts yet!"

  @listAccExist
  Сценарий: Существующий аккаунт
    Когда пользователь переходит на страницу "http://localhost:8080" по ссылке
    Тогда открывается страница "Bank"
    Если пользователь (нажимает кнопку) "AddAccount"
    Тогда открывается страница "Добавление аккаунта"
    Если пользователь (добавляет аккаунт) "Two"
    И (возвращается в меню)
    Тогда открывается страница "Bank"
    Если пользователь (нажимает кнопку) "ListAccount"
    Тогда открывается страница "Список аккаунтов"
    И пользователь (проверяет список) "Two"

  @listAccExist
  Сценарий: Существующий аккаунт
    Когда пользователь переходит на страницу "http://localhost:8080" по ссылке
    Тогда открывается страница "Bank"
    Если пользователь (нажимает кнопку) "AddAccount"
    Тогда открывается страница "Добавление аккаунта"
    Если пользователь (добавляет аккаунт) "Three"
    И (возвращается в меню)
    Тогда открывается страница "Bank"
    Если пользователь (нажимает кнопку) "ListAccount"
    Тогда открывается страница "Список аккаунтов"
    И пользователь (проверяет список) "Two\nThree"