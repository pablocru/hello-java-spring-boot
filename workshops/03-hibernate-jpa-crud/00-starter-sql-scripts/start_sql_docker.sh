#!/bin/bash

run_docker() {
  local LOCAL_PORT="${1:-3306}"
  local IMAGE_NAME="hibernate-mysql"

  docker run\
    --name $IMAGE_NAME\
    -p $LOCAL_PORT:3306\
    -e MYSQL_ROOT_PASSWORD=root\
    -v $(pwd)/src/:/docker-entrypoint-initdb.d/\
    mysql:lts
}

# ----------------------------------------------------------------------------------------

echo
run_docker
echo
