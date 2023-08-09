SUMMARY = "Install developer SSH key"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://id_ed25519.pub"

S = "${WORKDIR}"

do_install() {
    install -d ${D}/etc/ssh/
    install -m 0600 ${S}/id_ed25519.pub ${D}/etc/ssh/authorized_keys
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
FILES_${PN} += "/etc/ssh/authorized_keys"
