SUMMARY          = "Recipe for adding ntpd to busybox"
LICENSE          = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILESEXTRAPATHS:prepend:="${THISDIR}/${PN}:"

# Use config fragmentation to replace default config values
SRC_URI:append = "          \
    file://enable-ntpd.cfg  \
    file://ntp.conf         \
"

# Install the config file
do_install:append() {
    install -d ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/ntp.conf ${D}${sysconfdir}/ntp.conf
}

# Add the config file to the package
FILES_${PN} += "${sysconfdir}/ntp.conf"

