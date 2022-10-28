BASE_URL?=http://localhost:8080/demo
SHELL:=/usr/bin/bash

curl:=curl -w "\n" -Ss
post:=$(curl) -X POST
json:=$(curl) -H "Content-Type: application/json"

hello:
	$(curl) $(BASE_URL)/hello
	$(curl) $(BASE_URL)/hello/{env,artifact}
