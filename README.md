# Fefu Bureau ("Бюро ДВФУ")
Бюро ДВФУ - это сервис который даёт каждому легкий доступ к информации о сотрудниках и преподавателях ДВФУ.
# Цели нашего проекта:
  * Основной целью нашего проекта является создание полного списка работников ДВФУ с информацией о том где их можно найти и как с ними можно связаться.
  * Мы хотим дать возможность легко находить любого сотрудника ДВФУ, упростить поиски преподавателей с мобильных устройств. 
    Это облегчит жизнь как первокурсникам, так и преподавателям со студентами, которые учатся в ДВФУ не первый год.
  * Мы считаем что всякая информация по своей природе не может кому либо принадлежать и должна быть общедоступна. 
    Поэтому мы собираемся дать каждому пользователю нашего приложения возможность добавлять и изменять сведения о людях имеющих отношение к ДВФУ.
## Структура нашего сервиса:
  * **Клиентское мобильное приложение** для пользователей со следующими возможностями:
    - Искать и просматривать контакты состоящие из ФИО, должности почты, номера, местоположения работников ДВФУ
    - Предлагать для всех новые контакты, изменения контактов, удаление контактов
    - Работа на мобильных Android устройствах 
  * **Управляющее десктопное приложение** для администрирования общей базы данных с возможностями:
    - Искать и просматривать контакты состоящие из ФИО, должности почты, номера, местоположения работников ДВФУ
    - Принимать и отклонять предложения от клиентского приложения
    - Добавлять, удалять, изменять новые контакты для всех
    - Поддержка Windows 10
  * **Парсер** первоначального набора данных:
    - Находит контакты на статических html страницах
    - Сохраняет их в специальный DSL
### Текущие задачи проекта:
  1. Выявить как можно больше контактов с помощью парсера.
  2. Сделать управляющее десктопное приложение (WPF (XAML + C#) UI, C#&C++ core) с возможностью принимать и не принимать предложенния с мобильных устройств.
  3. Добавить поддержку нашего DSL в управляющее приложение.
  4. Необходимо реализовать клиентское приложение для мобильных с помощью Android Studio, используя язык программирования Java.
  5. Работа с дизайном мобильного приложения. Расположение иконок/кнопок/текста.
  6. Добавить поддержку нашего DSL в клиентское приложение.
  7. Возможность предлагать новые контакты, изменения контактов, удаление контактов из мобильного приложения.
  8. Механизм обновления списка контактов по сети.
  9. Разместить мобильное приложение в Play Market (25$)
### Уже решенные задачи:
  1. Разработать своей DSL для хранения контактов.
  2. Скачать первоначальный датасет (все страницы сайта двфу без изображений, без css и js скриптов), 8гб
  3. Написать парсер (Python) находящий контакты.
#### Участники проекта:
  1. Даниил Демидко - Программист
  8. Вадим Шипков - Программист
  4. Андрей Сергеев - Разработчик
  5. Стас Ивановский - Разработчик
  2. Антон Аланаев
  3. Елизавета Лось
  6. Виктор Балун
  7. Артем Егоров
