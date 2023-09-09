SUMMARY             = "Recipe for adding libconf library"
LICENSE             = "MIT"
LIC_FILES_CHKSUM    = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PR                  = "r0"

# Define the git repository and commit hash
SRC_URI = "git://github.com/shypard/libconf.git;branch=meson;protocol=https"
SRCREV  = "0e51c5c75da02d80dd4596e2a7bfa2873b99ba6b"

# Include meson buildsystem
inherit meson pkgconfig

# Switch to the git directory
S = "${WORKDIR}/git"

# Add the cmocka dependency
DEPENDS += "cmocka"
