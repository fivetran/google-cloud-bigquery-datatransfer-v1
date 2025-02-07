# google-cloud-bigquery-datatransfer-v1

Contains partial copy of googleapis/googleapis with patch, compilation script and generated code

## Repository Structure

### google, gapic

`google` and `gapic` folders is a partial copy of the <https://github.com/googleapis/googleapis> repository.

Following files were copied from the <https://github.com/cmm08/bq-dts-partner-clients>:

`google/cloud/bigquery/datatransfer/v1/datatransfer.proto`
`google/cloud/bigquery/datatransfer/v1/datasource.proto`
`google/cloud/bigquery/datatransfer/v1/transfer.proto`

They have the following differences from the original <https://github.com/googleapis/googleapis>:

1. They are old (initially were copied from googleapis in 2019)
2. The `datasource.proto` file was [removed from upstream](https://github.com/googleapis/googleapis/commit/e47fdd266542386e5e7346697f90476e96dc7ee8)
3. The `transfer.proto` file has additional fields in the `message TransferConfig` interface: `string partner_token`, `google.protobuf.Struct partner_connection_info`. These fields were never present in upstream.

### compiled

`compiled` folder contains java files as the result of proto files compilation.

## Proto compiling

Run `./update_java_rules.sh` script. This script will compile proto files and put them into `compiled` folder. The changes from that folder have to be added to the version control.

## Repository tags

Different tags in the repository represent the different version of the source code. Right now it has the followong tags:

`25.3` - repository uses bazel protobuf package of version 25.3 (generated classes compatible with the protobuf v3)

`26.0` - 26.0 (v4)

## Usage

This repository is used as external dependency in the <https://github.com/fivetran/engineering/>. Look at `com_google_cloud_google_cloud_bigquerydatatransfer`.
These code can't be integrated in monorepo directly for now as the [GAPIC integration for bzlmod](https://github.com/bazelbuild/bazel-central-registry/blob/main/modules/googleapis/0.0.0-20240819-fe8ba054a/patches/add_module_bazel.patch#L26) is not ready in googleapis module for now.
