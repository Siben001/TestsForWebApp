# language:ru
Функционал: Добавление денег

  @addMoneyPositive
  Сценарий: Правильный аккаунт и сумма
  Когда пользователь переходит на страницу "http://localhost:8080" по ссылке
  Тогда открывается страница "Bank"
  Если пользователь (нажимает кнопку) "AddMoney"
  Тогда открывается страница "Добавление денег"
  Если пользователь (указывает аккаунт) "One"
  И (добавляет) "123.0"
  Тогда (появляется сообщение) "Account: One Balance:123.0"

  @addMoneyWrongAcc
  Сценарий: Несуществующий аккаунт
    Когда пользователь переходит на страницу "http://localhost:8080" по ссылке
    Тогда открывается страница "Bank"
    Если пользователь (нажимает кнопку) "AddMoney"
    Тогда открывается страница "Добавление денег"
    Если пользователь (указывает аккаунт) "qweasd"
    И (добавляет) "123.0"
    Тогда (появляется сообщение) "There is no qweasd account yet!"

  @addMoneyWrongSum
  Сценарий: Неправильный формат суммы
    Когда пользователь переходит на страницу "http://localhost:8080" по ссылке
    Тогда открывается страница "Bank"
    Если пользователь (нажимает кнопку) "AddMoney"
    Тогда открывается страница "Добавление денег"
    Если пользователь (указывает аккаунт) "One"
    И (добавляет) "wersdf"
    Тогда (появляется сообщение) "Please, input sum in format: 123.3"

  @addMoneySumWithComma
  Сценарий: Неправильный формат суммы
    Когда пользователь переходит на страницу "http://localhost:8080" по ссылке
    Тогда открывается страница "Bank"
    Если пользователь (нажимает кнопку) "AddMoney"
    Тогда открывается страница "Добавление денег"
    Если пользователь (указывает аккаунт) "One"
    И (добавляет) "10,5"
    Тогда (появляется сообщение) "Please, input sum in format: 123.3"