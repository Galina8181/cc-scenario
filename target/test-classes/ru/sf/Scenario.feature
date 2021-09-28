#позитивный сценарий

Feature: Find goods
  Scenario: choose good
    Given url of shop 'https://blackberryrussia.ru'
    When search good 'Магнитный держатель в автомобиль'
    Then click on first image


# негативный сценарий
   Scenario: choose absent good
     Given url of shop 'https://blackberryrussia.ru'
     When search good 'Пицца'
     Then assert that user got message 'ничего не найдено'