#!/bin/bash

run_docker() {
  local CONTAINER_IMAGE="mysql:lts"
  local CONTAINER_NAME="mysql-spring-boot"
  local LOCAL_PORT="${1:-3306}"

  docker run\
    --name $CONTAINER_NAME\
    -p $LOCAL_PORT:3306\
    -e MYSQL_ROOT_PASSWORD=root\
    -v $(pwd)/:/docker-entrypoint-initdb.d/\
    $CONTAINER_IMAGE
}

# ----------------------------------------------------------------------------------------

echo
run_docker $1
echo
