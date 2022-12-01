{ pkgs, ... }: {
  packages = with pkgs; [
    git
  ];

  languages.nix.enable = true;
  languages.python.enable = true;
}
