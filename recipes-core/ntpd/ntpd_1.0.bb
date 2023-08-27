SUMMARY             = "Install custom ntpd init script"
LICENSE             = "MIT"
LIC_FILES_CHKSUM    = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PR                  = "r0"

# Define needed files
SRC_URI = "         \
    file://ntpd     \
    file://ntp.conf \
"

# Install the init script and config file
do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rc3.d
    install -d ${D}${sysconfdir}/rc4.d
    install -d ${D}${sysconfdir}/rc5.d
    install -m 0755 ${WORKDIR}/ntpd ${D}${sysconfdir}/init.d/
    install -m 0644 ${WORKDIR}/ntp.conf ${D}${sysconfdir}/ntp.conf
    ln -sf ../init.d/ntpd ${D}${sysconfdir}/rc3.d/S99ntpd
    ln -sf ../init.d/ntpd ${D}${sysconfdir}/rc4.d/S99ntpd
    ln -sf ../init.d/ntpd ${D}${sysconfdir}/rc5.d/S99ntpd
}

# Add the config file to the package
FILES_${PN} += "                \
    ${sysconfdir}/init.d/ntpd   \
    ${sysconfdir}/ntp.conf      \
"