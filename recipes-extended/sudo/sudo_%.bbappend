SUMMARY = "Appends sudo recipe to add sudo access for USER_NAME"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

# Define the user name to add sudo access for
USER_NAME ?= "shypard"

do_install:append () {
    echo "${USER_NAME} ALL=(ALL) ALL" > "${D}${sysconfdir}/sudoers.d/0001_${USER_NAME}"
}

FILES_${PN} += " ${sysconfdir}/sudoers.d/0001_${USER_NAME}"