SUMMARY             = "Recipe for adding ntpd to busybox"
LICENSE             = "MIT"
LIC_FILES_CHKSUM    = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PR                  = "r0"

FILESEXTRAPATHS:prepend:="${THISDIR}/${PN}:"

# Use config fragmentation to replace default config values
SRC_URI:append = "          \
    file://enable-ntpd.cfg  \
"

# Install the config file
do_install:append() {
    install -d ${D}${sysconfdir}
}
