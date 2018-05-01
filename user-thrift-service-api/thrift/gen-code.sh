#!/usr/bin/env bash


#docker run -v "$PWD/../:/data" thrift thrift -o /data/src/main/java --gen java /data/thrift/user_service.thrift


thrift --gen java -out ../src/main/java user_service.thrift