{ pkgs, ... }: {
  packages = with pkgs; [
    git
    python310Packages.black
    nodePackages.pyright
  ];

  languages = {
    nix.enable = true;
    python.enable = true;
    haskell.enable = true;
    clojure.enable = true;
  };

  scripts.clj-dev.exec = ''
    cd clojure
    zellij -l layout.kdl
  '';
}
