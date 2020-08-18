# local_root_example

The problem:

- Leiningen is told (via `lein-tools-deps`) that it should use tools.deps for dependency resolution
- The top level `deps.edn` includes `core-lib` as a `:local/root` dependency
- When I ask tools.deps (`clj -Spath`) to print the classpath it prints `.../core-lib/src`
- However Leiningen does not (`lein classpath`)