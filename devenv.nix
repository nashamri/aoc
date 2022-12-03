{ pkgs, ... }: {
  packages = with pkgs; [
    git
  ];

  languages = {
    nix.enable = true;
    python.enable = true;
    haskell.enable = true;
    clojure.enable = true;
  };
}
