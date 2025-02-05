#!/bin/bash

# This script is used to build the archive of the project

set -euo pipefail

bazelisk build //google/cloud/bigquery/datatransfer/v1/...

TMP_OUTPUT_DIR=/tmp/datatransfer_output
REPO_OUTPUT_DIR=$(pwd)/compiled

rm -rf ${TMP_OUTPUT_DIR}
rm -rf ${REPO_OUTPUT_DIR}
mkdir -p ${TMP_OUTPUT_DIR}
mkdir -p ${REPO_OUTPUT_DIR}

tar \
  -xvf \
  bazel-bin/google/cloud/bigquery/datatransfer/v1/google-cloud-bigquery-datatransfer-v1-java.tar.gz \
  --directory \
  ${TMP_OUTPUT_DIR}

cd ${TMP_OUTPUT_DIR}/google-cloud-bigquery-datatransfer-v1-java/
cp -r ./* "${REPO_OUTPUT_DIR}"

rm -rf ${TMP_OUTPUT_DIR}