{
  pkgs,
  uiuapkg,
  ...
}: {
  packages = with pkgs; [
    git
    python310Packages.black
    nodePackages.pyright
    uiuapkg.packages.x86_64-linux.default
  ];

  languages = {
    nix.enable = true;
    python.enable = true;
    # haskell.enable = true;
    clojure.enable = true;
  };

  scripts.clj-dev.exec = ''
    cd clojure
    zellij -l layout.kdl
  '';
}
