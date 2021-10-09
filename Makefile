install: #очищение результатов предыдущей сборки и запуск новой сборки
	./gradlew clean install

run-dist: #запуск исполняемого файла
	./build/install/app/bin/app

check-update: #проверка обновлений зависимостей и плагинов gradle
	./gradlew dependencyUpdates

lint: #выполняет проверку стиля кодирования
	./gradlew checkstyleMain

build: #выполняет сборку проекта
	./gradlew clean build

.PHONY: build
