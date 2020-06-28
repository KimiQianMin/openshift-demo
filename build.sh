#!/usr/bin/env bash

mvn clean package

docker build --file=Dockerfile --tag=docker-demo:1.0.3 --rm=true .