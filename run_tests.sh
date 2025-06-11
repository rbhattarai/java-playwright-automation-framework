#!/bin/bash

# Usage: ./run_tests.sh [env] [tag] [role]

ENV=${1:-TEST1}
TAG=${2:-@SmokeTest}
ROLE=${3:-admin}

echo "Running tests for environment: $ENV, tag: $TAG, role: $ROLE"

mvn clean test \
  -Denv=$ENV \
  -Dtest.environment=$ENV \
  -Dapp.url=$(mvn help:evaluate -Dexpression=app.url -q -DforceStdout -P $ENV) \
  -Dcert.role=$ROLE \
  -Dcucumber.options="--tags $TAG"

