#!/usr/bin/env bash

#docker run -v "$PWD/../:/data" thrift thrift -o /data --gen py /data/thrift/message.thrift

thrift --gen py -out ../ message.thrift

thrift --gen java -out ../../message-thrift-service-api/src/main/java message.thrift